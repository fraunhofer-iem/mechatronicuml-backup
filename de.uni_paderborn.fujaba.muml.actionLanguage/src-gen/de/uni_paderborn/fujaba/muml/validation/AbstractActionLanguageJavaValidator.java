package de.uni_paderborn.fujaba.muml.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractActionLanguageJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/actionlanguage/0.2.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://ns.storydriven.org/sdm/expressions/0.1.0"));
		return result;
	}

}

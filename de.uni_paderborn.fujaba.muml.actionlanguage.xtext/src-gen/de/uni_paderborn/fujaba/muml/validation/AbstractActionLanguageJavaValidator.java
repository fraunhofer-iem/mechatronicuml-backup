package de.uni_paderborn.fujaba.muml.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractActionLanguageJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/actionlanguage/0.3.16"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/0.3.1"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/model/behavior/0.3.17"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/common/0.3.1"));
		return result;
	}

}

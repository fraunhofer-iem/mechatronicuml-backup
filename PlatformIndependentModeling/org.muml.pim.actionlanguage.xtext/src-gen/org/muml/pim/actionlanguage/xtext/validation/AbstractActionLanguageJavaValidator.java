/*
 * generated by Xtext
 */
package org.muml.pim.actionlanguage.xtext.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractActionLanguageJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/0.3.1"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.fujaba.de/muml/actionlanguage/0.4.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/behavior/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.muml.org/pim/valuetype/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.storydriven.org/core/expressions/common/0.3.1"));
		return result;
	}

}

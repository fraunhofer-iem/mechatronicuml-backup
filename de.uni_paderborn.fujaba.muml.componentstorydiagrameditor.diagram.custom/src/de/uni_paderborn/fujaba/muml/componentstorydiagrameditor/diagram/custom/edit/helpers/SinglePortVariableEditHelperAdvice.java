package de.uni_paderborn.fujaba.muml.componentstorydiagrameditor.diagram.custom.edit.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.PartVariable;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.SinglePortVariable;

public class SinglePortVariableEditHelperAdvice extends AbstractEditHelperAdvice{

	@Override
	protected ICommand getAfterConfigureCommand(ConfigureRequest request) {
		SinglePortVariable singlePortVariable = (SinglePortVariable) request.getElementToConfigure();
		MultiPortVariable multiPortVariable = singlePortVariable.getMultiPortVariable();
		if (multiPortVariable != null) {
			EObject container = multiPortVariable.eContainer();
			if (ComponentstorypatternPackage.Literals.COMPONENT_VARIABLE.isSuperTypeOf(container.eClass())) {
				ComponentVariable componentVariable = (ComponentVariable) container;
				componentVariable.getPortVariables().add(singlePortVariable);
			} else if (ComponentstorypatternPackage.Literals.PART_VARIABLE.isSuperTypeOf(container.eClass())) {
				PartVariable partVariable = (PartVariable) container;
				partVariable.getPortVariables().add(singlePortVariable);
			}
		}
				
		return super.getAfterConfigureCommand(request);
	}

	
}

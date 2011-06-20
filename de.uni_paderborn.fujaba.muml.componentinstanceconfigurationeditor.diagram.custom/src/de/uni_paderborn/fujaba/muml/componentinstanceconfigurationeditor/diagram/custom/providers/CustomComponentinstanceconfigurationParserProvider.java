package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.providers;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

import de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlParserProvider;

public class CustomComponentinstanceconfigurationParserProvider extends
		MumlParserProvider {

	private de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomComponentInstanceLabelExpressionLabelParser5002 componentInstanceLabel_5002Parser;

	public CustomComponentinstanceconfigurationParserProvider() {
	}

	@Override
	public boolean provides(IOperation operation) {
		// TODO Auto-generated method stub
		return super.provides(operation);
	}



	private IParser getComponentInstanceLabel_5002Parser() {
		if (componentInstanceLabel_5002Parser == null) {
			componentInstanceLabel_5002Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomComponentInstanceLabelExpressionLabelParser5002();
		}
		return componentInstanceLabel_5002Parser;
	}

	private de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomComponentInstanceLabelExpressionLabelParser5001 componentInstanceLabel_5001Parser;

	private IParser getComponentInstanceLabel_5001Parser() {
		if (componentInstanceLabel_5001Parser == null) {
			componentInstanceLabel_5001Parser = new de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.custom.parsers.CustomComponentInstanceLabelExpressionLabelParser5001();
		}
		return componentInstanceLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getComponentInstanceLabel_5002Parser();
		case de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getComponentInstanceLabel_5001Parser();
		}
		return null;
	}

}

package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import java.util.HashMap;

import org.eclipse.emf.ecore.EParameter;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;

public abstract class CommonEventModifyPage extends CommonModifyPage {

	protected Text valueText = null;

	protected ListViewer parameterLViewer = null;

	protected HashMap<EParameter, String> parameterValuesHashMap = null;
	protected EParameter selectedEParameter = null;

	protected CommonEventModifyPage(String pageName) {
		super(pageName);
	}

	@Override
	public void setVisible(boolean visible) {

		if (visible) {
			setPageComplete(false);
			parameterValuesHashMap = new HashMap<EParameter, String>();
			parameterLViewer.setInput(getSelectedMessageType());
		}

		super.setVisible(visible);
	}

	protected void setValue() {
		if (selectedEParameter != null && !valueText.getText().equals("")) {

			parameterValuesHashMap.put(selectedEParameter, valueText.getText());
		}
	}

	protected class ParametersContentProvider implements
			IStructuredContentProvider {
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object parent) {
			return getParametersFromMessageType(parent);
		}

		public void dispose() {
		}

	}

	protected MessageType getSelectedMessageType() {
		return null;
	}

	protected boolean allParametersHaveValues() {

		MessageType messageType = getSelectedMessageType();

		if (parameterValuesHashMap.size() == messageType
				.getContainedParameters().size()) {
			return true;
		}

		return false;
	}
}

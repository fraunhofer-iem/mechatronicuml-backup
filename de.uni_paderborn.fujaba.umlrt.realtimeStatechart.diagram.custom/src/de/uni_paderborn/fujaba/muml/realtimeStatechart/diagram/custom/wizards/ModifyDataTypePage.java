package de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.wizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.custom.commands.DataTypeCreateCommand;
import de.uni_paderborn.fujaba.muml.realtimeStatechart.diagram.providers.UmlrtElementTypes;

public class ModifyDataTypePage extends WizardPage {

	protected Text dataTypeNameText = null;
	protected Text instanceTypeNameText = null;

	protected ListViewer dataTypeLViewer = null;

	public ModifyDataTypePage(String pageName) {
		super(pageName);
	}

	@Override
	public void setVisible(boolean visible) {

		if (visible) {
			setPageComplete(true);
		}

		super.setVisible(visible);
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite main = new Composite(parent, SWT.NONE);
		FormLayout layout = new FormLayout();
		main.setLayout(layout);
		main.setFont(parent.getFont());

		setErrorMessage(null);
		setMessage(null);
		setControl(main);

		FormData parameterNameFormData1 = new FormData();
		parameterNameFormData1.left = new FormAttachment(0, 0);
		parameterNameFormData1.right = new FormAttachment(20, 0);
		parameterNameFormData1.top = new FormAttachment(0, 0);
		parameterNameFormData1.bottom = new FormAttachment(10, 0);
		Label pNameLabel = new Label(main, SWT.NONE);
		pNameLabel.setText("type name:  ");
		pNameLabel.setLayoutData(parameterNameFormData1);

		FormData parameterNameFormData2 = new FormData();
		parameterNameFormData2.left = new FormAttachment(0, 0);
		parameterNameFormData2.right = new FormAttachment(20, 0);
		parameterNameFormData2.top = new FormAttachment(10, 0);
		parameterNameFormData2.bottom = new FormAttachment(20, 0);
		dataTypeNameText = new Text(main, SWT.SINGLE | SWT.BORDER);
		dataTypeNameText.setLayoutData(parameterNameFormData2);

		FormData parameterTypeFormData1 = new FormData();
		parameterTypeFormData1.left = new FormAttachment(0, 0);
		parameterTypeFormData1.right = new FormAttachment(20, 0);
		parameterTypeFormData1.top = new FormAttachment(20, 0);
		parameterTypeFormData1.bottom = new FormAttachment(30, 0);
		Label parameterTypeLabel = new Label(main, SWT.NONE);
		parameterTypeLabel.setText("instance type name:  ");
		parameterTypeLabel.setLayoutData(parameterTypeFormData1);

		FormData parameterTypeFormData2 = new FormData();
		parameterTypeFormData2.left = new FormAttachment(0, 0);
		parameterTypeFormData2.right = new FormAttachment(20, 0);
		parameterTypeFormData2.top = new FormAttachment(30, 0);
		parameterTypeFormData2.bottom = new FormAttachment(40, 0);
		instanceTypeNameText = new Text(main, SWT.SINGLE | SWT.BORDER);
		instanceTypeNameText.setLayoutData(parameterTypeFormData2);

		FormData exitingParameterFormData = new FormData();
		exitingParameterFormData.left = new FormAttachment(40, 0);
		exitingParameterFormData.right = new FormAttachment(80, 0);
		exitingParameterFormData.top = new FormAttachment(0, 0);
		exitingParameterFormData.bottom = new FormAttachment(20, 0);
		Label exitingParameterLabel = new Label(main, SWT.NONE);
		exitingParameterLabel.setText("Existing data types of \n"
				+ "realtime statechart: '"
				+ ((ModifyDataTypeWizard) getWizard()).getRealtimeStatechart()
						.getName() + "'");
		exitingParameterLabel.setLayoutData(exitingParameterFormData);

		FormData parameterLViewerFormData = new FormData();
		parameterLViewerFormData.left = new FormAttachment(40, 0);
		parameterLViewerFormData.right = new FormAttachment(90, 0);
		parameterLViewerFormData.top = new FormAttachment(20, 0);
		parameterLViewerFormData.bottom = new FormAttachment(90, 0);
		Composite parametersViewerComposite = new Composite(main, SWT.NONE);
		parametersViewerComposite.setLayout(new FillLayout());
		parametersViewerComposite.setLayoutData(parameterLViewerFormData);
		dataTypeLViewer = new ListViewer(parametersViewerComposite);
		dataTypeLViewer.setContentProvider(new DataTypeContentProvider());
		dataTypeLViewer.setInput(((ModifyDataTypeWizard) getWizard())
				.getRealtimeStatechart());

		FormData createButtonFormData = new FormData();
		createButtonFormData.left = new FormAttachment(0, 0);
		createButtonFormData.right = new FormAttachment(15, 0);
		createButtonFormData.top = new FormAttachment(80, 0);
		createButtonFormData.bottom = new FormAttachment(90, 0);
		Button createButton = new Button(main, SWT.PUSH);
		createButton.setText("Create Parameter");
		createButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				handleCreateDataTypeEvent();
				dataTypeLViewer.refresh();

			}
		});
		createButton.setLayoutData(createButtonFormData);

		FormData deleteButtonFormData = new FormData();
		deleteButtonFormData.left = new FormAttachment(20, 0);
		deleteButtonFormData.right = new FormAttachment(35, 0);
		deleteButtonFormData.top = new FormAttachment(80, 0);
		deleteButtonFormData.bottom = new FormAttachment(90, 0);
		Button deleteButton = new Button(main, SWT.PUSH);
		deleteButton.setText("Delete Parameter");
		deleteButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				handleDeleteDataTypeEvent();
				dataTypeLViewer.refresh();
			}
		});
		deleteButton.setLayoutData(deleteButtonFormData);

	}

	private void handleCreateDataTypeEvent() {

		if (!dataTypeNameText.getText().equals("")
				&& !instanceTypeNameText.getText().equals("")) {
			CreateElementRequest request = new CreateElementRequest(
					((ModifyDataTypeWizard) getWizard())
							.getRealtimeStatechart(),
					UmlrtElementTypes.DoEvent_3002);

			DataTypeCreateCommand command = new DataTypeCreateCommand(request,
					this.dataTypeNameText.getText(),
					this.instanceTypeNameText.getText());

			new ICommandProxy(command).execute();
		}
	}

	private void handleDeleteDataTypeEvent() {

		ISelection selection = dataTypeLViewer.getSelection();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;

			for (Object obj : sel.toList()) {

				if (obj != null) {

					Iterator<EDataType> iter = getDataTypes().iterator();
					while (iter.hasNext()) {
						EDataType tmp = iter.next();
						if (getFullDataType(tmp).equals(obj.toString())) {
							deleteObject(tmp);
							break;
						}
					}
				}
			}
		}
	}

	public Object[] getDataTypes(Object object) {
		if (object instanceof FujabaRealtimeStatechart) {
			ArrayList<String> list = new ArrayList<String>();

			if (getDataTypes() != null) {
				Iterator<EDataType> iter = getDataTypes().iterator();
				while (iter.hasNext()) {

					list.add(getFullDataType(iter.next()));
				}
				return list.toArray();
			}
		}

		return new Object[0];
	}

	class DataTypeContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object parent) {
			return getDataTypes(parent);
		}

		public void dispose() {
		}

	}

	private String getFullDataType(EDataType dataType) {
		return dataType.getName() + ": [" + dataType.getInstanceTypeName()
				+ "]";
	}

	protected void deleteObject(EObject obj) {
		new ICommandProxy(new DestroyElementCommand(new DestroyElementRequest(
				obj, false))).execute();
	}

	private List<EDataType> getDataTypes() {

		FujabaRealtimeStatechart statechart = ((ModifyParameterWizard) getWizard())
				.getRealtimeStatechart();

		RootNode root = (RootNode) statechart.eContainer();

		return root.getEcoreDataTypes();
	}
}

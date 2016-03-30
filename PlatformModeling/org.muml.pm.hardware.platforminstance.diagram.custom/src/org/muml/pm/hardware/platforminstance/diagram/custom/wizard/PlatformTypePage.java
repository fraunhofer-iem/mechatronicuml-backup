package org.muml.pm.hardware.platforminstance.diagram.custom.wizard;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TreeColumn;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPlatformPart;
import org.muml.pm.hardware.hwplatform.PlatformPart;
import org.muml.pm.hardware.hwplatform.ResourcePart;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

/**
 * Class representing the first page of the wizard
 */

public class PlatformTypePage extends WizardPage implements Listener {

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";

	// widgets on this page
	private TreeViewer viewer;
	private Collection<EObject> availableHWPlatforms = null;

	private HWPlatform selectedPlatform;
	private HashMap<PlatformPart, Integer> currentCardinality;

	private Composite composite;
	private List list;

	/**
	 * Constructor for PlatformTypeSelectPage.
	 */
	public PlatformTypePage(Collection<EObject> availableHWPlatforms) {
		this();
		this.availableHWPlatforms = availableHWPlatforms;

	}

	public PlatformTypePage() {
		super("Page1");
		setTitle("Platform Type");
		setDescription("Select the Hardware Platform to initialise:");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		if (availableHWPlatforms == null) {
			initContent();
		} else {
			selectedPlatform = (HWPlatform) availableHWPlatforms.toArray()[0];
		}
		// create the composite to hold the widgets
		composite = new Composite(parent, SWT.NULL);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;

		composite.setLayout(gl);

		// create the widgets. If the appearance of the widget is different from
		// the default,
		// create a GridData for it to set the alignment and define how much
		// space it will occupy
		// The HWPlatform to initialize
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.widthHint = 100;
		gridData.heightHint = 300;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;

		FillLayout filllayout = new FillLayout();
		filllayout.type = SWT.FILL;

		Group group1 = new Group(composite, SWT.NONE);
		group1.setText("Platform Type:");
		group1.setLayoutData(gridData);
		group1.setLayout(filllayout);

		list = new List(group1, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.LAST_LINE_SELECTION);
		list.setLayoutData(gridData);
		for (Object item : availableHWPlatforms) {
			if (org.muml.pm.hardware.hwplatform.HwplatformPackage.Literals.HW_PLATFORM
					.isSuperTypeOf(((EObject) item).eClass())) {
				list.add(((HWPlatform) item).getName());

			}
		}
		Rectangle clientArea = composite.getClientArea();
		list.setBounds(clientArea.x, clientArea.y, 100, 100);
		list.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				int[] selection = list.getSelectionIndices();
				selectedPlatform = (HWPlatform) availableHWPlatforms.toArray()[selection[0]];
				viewer.setInput(getEmbeddedPlatformPart(selectedPlatform));

			}
		});
		list.pack();

		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.widthHint = 300;
		gridData.heightHint = 300;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;

		Group group2 = new Group(composite, SWT.NONE);
		group2.setText("Instances:");
		group2.setLayoutData(gridData);
		group2.setLayout(filllayout);

		viewer = new TreeViewer(group2, SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);

		createColumns(viewer);
		viewer.setContentProvider(new HWPlatformContentProvider());

		setControl(composite);

		// set an initial Selection
		if (list.getItemCount() > 0) {
			list.select(0);
			list.showSelection();
			list.notifyListeners(SWT.Selection, null);
		}
	}

	private java.util.List<PlatformPart> getEmbeddedPlatformPart(HWPlatform platform) {
		currentCardinality = new HashMap<PlatformPart, Integer>();
		for (PlatformPart part : platform.getEmbeddedPlatformParts()) {
			currentCardinality.put(part, (int) part.getCardinality().getUpperBound().getValue());
		}
		return platform.getEmbeddedPlatformParts();
	}

	protected void saveDataToModel() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		WizardModel model = wizard.getModel();
		model.setSelectedHWPlatform(selectedPlatform);

		Dictionary<PlatformPart, Integer> config = model.getConfiguration();
		for (Entry<PlatformPart, Integer> entry : currentCardinality.entrySet()) {

			config.put(entry.getKey(), entry.getValue());
		}

	}

	private void initContent() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		HWPlatformInstanceConfiguration instanceConfiguration = wizard.getModel()
				.getSelectedHWPlatformInstanceConfiguration();
		HWPlatform hwPlatform = org.muml.pm.hardware.hwplatform.HwplatformFactory.eINSTANCE
				.createHWPlatform();
		availableHWPlatforms = ItemPropertyDescriptor.getReachableObjectsOfType(instanceConfiguration,
				hwPlatform.eClass());
	}

	// create the columns for the table
	private void createColumns(final TreeViewer viewer) {
		String[] titles = { "Platform Part:", "Multiplicity:", };
		int[] bounds = { 200, 50 };

		// first column is for the platform part's name
		TreeViewerColumn col1 = createTreeViewerColumn(titles[0], bounds[0]);
		col1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				PlatformPart p = (PlatformPart) element;
				String name = p.getName();
				String type = "";
				if (p instanceof HWPlatformPart && ((HWPlatformPart) p).getHwplatformType() != null) {
					type = ((HWPlatformPart) p).getHwplatformType().getName();
				}
				if (p instanceof ResourcePart && ((ResourcePart) p).getResourceType() != null) {
					type = ((ResourcePart) p).getResourceType().getName();
				}
				return name + ":" + type;
			}
		});

		// second column is for the multiplicity
		TreeViewerColumn col2 = createTreeViewerColumn(titles[1], bounds[1]);
		col2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				PlatformPart p = (PlatformPart) element;
				if (!currentCardinality.containsKey(p)) {
					currentCardinality.put(p, (int) p.getCardinality().getUpperBound().getValue());
				}
				return currentCardinality.get(p).toString();

			}

		});
		col2.setEditingSupport(new EditingSupport(viewer) {

			@Override
			protected void setValue(Object element, Object value) {
				// TODO Auto-generated method stub
				PlatformPart p = (PlatformPart) element;
				currentCardinality.put(p, Integer.parseInt(value.toString()));
				viewer.update(element, null);
			}

			@Override
			protected Object getValue(Object element) {
				PlatformPart p = (PlatformPart) element;
				return currentCardinality.get(p);
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				PlatformPart p = (PlatformPart) element;
				int range;
				String[] cardinality;
				if (p.getCardinality().getUpperBound().isInfinity()) {
					range = 1;
				} else {
					range = (int) ((int) p.getCardinality().getUpperBound().getValue()
							- p.getCardinality().getLowerBound().getValue()) + 1;
				}
				cardinality = new String[range];
				for (int i = range - 1; i >= 0; i--) {
					cardinality[i] = Integer.toString((int) (p.getCardinality().getLowerBound().getValue() + (i)));
				}

				return new ComboBoxCellEditor(viewer.getTree(), cardinality, SWT.READ_ONLY);
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}

		});

	}

	private TreeViewerColumn createTreeViewerColumn(String title, int bound) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(viewer, SWT.NONE);

		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	private class HWPlatformContentProvider implements ITreeContentProvider {

		public void dispose() {
			// TODO Auto-generated method stub

		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub

		}

		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof java.util.List<?>) {
				return ((java.util.List<?>) inputElement).toArray();
			}
			if (inputElement instanceof HWPlatform)
				return ((HWPlatform) inputElement).getEmbeddedPlatformParts().toArray();
			return new Object[0];
		}

		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof ResourcePart) {
				return new Object[0];
			}
			if (parentElement instanceof HWPlatformPart) {
				return ((HWPlatformPart) parentElement).getHwplatformType().getEmbeddedPlatformParts().toArray();
			}
			return new Object[0];
		}

		public Object getParent(Object element) {
			if (element instanceof ResourcePart) {
				return ((ResourcePart) element).getParentHWPlatform();
			}
			if (element instanceof HWPlatformPart) {
				return ((HWPlatformPart) element).getParentHWPlatform();
			}

			return null;
		}

		public boolean hasChildren(Object element) {
			if (element instanceof ResourcePart) {
				return false;
			}
			if (element instanceof HWPlatformPart) {
				return true;
			}
			return false;
		}

	}

}

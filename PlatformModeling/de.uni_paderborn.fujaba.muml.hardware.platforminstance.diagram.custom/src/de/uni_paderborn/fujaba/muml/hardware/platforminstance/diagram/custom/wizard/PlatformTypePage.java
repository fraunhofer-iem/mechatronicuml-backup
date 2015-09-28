package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;

/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

/**
 * Class representing the first page of the wizard
 */

public class PlatformTypePage extends WizardPage implements Listener {

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";

	// widgets on this page
	private TableViewer viewer;
	private Collection<EObject> availableHWPlatforms = null;
	protected Collection<EObject> followUpPlatforms = new ArrayList<EObject>();
	private boolean startPage = false;
	private HWPlatform selectedPlatform;
	private HashMap<PlatformPart, Integer> currentCardinality;

	/**
	 * Constructor for PlatformTypeSelectPage.
	 */
	public PlatformTypePage(Collection<EObject> availableHWPlatforms, boolean startPage) {
		super("Page1");
		this.startPage = startPage;
		this.availableHWPlatforms = availableHWPlatforms;
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
		final Composite composite = new Composite(parent, SWT.NULL);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		// gl.wrap = true;
		// gl.pack = true;
		// gl.justify = true;
		// gl.numColumns = ncol;
		composite.setLayout(gl);

		// create the widgets. If the appearance of the widget is different from
		// the default,
		// create a GridData for it to set the alignment and define how much
		// space it will occupy
		// gd.horizontalAlignment = GridData.BEGINNING;
		// The HWPlatform to initialize
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.widthHint = 300;
		gridData.heightHint = 300;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;

		FillLayout filllayout = new FillLayout();
		filllayout.type = SWT.FILL;

		Group group1 = new Group(composite, SWT.NONE);
		group1.setText("Platform Type:");
		group1.setLayoutData(gridData);
		group1.setLayout(filllayout);

		final List list = new List(group1, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		list.setLayoutData(gridData);
		for (Object item : availableHWPlatforms) {
			if (de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.Literals.HW_PLATFORM
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

		Group group2 = new Group(composite, SWT.NONE);
		group2.setText("Instances:");
		group2.setLayoutData(gridData);
		// group2.setLayout(filllayout);
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		group2.setLayout(tableColumnLayout);

		viewer = new TableViewer(group2, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		createColumns(composite, viewer, tableColumnLayout);
		viewer.setContentProvider(new ArrayContentProvider());
		final Table table = viewer.getTable();

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				for (EObject p : availableHWPlatforms) {
					if (p instanceof HWPlatformPart && currentCardinality.containsKey(p)
							&& currentCardinality.get(p) >= 1) {
						followUpPlatforms.add(((HWPlatformPart) p).getHwplatformType());
						// getNextPage();
						getWizard().getContainer().updateButtons();
					}
				}
				System.out.println("ww");

			}
		});

		// table.setLayoutData(gridData);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		// table.setBounds(clientArea.x + 120, clientArea.y + 120, 200, 400);
		table.pack();

		setControl(composite);
		// addListeners();
		// set an initial Selection
		list.select(0);
		list.showSelection();
		list.notifyListeners(SWT.Selection, null);
		table.notifyListeners(SWT.Selection, null);
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
		if (startPage) {
			model.setSelectedHWPlatform(selectedPlatform);

		}
		Dictionary<String, Integer> config = model.getConfiguration();
		for (Entry<PlatformPart, Integer> entry : currentCardinality.entrySet()) {

			config.put(entry.getKey().getName(), entry.getValue());
		}

	}

	private void initContent() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		HWPlatformInstanceConfiguration instanceConfiguration = wizard.getModel()
				.getSelectedHWPlatformInstanceConfiguration();
		HWPlatform hwPlatform = de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory.eINSTANCE
				.createHWPlatform();
		availableHWPlatforms = ItemPropertyDescriptor.getReachableObjectsOfType(instanceConfiguration,
				hwPlatform.eClass());
	}

	// create the columns for the table
	private void createColumns(final Composite parent, final TableViewer viewer, TableColumnLayout tableColumnLayout) {
		String[] titles = { "Platform Part:", "Multiplicity:", };
		int[] bounds = { 200, 50 };

		// first column is for the platform part's name
		TableViewerColumn col1 = createTableViewerColumn(titles[0], bounds[0], 0);
		col1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				PlatformPart p = (PlatformPart) element;
				return p.getName();
			}
		});
		tableColumnLayout.setColumnData(col1.getColumn(), new ColumnWeightData(70, 200, true));

		// second column is for the mulitpliciy
		TableViewerColumn col2 = createTableViewerColumn(titles[1], bounds[1], 1);
		col2.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				PlatformPart p = (PlatformPart) element;
				return currentCardinality.get(p).toString();
			}

		});
		tableColumnLayout.setColumnData(col2.getColumn(), new ColumnWeightData(30, 80, true));
		col2.setEditingSupport(new EditingSupport(viewer) {

			@Override
			protected void setValue(Object element, Object value) {
				// TODO Auto-generated method stub
				PlatformPart p = (PlatformPart) element;
				int positionInList = (Integer) value;
				currentCardinality.put(p, (int) (p.getCardinality().getLowerBound().getValue() + positionInList));

				viewer.update(element, null);
			//	viewer.getTable().notifyListeners(SWT.Selection, null);
			}

			@Override
			protected Object getValue(Object element) {
				PlatformPart p = (PlatformPart) element;
				return currentCardinality.get(p);
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				// TODO Auto-generated method stub
				PlatformPart p = (PlatformPart) element;
				int range = 0;
				String[] cardinality = null;
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

				return new ComboBoxCellEditor(viewer.getTable(), cardinality);
			}

			@Override
			protected boolean canEdit(Object element) {
				// TODO Auto-generated method stub
				return true;
			}

		});

		// viewer.getTable().notifyListeners(SWT.Selection, null);
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);

		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	protected boolean neddFurtherPage() {
		return !followUpPlatforms.isEmpty();
	}

	public Collection<EObject> getFollowUpPlatforms() {
		Collection<EObject> platforms = new ArrayList<EObject>();
		platforms.addAll(followUpPlatforms);
		followUpPlatforms.clear();
		return platforms;
	}

}

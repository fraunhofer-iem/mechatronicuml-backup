package de.uni_paderborn.fujaba.muml.hardware.platforminstance.diagram.custom.wizard;

/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

/**
 * Class representing the first page of the wizard
 */

public class PlatformTypePage extends WizardPage implements Listener {

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";

	// widgets on this page
	private TableViewer viewer;
	private Collection availableHWPlatforms = null;

	private HWPlatform selectedPlatform;
	private HashMap<PlatformPart, Integer> currentCardinality;

	/**
	 * Constructor for PlatformTypeSelectPage.
	 */
	public PlatformTypePage() {
		super("Page1");
		setTitle("Platform Type");
		setDescription("Select the Hardware Platform to initialise:");

	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

		initContent();
		// create the composite to hold the widgets
		final Composite composite = new Composite(parent, SWT.NULL);

		// create the desired layout for this wizard page
		RowLayout gl = new RowLayout();
		gl.wrap = true;
		gl.pack = true;
		gl.justify = true;
		int ncol = 2;
		// gl.numColumns = ncol;
		composite.setLayout(gl);

		// create the widgets. If the appearance of the widget is different from
		// the default,
		// create a GridData for it to set the alignment and define how much
		// space it will occupy
		// gd.horizontalAlignment = GridData.BEGINNING;
		// The HWPlatform to initialize
		Label label1 = new Label(composite, SWT.NONE);
		label1.setText("Platform Type:");

		final List list = new List(composite, SWT.BORDER | SWT.SINGLE
				| SWT.V_SCROLL);
		list.setLayoutData(new RowData(100, 150));
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

		viewer = new TableViewer(composite, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		createColumns(composite, viewer);
		viewer.setContentProvider(new ArrayContentProvider());
		final Table table = viewer.getTable();
		table.setLayoutData(new RowData(300, 200));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		// table.setBounds(clientArea.x + 120, clientArea.y + 120, 200, 400);
		setControl(composite);
		// addListeners();
	}

	private java.util.List<PlatformPart> getEmbeddedPlatformPart(
			HWPlatform platform) {
		currentCardinality = new HashMap<PlatformPart, Integer>();
		for (PlatformPart part : platform.getEmbeddedPlatformParts()) {
			currentCardinality.put(part, (int) part.getCardinality()
					.getLowerBound().getValue());
		}
		return platform.getEmbeddedPlatformParts();
	}

	protected void saveDataToModel() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		WizardModel model = wizard.getModel();
		model.setSelectedHWPlatform(selectedPlatform);
		Dictionary<String, Integer> config = model.getConfiguration();
		for (Entry<PlatformPart, Integer> entry : currentCardinality.entrySet()) {
			config.put(entry.getKey().getName(), entry.getValue());
		}

	}

	private void initContent() {
		PlatformInstanceWizard wizard = (PlatformInstanceWizard) getWizard();
		HWPlatformInstanceConfiguration instanceConfiguration = wizard
				.getModel().getSelectedHWPlatformInstanceConfiguration();
		HWPlatform hwPlatform = de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory.eINSTANCE
				.createHWPlatform();
		availableHWPlatforms = ItemPropertyDescriptor
				.getReachableObjectsOfType(instanceConfiguration,
						hwPlatform.eClass());
	}

	// create the columns for the table
	private void createColumns(final Composite parent, final TableViewer viewer) {
		String[] titles = { "Platform Part:", "Multiplicity:", };
		int[] bounds = { 200, 50 };

		// first column is for the platform part's name
		TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				PlatformPart p = (PlatformPart) element;
				return p.getName();
			}
		});

		// second column is for the mulitpliciy
		col = createTableViewerColumn(titles[1], bounds[1], 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				PlatformPart p = (PlatformPart) element;
				return currentCardinality.get(p).toString();
			}

		});
		col.setEditingSupport(new EditingSupport(viewer) {

			@Override
			protected void setValue(Object element, Object value) {
				// TODO Auto-generated method stub
				PlatformPart p = (PlatformPart) element;
				int positionInList = (Integer) value;
				currentCardinality.put(p, (int) (p.getCardinality()
						.getLowerBound().getValue() + positionInList));
				viewer.update(element, null);
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
					range = (int) ((int) p.getCardinality().getUpperBound()
							.getValue() - p.getCardinality().getLowerBound()
							.getValue()) + 1;
				}
				cardinality = new String[range];
				for (int i = 0; i < range; i++) {
					cardinality[i] = Integer.toString((int) (p.getCardinality()
							.getLowerBound().getValue() + i));
				}

				return new ComboBoxCellEditor(viewer.getTable(), cardinality);
			}

			@Override
			protected boolean canEdit(Object element) {
				// TODO Auto-generated method stub
				return true;
			}
		});

	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
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
}

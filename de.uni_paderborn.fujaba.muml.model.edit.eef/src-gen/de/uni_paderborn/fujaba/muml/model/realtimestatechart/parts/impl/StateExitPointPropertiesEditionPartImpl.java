/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl;

// Start of user code for imports





import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class StateExitPointPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StateExitPointPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable outgoingTransitions;
	protected List<ViewerFilter> outgoingTransitionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingTransitionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable incomingTransitions;
	protected List<ViewerFilter> incomingTransitionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingTransitionsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer statechart;
	protected EObjectFlatComboViewer state;
	protected EObjectFlatComboViewer exitPoint;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StateExitPointPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence stateExitPointStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = stateExitPointStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.name);
		propertiesStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions);
		propertiesStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions);
		propertiesStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart);
		propertiesStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.state);
		propertiesStep.addStep(RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint);
		
		
		composer = new PartComposer(stateExitPointStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.name) {
					return createNameText(parent);
				}
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions) {
					return createOutgoingTransitionsAdvancedReferencesTable(parent);
				}
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions) {
					return createIncomingTransitionsAdvancedReferencesTable(parent);
				}
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart) {
					return createStatechartFlatComboViewer(parent);
				}
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.state) {
					return createStateFlatComboViewer(parent);
				}
				if (key == RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint) {
					return createExitPointFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(RealtimestatechartMessages.StateExitPointPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.StateExitPointPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.name, RealtimestatechartViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, RealtimestatechartViewsRepository.StateExitPoint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.StateExitPoint.Properties.name, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOutgoingTransitionsAdvancedReferencesTable(Composite parent) {
		this.outgoingTransitions = new ReferencesTable(RealtimestatechartMessages.StateExitPointPropertiesEditionPart_OutgoingTransitionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addOutgoingTransitions(); }
			public void handleEdit(EObject element) { editOutgoingTransitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoingTransitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoingTransitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoingTransitions.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions, RealtimestatechartViewsRepository.SWT_KIND));
		this.outgoingTransitions.createControls(parent);
		this.outgoingTransitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingTransitionsData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingTransitionsData.horizontalSpan = 3;
		this.outgoingTransitions.setLayoutData(outgoingTransitionsData);
		this.outgoingTransitions.disableMove();
		outgoingTransitions.setID(RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions);
		outgoingTransitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoingTransitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoingTransitions.getInput(), outgoingTransitionsFilters, outgoingTransitionsBusinessFilters,
		"outgoingTransitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoingTransitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoingTransitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoingTransitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.outgoingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoingTransitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoingTransitions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIncomingTransitionsAdvancedReferencesTable(Composite parent) {
		this.incomingTransitions = new ReferencesTable(RealtimestatechartMessages.StateExitPointPropertiesEditionPart_IncomingTransitionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIncomingTransitions(); }
			public void handleEdit(EObject element) { editIncomingTransitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingTransitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingTransitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingTransitions.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions, RealtimestatechartViewsRepository.SWT_KIND));
		this.incomingTransitions.createControls(parent);
		this.incomingTransitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingTransitionsData = new GridData(GridData.FILL_HORIZONTAL);
		incomingTransitionsData.horizontalSpan = 3;
		this.incomingTransitions.setLayoutData(incomingTransitionsData);
		this.incomingTransitions.disableMove();
		incomingTransitions.setID(RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions);
		incomingTransitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingTransitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingTransitions.getInput(), incomingTransitionsFilters, incomingTransitionsBusinessFilters,
		"incomingTransitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingTransitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingTransitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingTransitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.incomingTransitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingTransitions.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingTransitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingTransitions.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createStatechartFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.StateExitPointPropertiesEditionPart_StatechartLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart, RealtimestatechartViewsRepository.SWT_KIND));
		statechart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart, RealtimestatechartViewsRepository.SWT_KIND));
		statechart.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		statechart.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getStatechart()));
			}

		});
		GridData statechartData = new GridData(GridData.FILL_HORIZONTAL);
		statechart.setLayoutData(statechartData);
		statechart.setID(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.StateExitPoint.Properties.statechart, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createStateFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.StateExitPointPropertiesEditionPart_StateLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.state, RealtimestatechartViewsRepository.SWT_KIND));
		state = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.state, RealtimestatechartViewsRepository.SWT_KIND));
		state.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		state.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.state, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getState()));
			}

		});
		GridData stateData = new GridData(GridData.FILL_HORIZONTAL);
		state.setLayoutData(stateData);
		state.setID(RealtimestatechartViewsRepository.StateExitPoint.Properties.state);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.StateExitPoint.Properties.state, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createExitPointFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.StateExitPointPropertiesEditionPart_ExitPointLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint, RealtimestatechartViewsRepository.SWT_KIND));
		exitPoint = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint, RealtimestatechartViewsRepository.SWT_KIND));
		exitPoint.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		exitPoint.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StateExitPointPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getExitPoint()));
			}

		});
		GridData exitPointData = new GridData(GridData.FILL_HORIZONTAL);
		exitPoint.setLayoutData(exitPointData);
		exitPoint.setID(RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.StateExitPoint.Properties.exitPoint, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#initOutgoingTransitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoingTransitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoingTransitions.setContentProvider(contentProvider);
		outgoingTransitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#updateOutgoingTransitions()
	 * 
	 */
	public void updateOutgoingTransitions() {
	outgoingTransitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addFilterOutgoingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoingTransitions(ViewerFilter filter) {
		outgoingTransitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addBusinessFilterOutgoingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoingTransitions(ViewerFilter filter) {
		outgoingTransitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#isContainedInOutgoingTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)outgoingTransitions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#initIncomingTransitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingTransitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingTransitions.setContentProvider(contentProvider);
		incomingTransitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#updateIncomingTransitions()
	 * 
	 */
	public void updateIncomingTransitions() {
	incomingTransitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addFilterIncomingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingTransitions(ViewerFilter filter) {
		incomingTransitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addBusinessFilterIncomingTransitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingTransitions(ViewerFilter filter) {
		incomingTransitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#isContainedInIncomingTransitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTransitionsTable(EObject element) {
		return ((ReferencesTableSettings)incomingTransitions.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#getStatechart()
	 * 
	 */
	public EObject getStatechart() {
		if (statechart.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) statechart.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#initStatechart(EObjectFlatComboSettings)
	 */
	public void initStatechart(EObjectFlatComboSettings settings) {
		statechart.setInput(settings);
		if (current != null) {
			statechart.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setStatechart(EObject newValue)
	 * 
	 */
	public void setStatechart(EObject newValue) {
		if (newValue != null) {
			statechart.setSelection(new StructuredSelection(newValue));
		} else {
			statechart.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setStatechartButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStatechartButtonMode(ButtonsModeEnum newValue) {
		statechart.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStatechart(ViewerFilter filter) {
		statechart.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addBusinessFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStatechart(ViewerFilter filter) {
		statechart.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#getState()
	 * 
	 */
	public EObject getState() {
		if (state.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) state.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#initState(EObjectFlatComboSettings)
	 */
	public void initState(EObjectFlatComboSettings settings) {
		state.setInput(settings);
		if (current != null) {
			state.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setState(EObject newValue)
	 * 
	 */
	public void setState(EObject newValue) {
		if (newValue != null) {
			state.setSelection(new StructuredSelection(newValue));
		} else {
			state.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setStateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStateButtonMode(ButtonsModeEnum newValue) {
		state.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addFilterState(ViewerFilter filter)
	 * 
	 */
	public void addFilterToState(ViewerFilter filter) {
		state.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addBusinessFilterState(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToState(ViewerFilter filter) {
		state.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#getExitPoint()
	 * 
	 */
	public EObject getExitPoint() {
		if (exitPoint.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) exitPoint.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#initExitPoint(EObjectFlatComboSettings)
	 */
	public void initExitPoint(EObjectFlatComboSettings settings) {
		exitPoint.setInput(settings);
		if (current != null) {
			exitPoint.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setExitPoint(EObject newValue)
	 * 
	 */
	public void setExitPoint(EObject newValue) {
		if (newValue != null) {
			exitPoint.setSelection(new StructuredSelection(newValue));
		} else {
			exitPoint.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#setExitPointButtonMode(ButtonsModeEnum newValue)
	 */
	public void setExitPointButtonMode(ButtonsModeEnum newValue) {
		exitPoint.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addFilterExitPoint(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExitPoint(ViewerFilter filter) {
		exitPoint.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.StateExitPointPropertiesEditionPart#addBusinessFilterExitPoint(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExitPoint(ViewerFilter filter) {
		exitPoint.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.StateExitPoint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

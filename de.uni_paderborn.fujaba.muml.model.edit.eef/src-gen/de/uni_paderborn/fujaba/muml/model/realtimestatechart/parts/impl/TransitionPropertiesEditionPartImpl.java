/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl;

// Start of user code for imports







import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class TransitionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TransitionPropertiesEditionPart {

	protected Text priority;
	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer statechart;
	protected ReferencesTable clockResets;
	protected List<ViewerFilter> clockResetsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clockResetsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable clockConstraints;
protected List<ViewerFilter> clockConstraintsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> clockConstraintsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable absoluteDeadlines;
protected List<ViewerFilter> absoluteDeadlinesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> absoluteDeadlinesFilters = new ArrayList<ViewerFilter>();
	protected Button blockable;
protected ReferencesTable events;
protected List<ViewerFilter> eventsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> eventsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TransitionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence transitionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = transitionStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.priority);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.target);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.source);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.statechart);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.clockResets);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.clockConstraints);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.blockable);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Transition.Properties.events);
		
		
		composer = new PartComposer(transitionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.Transition.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.priority) {
					return createPriorityText(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.target) {
					return createTargetFlatComboViewer(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.source) {
					return createSourceFlatComboViewer(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.statechart) {
					return createStatechartFlatComboViewer(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.clockResets) {
					return createClockResetsAdvancedReferencesTable(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.clockConstraints) {
					return createClockConstraintsAdvancedTableComposition(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines) {
					return createAbsoluteDeadlinesAdvancedTableComposition(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.blockable) {
					return createBlockableCheckbox(parent);
				}
				if (key == RealtimestatechartViewsRepository.Transition.Properties.events) {
					return createEventsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(RealtimestatechartMessages.TransitionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createPriorityText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.TransitionPropertiesEditionPart_PriorityLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.priority, RealtimestatechartViewsRepository.SWT_KIND));
		priority = new Text(parent, SWT.BORDER);
		GridData priorityData = new GridData(GridData.FILL_HORIZONTAL);
		priority.setLayoutData(priorityData);
		priority.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.priority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
			}

		});
		priority.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.priority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
				}
			}

		});
		EditingUtils.setID(priority, RealtimestatechartViewsRepository.Transition.Properties.priority);
		EditingUtils.setEEFtype(priority, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.priority, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.TransitionPropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.target, RealtimestatechartViewsRepository.SWT_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.target, RealtimestatechartViewsRepository.SWT_KIND));
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		target.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.setID(RealtimestatechartViewsRepository.Transition.Properties.target);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.target, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.TransitionPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.source, RealtimestatechartViewsRepository.SWT_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.source, RealtimestatechartViewsRepository.SWT_KIND));
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		source.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.setID(RealtimestatechartViewsRepository.Transition.Properties.source);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.source, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createStatechartFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.TransitionPropertiesEditionPart_StatechartLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.statechart, RealtimestatechartViewsRepository.SWT_KIND));
		statechart = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Transition.Properties.statechart, RealtimestatechartViewsRepository.SWT_KIND));
		statechart.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		statechart.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.statechart, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getStatechart()));
			}

		});
		GridData statechartData = new GridData(GridData.FILL_HORIZONTAL);
		statechart.setLayoutData(statechartData);
		statechart.setID(RealtimestatechartViewsRepository.Transition.Properties.statechart);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.statechart, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createClockResetsAdvancedReferencesTable(Composite parent) {
		this.clockResets = new ReferencesTable(RealtimestatechartMessages.TransitionPropertiesEditionPart_ClockResetsLabel, new ReferencesTableListener() {
			public void handleAdd() { addClockResets(); }
			public void handleEdit(EObject element) { editClockResets(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveClockResets(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromClockResets(element); }
			public void navigateTo(EObject element) { }
		});
		this.clockResets.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.clockResets, RealtimestatechartViewsRepository.SWT_KIND));
		this.clockResets.createControls(parent);
		this.clockResets.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockResets, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData clockResetsData = new GridData(GridData.FILL_HORIZONTAL);
		clockResetsData.horizontalSpan = 3;
		this.clockResets.setLayoutData(clockResetsData);
		this.clockResets.disableMove();
		clockResets.setID(RealtimestatechartViewsRepository.Transition.Properties.clockResets);
		clockResets.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addClockResets() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(clockResets.getInput(), clockResetsFilters, clockResetsBusinessFilters,
		"clockResets", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockResets,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				clockResets.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveClockResets(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockResets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		clockResets.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromClockResets(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockResets, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		clockResets.refresh();
	}

	/**
	 * 
	 */
	protected void editClockResets(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				clockResets.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createClockConstraintsAdvancedTableComposition(Composite parent) {
		this.clockConstraints = new ReferencesTable(RealtimestatechartMessages.TransitionPropertiesEditionPart_ClockConstraintsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockConstraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				clockConstraints.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockConstraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				clockConstraints.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockConstraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				clockConstraints.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockConstraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				clockConstraints.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.clockConstraintsFilters) {
			this.clockConstraints.addFilter(filter);
		}
		this.clockConstraints.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.clockConstraints, RealtimestatechartViewsRepository.SWT_KIND));
		this.clockConstraints.createControls(parent);
		this.clockConstraints.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.clockConstraints, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData clockConstraintsData = new GridData(GridData.FILL_HORIZONTAL);
		clockConstraintsData.horizontalSpan = 3;
		this.clockConstraints.setLayoutData(clockConstraintsData);
		this.clockConstraints.setLowerBound(0);
		this.clockConstraints.setUpperBound(-1);
		clockConstraints.setID(RealtimestatechartViewsRepository.Transition.Properties.clockConstraints);
		clockConstraints.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAbsoluteDeadlinesAdvancedTableComposition(Composite parent) {
		this.absoluteDeadlines = new ReferencesTable(RealtimestatechartMessages.TransitionPropertiesEditionPart_AbsoluteDeadlinesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				absoluteDeadlines.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				absoluteDeadlines.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				absoluteDeadlines.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				absoluteDeadlines.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.absoluteDeadlinesFilters) {
			this.absoluteDeadlines.addFilter(filter);
		}
		this.absoluteDeadlines.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines, RealtimestatechartViewsRepository.SWT_KIND));
		this.absoluteDeadlines.createControls(parent);
		this.absoluteDeadlines.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData absoluteDeadlinesData = new GridData(GridData.FILL_HORIZONTAL);
		absoluteDeadlinesData.horizontalSpan = 3;
		this.absoluteDeadlines.setLayoutData(absoluteDeadlinesData);
		this.absoluteDeadlines.setLowerBound(0);
		this.absoluteDeadlines.setUpperBound(-1);
		absoluteDeadlines.setID(RealtimestatechartViewsRepository.Transition.Properties.absoluteDeadlines);
		absoluteDeadlines.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBlockableCheckbox(Composite parent) {
		blockable = new Button(parent, SWT.CHECK);
		blockable.setText(RealtimestatechartMessages.TransitionPropertiesEditionPart_BlockableLabel);
		blockable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.blockable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(blockable.getSelection())));
			}

		});
		GridData blockableData = new GridData(GridData.FILL_HORIZONTAL);
		blockableData.horizontalSpan = 2;
		blockable.setLayoutData(blockableData);
		EditingUtils.setID(blockable, RealtimestatechartViewsRepository.Transition.Properties.blockable);
		EditingUtils.setEEFtype(blockable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.blockable, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventsAdvancedTableComposition(Composite parent) {
		this.events = new ReferencesTable(RealtimestatechartMessages.TransitionPropertiesEditionPart_EventsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				events.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				events.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				events.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				events.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventsFilters) {
			this.events.addFilter(filter);
		}
		this.events.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Transition.Properties.events, RealtimestatechartViewsRepository.SWT_KIND));
		this.events.createControls(parent);
		this.events.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Transition.Properties.events, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventsData = new GridData(GridData.FILL_HORIZONTAL);
		eventsData.horizontalSpan = 3;
		this.events.setLayoutData(eventsData);
		this.events.setLowerBound(0);
		this.events.setUpperBound(-1);
		events.setID(RealtimestatechartViewsRepository.Transition.Properties.events);
		events.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#getPriority()
	 * 
	 */
	public String getPriority() {
		return priority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setPriority(String newValue)
	 * 
	 */
	public void setPriority(String newValue) {
		if (newValue != null) {
			priority.setText(newValue);
		} else {
			priority.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#getTarget()
	 * 
	 */
	public EObject getTarget() {
		if (target.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setTarget(EObject newValue)
	 * 
	 */
	public void setTarget(EObject newValue) {
		if (newValue != null) {
			target.setSelection(new StructuredSelection(newValue));
		} else {
			target.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#getSource()
	 * 
	 */
	public EObject getSource() {
		if (source.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) source.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initSource(EObjectFlatComboSettings)
	 */
	public void initSource(EObjectFlatComboSettings settings) {
		source.setInput(settings);
		if (current != null) {
			source.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setSource(EObject newValue)
	 * 
	 */
	public void setSource(EObject newValue) {
		if (newValue != null) {
			source.setSelection(new StructuredSelection(newValue));
		} else {
			source.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#getStatechart()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initStatechart(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setStatechart(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setStatechartButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStatechartButtonMode(ButtonsModeEnum newValue) {
		statechart.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStatechart(ViewerFilter filter) {
		statechart.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterStatechart(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStatechart(ViewerFilter filter) {
		statechart.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initClockResets(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClockResets(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clockResets.setContentProvider(contentProvider);
		clockResets.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#updateClockResets()
	 * 
	 */
	public void updateClockResets() {
	clockResets.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterClockResets(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClockResets(ViewerFilter filter) {
		clockResetsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterClockResets(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClockResets(ViewerFilter filter) {
		clockResetsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#isContainedInClockResetsTable(EObject element)
	 * 
	 */
	public boolean isContainedInClockResetsTable(EObject element) {
		return ((ReferencesTableSettings)clockResets.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initClockConstraints(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initClockConstraints(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clockConstraints.setContentProvider(contentProvider);
		clockConstraints.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#updateClockConstraints()
	 * 
	 */
	public void updateClockConstraints() {
	clockConstraints.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterClockConstraints(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClockConstraints(ViewerFilter filter) {
		clockConstraintsFilters.add(filter);
		if (this.clockConstraints != null) {
			this.clockConstraints.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterClockConstraints(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClockConstraints(ViewerFilter filter) {
		clockConstraintsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#isContainedInClockConstraintsTable(EObject element)
	 * 
	 */
	public boolean isContainedInClockConstraintsTable(EObject element) {
		return ((ReferencesTableSettings)clockConstraints.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initAbsoluteDeadlines(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAbsoluteDeadlines(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		absoluteDeadlines.setContentProvider(contentProvider);
		absoluteDeadlines.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#updateAbsoluteDeadlines()
	 * 
	 */
	public void updateAbsoluteDeadlines() {
	absoluteDeadlines.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterAbsoluteDeadlines(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAbsoluteDeadlines(ViewerFilter filter) {
		absoluteDeadlinesFilters.add(filter);
		if (this.absoluteDeadlines != null) {
			this.absoluteDeadlines.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterAbsoluteDeadlines(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAbsoluteDeadlines(ViewerFilter filter) {
		absoluteDeadlinesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#isContainedInAbsoluteDeadlinesTable(EObject element)
	 * 
	 */
	public boolean isContainedInAbsoluteDeadlinesTable(EObject element) {
		return ((ReferencesTableSettings)absoluteDeadlines.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#getBlockable()
	 * 
	 */
	public Boolean getBlockable() {
		return Boolean.valueOf(blockable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#setBlockable(Boolean newValue)
	 * 
	 */
	public void setBlockable(Boolean newValue) {
		if (newValue != null) {
			blockable.setSelection(newValue.booleanValue());
		} else {
			blockable.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#initEvents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		events.setContentProvider(contentProvider);
		events.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#updateEvents()
	 * 
	 */
	public void updateEvents() {
	events.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvents(ViewerFilter filter) {
		eventsFilters.add(filter);
		if (this.events != null) {
			this.events.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#addBusinessFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter) {
		eventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.TransitionPropertiesEditionPart#isContainedInEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventsTable(EObject element) {
		return ((ReferencesTableSettings)events.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.Transition_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

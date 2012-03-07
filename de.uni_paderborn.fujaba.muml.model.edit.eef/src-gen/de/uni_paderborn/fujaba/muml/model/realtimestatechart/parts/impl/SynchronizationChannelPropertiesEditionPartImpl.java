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
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class SynchronizationChannelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SynchronizationChannelPropertiesEditionPart {

	protected Text comment;
	protected ReferencesTable inParameter;
	protected List<ViewerFilter> inParameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inParameterFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outParameter;
	protected List<ViewerFilter> outParameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outParameterFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected EObjectFlatComboViewer state;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SynchronizationChannelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence synchronizationChannelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = synchronizationChannelStep.addStep(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment);
		propertiesStep.addStep(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter);
		propertiesStep.addStep(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter);
		propertiesStep.addStep(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name);
		propertiesStep.addStep(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state);
		
		
		composer = new PartComposer(synchronizationChannelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter) {
					return createInParameterAdvancedReferencesTable(parent);
				}
				if (key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter) {
					return createOutParameterAdvancedReferencesTable(parent);
				}
				if (key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name) {
					return createNameText(parent);
				}
				if (key == RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state) {
					return createStateFlatComboViewer(parent);
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
		propertiesGroup.setText(RealtimestatechartMessages.SynchronizationChannelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.SynchronizationChannelPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment, RealtimestatechartViewsRepository.SWT_KIND));
		comment = new Text(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.comment, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInParameterAdvancedReferencesTable(Composite parent) {
		this.inParameter = new ReferencesTable(RealtimestatechartMessages.SynchronizationChannelPropertiesEditionPart_InParameterLabel, new ReferencesTableListener() {
			public void handleAdd() { addInParameter(); }
			public void handleEdit(EObject element) { editInParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.inParameter.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter, RealtimestatechartViewsRepository.SWT_KIND));
		this.inParameter.createControls(parent);
		this.inParameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inParameterData = new GridData(GridData.FILL_HORIZONTAL);
		inParameterData.horizontalSpan = 3;
		this.inParameter.setLayoutData(inParameterData);
		this.inParameter.disableMove();
		inParameter.setID(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter);
		inParameter.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInParameter() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inParameter.getInput(), inParameterFilters, inParameterBusinessFilters,
		"inParameter", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inParameter.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInParameter(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.inParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inParameter.refresh();
	}

	/**
	 * 
	 */
	protected void editInParameter(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inParameter.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutParameterAdvancedReferencesTable(Composite parent) {
		this.outParameter = new ReferencesTable(RealtimestatechartMessages.SynchronizationChannelPropertiesEditionPart_OutParameterLabel, new ReferencesTableListener() {
			public void handleAdd() { addOutParameter(); }
			public void handleEdit(EObject element) { editOutParameter(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutParameter(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutParameter(element); }
			public void navigateTo(EObject element) { }
		});
		this.outParameter.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter, RealtimestatechartViewsRepository.SWT_KIND));
		this.outParameter.createControls(parent);
		this.outParameter.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outParameterData = new GridData(GridData.FILL_HORIZONTAL);
		outParameterData.horizontalSpan = 3;
		this.outParameter.setLayoutData(outParameterData);
		this.outParameter.disableMove();
		outParameter.setID(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter);
		outParameter.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutParameter() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outParameter.getInput(), outParameterFilters, outParameterBusinessFilters,
		"outParameter", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outParameter.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutParameter(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outParameter.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutParameter(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.outParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outParameter.refresh();
	}

	/**
	 * 
	 */
	protected void editOutParameter(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outParameter.refresh();
			}
		}
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.SynchronizationChannelPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name, RealtimestatechartViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.name, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createStateFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.SynchronizationChannelPropertiesEditionPart_StateLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state, RealtimestatechartViewsRepository.SWT_KIND));
		state = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state, RealtimestatechartViewsRepository.SWT_KIND));
		state.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		state.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SynchronizationChannelPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getState()));
			}

		});
		GridData stateData = new GridData(GridData.FILL_HORIZONTAL);
		state.setLayoutData(stateData);
		state.setID(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.SynchronizationChannel.Properties.state, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#initInParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inParameter.setContentProvider(contentProvider);
		inParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#updateInParameter()
	 * 
	 */
	public void updateInParameter() {
	inParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#addFilterInParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInParameter(ViewerFilter filter) {
		inParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#addBusinessFilterInParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInParameter(ViewerFilter filter) {
		inParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#isContainedInInParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInInParameterTable(EObject element) {
		return ((ReferencesTableSettings)inParameter.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#initOutParameter(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutParameter(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outParameter.setContentProvider(contentProvider);
		outParameter.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#updateOutParameter()
	 * 
	 */
	public void updateOutParameter() {
	outParameter.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#addFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutParameter(ViewerFilter filter) {
		outParameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#addBusinessFilterOutParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutParameter(ViewerFilter filter) {
		outParameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#isContainedInOutParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutParameterTable(EObject element) {
		return ((ReferencesTableSettings)outParameter.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#getState()
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#initState(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#setState(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#setStateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setStateButtonMode(ButtonsModeEnum newValue) {
		state.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#addFilterState(ViewerFilter filter)
	 * 
	 */
	public void addFilterToState(ViewerFilter filter) {
		state.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.SynchronizationChannelPropertiesEditionPart#addBusinessFilterState(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToState(ViewerFilter filter) {
		state.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.SynchronizationChannel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

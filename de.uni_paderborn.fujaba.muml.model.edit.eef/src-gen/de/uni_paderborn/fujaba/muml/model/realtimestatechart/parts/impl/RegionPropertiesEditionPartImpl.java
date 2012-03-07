/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.impl;

// Start of user code for imports






import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class RegionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RegionPropertiesEditionPart {

	protected Text name;
	protected Text priority;
	protected EObjectFlatComboViewer parentState;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RegionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence regionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = regionStep.addStep(RealtimestatechartViewsRepository.Region.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Region.Properties.name);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Region.Properties.priority);
		propertiesStep.addStep(RealtimestatechartViewsRepository.Region.Properties.parentState);
		
		
		composer = new PartComposer(regionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.Region.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RealtimestatechartViewsRepository.Region.Properties.name) {
					return createNameText(parent);
				}
				if (key == RealtimestatechartViewsRepository.Region.Properties.priority) {
					return createPriorityText(parent);
				}
				if (key == RealtimestatechartViewsRepository.Region.Properties.parentState) {
					return createParentStateFlatComboViewer(parent);
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
		propertiesGroup.setText(RealtimestatechartMessages.RegionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.RegionPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Region.Properties.name, RealtimestatechartViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RegionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Region.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RegionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Region.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, RealtimestatechartViewsRepository.Region.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Region.Properties.name, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPriorityText(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.RegionPropertiesEditionPart_PriorityLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Region.Properties.priority, RealtimestatechartViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RegionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Region.Properties.priority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RegionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Region.Properties.priority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
				}
			}

		});
		EditingUtils.setID(priority, RealtimestatechartViewsRepository.Region.Properties.priority);
		EditingUtils.setEEFtype(priority, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Region.Properties.priority, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentStateFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.RegionPropertiesEditionPart_ParentStateLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Region.Properties.parentState, RealtimestatechartViewsRepository.SWT_KIND));
		parentState = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.Region.Properties.parentState, RealtimestatechartViewsRepository.SWT_KIND));
		parentState.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentState.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RegionPropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.Region.Properties.parentState, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentState()));
			}

		});
		GridData parentStateData = new GridData(GridData.FILL_HORIZONTAL);
		parentState.setLayoutData(parentStateData);
		parentState.setID(RealtimestatechartViewsRepository.Region.Properties.parentState);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.Region.Properties.parentState, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#getPriority()
	 * 
	 */
	public String getPriority() {
		return priority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#setPriority(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#getParentState()
	 * 
	 */
	public EObject getParentState() {
		if (parentState.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentState.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#initParentState(EObjectFlatComboSettings)
	 */
	public void initParentState(EObjectFlatComboSettings settings) {
		parentState.setInput(settings);
		if (current != null) {
			parentState.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#setParentState(EObject newValue)
	 * 
	 */
	public void setParentState(EObject newValue) {
		if (newValue != null) {
			parentState.setSelection(new StructuredSelection(newValue));
		} else {
			parentState.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#setParentStateButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentStateButtonMode(ButtonsModeEnum newValue) {
		parentState.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#addFilterParentState(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentState(ViewerFilter filter) {
		parentState.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RegionPropertiesEditionPart#addBusinessFilterParentState(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentState(ViewerFilter filter) {
		parentState.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.Region_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

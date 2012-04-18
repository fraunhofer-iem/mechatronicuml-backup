/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class RealtimeStatechartPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, RealtimeStatechartPropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected EObjectFlatComboViewer behavioralElement;
	protected EObjectFlatComboViewer embeddingRegion;
	protected Button history;
	protected Text eventQueueSize;
	protected ReferencesTable operations;
	protected List<ViewerFilter> operationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> operationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealtimeStatechartPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	@Override
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	@Override
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence realtimeStatechart_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = realtimeStatechart_Step.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.class);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize);
		propertiesStep.addStep(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations);
		
		
		composer = new PartComposer(realtimeStatechart_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment) {
					return 		createCommentText(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement) {
					return createBehavioralElementFlatComboViewer(parent, widgetFactory);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion) {
					return createEmbeddingRegionFlatComboViewer(parent, widgetFactory);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history) {
					return createHistoryCheckbox(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize) {
					return 		createEventQueueSizeText(widgetFactory, parent);
				}
				if (key == RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations) {
					return createOperationsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name, RealtimestatechartViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					}
				}
			}
		});
		EditingUtils.setID(name, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.name, RealtimestatechartViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment, RealtimestatechartViewsRepository.FORM_KIND));
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					}
				}
			}
		});
		EditingUtils.setID(comment, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.comment, RealtimestatechartViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createBehavioralElementFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_BehavioralElementLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement, RealtimestatechartViewsRepository.FORM_KIND));
		behavioralElement = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement, RealtimestatechartViewsRepository.FORM_KIND));
		widgetFactory.adapt(behavioralElement);
		behavioralElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData behavioralElementData = new GridData(GridData.FILL_HORIZONTAL);
		behavioralElement.setLayoutData(behavioralElementData);
		behavioralElement.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehavioralElement()));
				}
			}

		});
		behavioralElement.setID(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.behavioralElement, RealtimestatechartViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEmbeddingRegionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_EmbeddingRegionLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion, RealtimestatechartViewsRepository.FORM_KIND));
		embeddingRegion = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion, RealtimestatechartViewsRepository.FORM_KIND));
		widgetFactory.adapt(embeddingRegion);
		embeddingRegion.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData embeddingRegionData = new GridData(GridData.FILL_HORIZONTAL);
		embeddingRegion.setLayoutData(embeddingRegionData);
		embeddingRegion.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEmbeddingRegion()));
				}
			}

		});
		embeddingRegion.setID(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.embeddingRegion, RealtimestatechartViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createHistoryCheckbox(FormToolkit widgetFactory, Composite parent) {
		history = widgetFactory.createButton(parent, RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_HistoryLabel, SWT.CHECK);
		history.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(history.getSelection())));
				}
			}

		});
		GridData historyData = new GridData(GridData.FILL_HORIZONTAL);
		historyData.horizontalSpan = 2;
		history.setLayoutData(historyData);
		EditingUtils.setID(history, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history);
		EditingUtils.setEEFtype(history, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.history, RealtimestatechartViewsRepository.FORM_KIND), null); 
		return parent;
	}

	
	protected Composite createEventQueueSizeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_EventQueueSizeLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize, RealtimestatechartViewsRepository.FORM_KIND));
		eventQueueSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		eventQueueSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData eventQueueSizeData = new GridData(GridData.FILL_HORIZONTAL);
		eventQueueSize.setLayoutData(eventQueueSizeData);
		eventQueueSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, eventQueueSize.getText()));
				}
			}
		});
		eventQueueSize.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, eventQueueSize.getText()));
					}
				}
			}
		});
		EditingUtils.setID(eventQueueSize, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize);
		EditingUtils.setEEFtype(eventQueueSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.eventQueueSize, RealtimestatechartViewsRepository.FORM_KIND), null); 
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOperationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.operations = new ReferencesTable(RealtimestatechartMessages.RealtimeStatechartPropertiesEditionPart_OperationsLabel, new ReferencesTableListener() {
			@Override
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				operations.refresh();
			}
			@Override
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				operations.refresh();
			}
			@Override
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				operations.refresh();
			}
			@Override
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				operations.refresh();
			}
			@Override
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.operationsFilters) {
			this.operations.addFilter(filter);
		}
		this.operations.setHelpText(propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations, RealtimestatechartViewsRepository.FORM_KIND));
		this.operations.createControls(parent, widgetFactory);
		this.operations.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealtimeStatechartPropertiesEditionPartForm.this, RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData operationsData = new GridData(GridData.FILL_HORIZONTAL);
		operationsData.horizontalSpan = 3;
		this.operations.setLayoutData(operationsData);
		this.operations.setLowerBound(0);
		this.operations.setUpperBound(-1);
		operations.setID(RealtimestatechartViewsRepository.RealtimeStatechart_.Properties.operations);
		operations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#getName()
	 * 
	 */
	@Override
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	@Override
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#getComment()
	 * 
	 */
	@Override
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	@Override
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#getBehavioralElement()
	 * 
	 */
	@Override
	public EObject getBehavioralElement() {
		if (behavioralElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) behavioralElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#initBehavioralElement(EObjectFlatComboSettings)
	 */
	@Override
	public void initBehavioralElement(EObjectFlatComboSettings settings) {
		behavioralElement.setInput(settings);
		if (current != null) {
			behavioralElement.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setBehavioralElement(EObject newValue)
	 * 
	 */
	@Override
	public void setBehavioralElement(EObject newValue) {
		if (newValue != null) {
			behavioralElement.setSelection(new StructuredSelection(newValue));
		} else {
			behavioralElement.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setBehavioralElementButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setBehavioralElementButtonMode(ButtonsModeEnum newValue) {
		behavioralElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#addFilterBehavioralElement(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToBehavioralElement(ViewerFilter filter) {
		behavioralElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#addBusinessFilterBehavioralElement(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToBehavioralElement(ViewerFilter filter) {
		behavioralElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#getEmbeddingRegion()
	 * 
	 */
	@Override
	public EObject getEmbeddingRegion() {
		if (embeddingRegion.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) embeddingRegion.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				return (EObject) firstElement;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#initEmbeddingRegion(EObjectFlatComboSettings)
	 */
	@Override
	public void initEmbeddingRegion(EObjectFlatComboSettings settings) {
		embeddingRegion.setInput(settings);
		if (current != null) {
			embeddingRegion.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setEmbeddingRegion(EObject newValue)
	 * 
	 */
	@Override
	public void setEmbeddingRegion(EObject newValue) {
		if (newValue != null) {
			embeddingRegion.setSelection(new StructuredSelection(newValue));
		} else {
			embeddingRegion.setSelection(new StructuredSelection()); 
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setEmbeddingRegionButtonMode(ButtonsModeEnum newValue)
	 */
	@Override
	public void setEmbeddingRegionButtonMode(ButtonsModeEnum newValue) {
		embeddingRegion.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#addFilterEmbeddingRegion(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToEmbeddingRegion(ViewerFilter filter) {
		embeddingRegion.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#addBusinessFilterEmbeddingRegion(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToEmbeddingRegion(ViewerFilter filter) {
		embeddingRegion.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#getHistory()
	 * 
	 */
	@Override
	public Boolean getHistory() {
		return Boolean.valueOf(history.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setHistory(Boolean newValue)
	 * 
	 */
	@Override
	public void setHistory(Boolean newValue) {
		if (newValue != null) {
			history.setSelection(newValue.booleanValue());
		} else {
			history.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#getEventQueueSize()
	 * 
	 */
	@Override
	public String getEventQueueSize() {
		return eventQueueSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#setEventQueueSize(String newValue)
	 * 
	 */
	@Override
	public void setEventQueueSize(String newValue) {
		if (newValue != null) {
			eventQueueSize.setText(newValue);
		} else {
			eventQueueSize.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#initOperations(EObject current, EReference containingFeature, EReference feature)
	 */
	@Override
	public void initOperations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null) {
			this.resourceSet = current.eResource().getResourceSet();
		}
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		operations.setContentProvider(contentProvider);
		operations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#updateOperations()
	 * 
	 */
	@Override
	public void updateOperations() {
	operations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#addFilterOperations(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addFilterToOperations(ViewerFilter filter) {
		operationsFilters.add(filter);
		if (this.operations != null) {
			this.operations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#addBusinessFilterOperations(ViewerFilter filter)
	 * 
	 */
	@Override
	public void addBusinessFilterToOperations(ViewerFilter filter) {
		operationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimeStatechartPropertiesEditionPart#isContainedInOperationsTable(EObject element)
	 * 
	 */
	@Override
	public boolean isContainedInOperationsTable(EObject element) {
		return ((ReferencesTableSettings)operations.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	@Override
	public String getTitle() {
		return RealtimestatechartMessages.RealtimeStatechart_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

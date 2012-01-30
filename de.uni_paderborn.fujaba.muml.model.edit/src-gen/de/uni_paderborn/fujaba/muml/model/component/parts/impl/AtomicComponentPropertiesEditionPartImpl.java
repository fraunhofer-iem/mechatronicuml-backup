/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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

import de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class AtomicComponentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AtomicComponentPropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected ReferencesTable referencingComponentParts;
	protected List<ViewerFilter> referencingComponentPartsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencingComponentPartsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer componentType;
	protected EObjectFlatComboViewer behavior;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AtomicComponentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence atomicComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = atomicComponentStep.addStep(ComponentViewsRepository.AtomicComponent.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.AtomicComponent.Properties.name);
		propertiesStep.addStep(ComponentViewsRepository.AtomicComponent.Properties.comment);
		propertiesStep.addStep(ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts);
		propertiesStep.addStep(ComponentViewsRepository.AtomicComponent.Properties.componentType);
		propertiesStep.addStep(ComponentViewsRepository.AtomicComponent.Properties.behavior);
		
		
		composer = new PartComposer(atomicComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.AtomicComponent.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ComponentViewsRepository.AtomicComponent.Properties.name) {
					return createNameText(parent);
				}
				if (key == ComponentViewsRepository.AtomicComponent.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts) {
					return createReferencingComponentPartsAdvancedReferencesTable(parent);
				}
				if (key == ComponentViewsRepository.AtomicComponent.Properties.componentType) {
					return createComponentTypeEMFComboViewer(parent);
				}
				if (key == ComponentViewsRepository.AtomicComponent.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent);
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
		propertiesGroup.setText(ComponentMessages.AtomicComponentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AtomicComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.AtomicComponent.Properties.name, ComponentViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ComponentViewsRepository.AtomicComponent.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.AtomicComponent.Properties.name, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AtomicComponentPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.AtomicComponent.Properties.comment, ComponentViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ComponentViewsRepository.AtomicComponent.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.AtomicComponent.Properties.comment, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReferencingComponentPartsAdvancedReferencesTable(Composite parent) {
		this.referencingComponentParts = new ReferencesTable(ComponentMessages.AtomicComponentPropertiesEditionPart_ReferencingComponentPartsLabel, new ReferencesTableListener() {
			public void handleAdd() { addReferencingComponentParts(); }
			public void handleEdit(EObject element) { editReferencingComponentParts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencingComponentParts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencingComponentParts(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencingComponentParts.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts, ComponentViewsRepository.SWT_KIND));
		this.referencingComponentParts.createControls(parent);
		this.referencingComponentParts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencingComponentPartsData = new GridData(GridData.FILL_HORIZONTAL);
		referencingComponentPartsData.horizontalSpan = 3;
		this.referencingComponentParts.setLayoutData(referencingComponentPartsData);
		this.referencingComponentParts.disableMove();
		referencingComponentParts.setID(ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts);
		referencingComponentParts.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReferencingComponentParts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(referencingComponentParts.getInput(), referencingComponentPartsFilters, referencingComponentPartsBusinessFilters,
		"referencingComponentParts", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				referencingComponentParts.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReferencingComponentParts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencingComponentParts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencingComponentParts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.referencingComponentParts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		referencingComponentParts.refresh();
	}

	/**
	 * 
	 */
	protected void editReferencingComponentParts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				referencingComponentParts.refresh();
			}
		}
	}

	
	protected Composite createComponentTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AtomicComponentPropertiesEditionPart_ComponentTypeLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.AtomicComponent.Properties.componentType, ComponentViewsRepository.SWT_KIND));
		componentType = new EMFComboViewer(parent);
		componentType.setContentProvider(new ArrayContentProvider());
		componentType.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData componentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		componentType.getCombo().setLayoutData(componentTypeData);
		componentType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.componentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentType()));
			}

		});
		componentType.setID(ComponentViewsRepository.AtomicComponent.Properties.componentType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.AtomicComponent.Properties.componentType, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AtomicComponentPropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.AtomicComponent.Properties.behavior, ComponentViewsRepository.SWT_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.AtomicComponent.Properties.behavior, ComponentViewsRepository.SWT_KIND));
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AtomicComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.AtomicComponent.Properties.behavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.setID(ComponentViewsRepository.AtomicComponent.Properties.behavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.AtomicComponent.Properties.behavior, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#initReferencingComponentParts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReferencingComponentParts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		referencingComponentParts.setContentProvider(contentProvider);
		referencingComponentParts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#updateReferencingComponentParts()
	 * 
	 */
	public void updateReferencingComponentParts() {
	referencingComponentParts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#addFilterReferencingComponentParts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencingComponentParts(ViewerFilter filter) {
		referencingComponentPartsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#addBusinessFilterReferencingComponentParts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencingComponentParts(ViewerFilter filter) {
		referencingComponentPartsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#isContainedInReferencingComponentPartsTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencingComponentPartsTable(EObject element) {
		return ((ReferencesTableSettings)referencingComponentParts.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#getComponentType()
	 * 
	 */
	public Enumerator getComponentType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) componentType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#initComponentType(EEnum eenum, Enumerator current)
	 */
	public void initComponentType(EEnum eenum, Enumerator current) {
		componentType.setInput(eenum.getELiterals());
		componentType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#setComponentType(Enumerator newValue)
	 * 
	 */
	public void setComponentType(Enumerator newValue) {
		componentType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#getBehavior()
	 * 
	 */
	public EObject getBehavior() {
		if (behavior.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) behavior.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
	 */
	public void initBehavior(EObjectFlatComboSettings settings) {
		behavior.setInput(settings);
		if (current != null) {
			behavior.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#setBehavior(EObject newValue)
	 * 
	 */
	public void setBehavior(EObject newValue) {
		if (newValue != null) {
			behavior.setSelection(new StructuredSelection(newValue));
		} else {
			behavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AtomicComponentPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behavior.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.AtomicComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

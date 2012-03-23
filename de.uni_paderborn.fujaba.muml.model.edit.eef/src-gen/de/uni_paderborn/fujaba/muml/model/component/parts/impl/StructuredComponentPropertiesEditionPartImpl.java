/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
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

import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class StructuredComponentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StructuredComponentPropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected ReferencesTable referencingComponentParts;
	protected List<ViewerFilter> referencingComponentPartsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencingComponentPartsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer componentType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StructuredComponentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence structuredComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = structuredComponentStep.addStep(ComponentViewsRepository.StructuredComponent.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.StructuredComponent.Properties.name);
		propertiesStep.addStep(ComponentViewsRepository.StructuredComponent.Properties.comment);
		propertiesStep.addStep(ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts);
		propertiesStep.addStep(ComponentViewsRepository.StructuredComponent.Properties.componentType);
		
		
		composer = new PartComposer(structuredComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.StructuredComponent.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ComponentViewsRepository.StructuredComponent.Properties.name) {
					return createNameText(parent);
				}
				if (key == ComponentViewsRepository.StructuredComponent.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts) {
					return createReferencingComponentPartsAdvancedReferencesTable(parent);
				}
				if (key == ComponentViewsRepository.StructuredComponent.Properties.componentType) {
					return createComponentTypeEMFComboViewer(parent);
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
		propertiesGroup.setText(ComponentMessages.StructuredComponentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.StructuredComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.StructuredComponent.Properties.name, ComponentViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ComponentViewsRepository.StructuredComponent.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.StructuredComponent.Properties.name, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.StructuredComponentPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.StructuredComponent.Properties.comment, ComponentViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ComponentViewsRepository.StructuredComponent.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.StructuredComponent.Properties.comment, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReferencingComponentPartsAdvancedReferencesTable(Composite parent) {
		this.referencingComponentParts = new ReferencesTable(ComponentMessages.StructuredComponentPropertiesEditionPart_ReferencingComponentPartsLabel, new ReferencesTableListener() {
			public void handleAdd() { addReferencingComponentParts(); }
			public void handleEdit(EObject element) { editReferencingComponentParts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReferencingComponentParts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReferencingComponentParts(element); }
			public void navigateTo(EObject element) { }
		});
		this.referencingComponentParts.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts, ComponentViewsRepository.SWT_KIND));
		this.referencingComponentParts.createControls(parent);
		this.referencingComponentParts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData referencingComponentPartsData = new GridData(GridData.FILL_HORIZONTAL);
		referencingComponentPartsData.horizontalSpan = 3;
		this.referencingComponentParts.setLayoutData(referencingComponentPartsData);
		this.referencingComponentParts.disableMove();
		referencingComponentParts.setID(ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		referencingComponentParts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReferencingComponentParts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.referencingComponentParts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		SWTUtils.createPartLabel(parent, ComponentMessages.StructuredComponentPropertiesEditionPart_ComponentTypeLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.StructuredComponent.Properties.componentType, ComponentViewsRepository.SWT_KIND));
		componentType = new EMFComboViewer(parent);
		componentType.setContentProvider(new ArrayContentProvider());
		componentType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StructuredComponentPropertiesEditionPartImpl.this, ComponentViewsRepository.StructuredComponent.Properties.componentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentType()));
			}

		});
		componentType.setID(ComponentViewsRepository.StructuredComponent.Properties.componentType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.StructuredComponent.Properties.componentType, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#initReferencingComponentParts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#updateReferencingComponentParts()
	 * 
	 */
	public void updateReferencingComponentParts() {
	referencingComponentParts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#addFilterReferencingComponentParts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencingComponentParts(ViewerFilter filter) {
		referencingComponentPartsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#addBusinessFilterReferencingComponentParts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencingComponentParts(ViewerFilter filter) {
		referencingComponentPartsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#isContainedInReferencingComponentPartsTable(EObject element)
	 * 
	 */
	public boolean isContainedInReferencingComponentPartsTable(EObject element) {
		return ((ReferencesTableSettings)referencingComponentParts.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#getComponentType()
	 * 
	 */
	public Enumerator getComponentType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) componentType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#initComponentType(Object input, Enumerator current)
	 */
	public void initComponentType(Object input, Enumerator current) {
		componentType.setInput(input);
		componentType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.StructuredComponentPropertiesEditionPart#setComponentType(Enumerator newValue)
	 * 
	 */
	public void setComponentType(Enumerator newValue) {
		componentType.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.StructuredComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class AssemblyInstancePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AssemblyInstancePropertiesEditionPart {

	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer connectorType;
	protected Text propagationDelayLowerBound;
	protected Text propagationDelayUpperBound;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AssemblyInstancePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
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
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence assemblyInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = assemblyInstanceStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.source);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.target);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.connectorType);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound);
		propertiesStep.addStep(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound);
		
		
		composer = new PartComposer(assemblyInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.source) {
					return createSourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.target) {
					return createTargetFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.connectorType) {
					return createConnectorTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound) {
					return 		createPropagationDelayLowerBoundText(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound) {
					return 		createPropagationDelayUpperBoundText(widgetFactory, parent);
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
		propertiesSection.setText(InstanceMessages.AssemblyInstancePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.source, InstanceViewsRepository.FORM_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.source, InstanceViewsRepository.FORM_KIND));
		widgetFactory.adapt(source);
		source.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		source.setID(InstanceViewsRepository.AssemblyInstance.Properties.source);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.source, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.target, InstanceViewsRepository.FORM_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.target, InstanceViewsRepository.FORM_KIND));
		widgetFactory.adapt(target);
		target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		target.setID(InstanceViewsRepository.AssemblyInstance.Properties.target);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.target, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createConnectorTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_ConnectorTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.connectorType, InstanceViewsRepository.FORM_KIND));
		connectorType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.connectorType, InstanceViewsRepository.FORM_KIND));
		widgetFactory.adapt(connectorType);
		connectorType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData connectorTypeData = new GridData(GridData.FILL_HORIZONTAL);
		connectorType.setLayoutData(connectorTypeData);
		connectorType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.connectorType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectorType()));
			}

		});
		connectorType.setID(InstanceViewsRepository.AssemblyInstance.Properties.connectorType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.connectorType, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPropagationDelayLowerBoundText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_PropagationDelayLowerBoundLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, InstanceViewsRepository.FORM_KIND));
		propagationDelayLowerBound = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propagationDelayLowerBound.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propagationDelayLowerBoundData = new GridData(GridData.FILL_HORIZONTAL);
		propagationDelayLowerBound.setLayoutData(propagationDelayLowerBoundData);
		propagationDelayLowerBound.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayLowerBound.getText()));
			}
		});
		propagationDelayLowerBound.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayLowerBound.getText()));
				}
			}
		});
		EditingUtils.setID(propagationDelayLowerBound, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound);
		EditingUtils.setEEFtype(propagationDelayLowerBound, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayLowerBound, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPropagationDelayUpperBoundText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.AssemblyInstancePropertiesEditionPart_PropagationDelayUpperBoundLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, InstanceViewsRepository.FORM_KIND));
		propagationDelayUpperBound = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		propagationDelayUpperBound.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData propagationDelayUpperBoundData = new GridData(GridData.FILL_HORIZONTAL);
		propagationDelayUpperBound.setLayoutData(propagationDelayUpperBoundData);
		propagationDelayUpperBound.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayUpperBound.getText()));
			}
		});
		propagationDelayUpperBound.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyInstancePropertiesEditionPartForm.this, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, propagationDelayUpperBound.getText()));
				}
			}
		});
		EditingUtils.setID(propagationDelayUpperBound, InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound);
		EditingUtils.setEEFtype(propagationDelayUpperBound, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.AssemblyInstance.Properties.propagationDelayUpperBound, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getSource()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#initSource(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setSource(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getTarget()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#initTarget(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setTarget(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getConnectorType()
	 * 
	 */
	public EObject getConnectorType() {
		if (connectorType.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) connectorType.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#initConnectorType(EObjectFlatComboSettings)
	 */
	public void initConnectorType(EObjectFlatComboSettings settings) {
		connectorType.setInput(settings);
		if (current != null) {
			connectorType.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setConnectorType(EObject newValue)
	 * 
	 */
	public void setConnectorType(EObject newValue) {
		if (newValue != null) {
			connectorType.setSelection(new StructuredSelection(newValue));
		} else {
			connectorType.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setConnectorTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setConnectorTypeButtonMode(ButtonsModeEnum newValue) {
		connectorType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConnectorType(ViewerFilter filter) {
		connectorType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#addBusinessFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConnectorType(ViewerFilter filter) {
		connectorType.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getPropagationDelayLowerBound()
	 * 
	 */
	public String getPropagationDelayLowerBound() {
		return propagationDelayLowerBound.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setPropagationDelayLowerBound(String newValue)
	 * 
	 */
	public void setPropagationDelayLowerBound(String newValue) {
		if (newValue != null) {
			propagationDelayLowerBound.setText(newValue);
		} else {
			propagationDelayLowerBound.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#getPropagationDelayUpperBound()
	 * 
	 */
	public String getPropagationDelayUpperBound() {
		return propagationDelayUpperBound.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.AssemblyInstancePropertiesEditionPart#setPropagationDelayUpperBound(String newValue)
	 * 
	 */
	public void setPropagationDelayUpperBound(String newValue) {
		if (newValue != null) {
			propagationDelayUpperBound.setText(newValue);
		} else {
			propagationDelayUpperBound.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.AssemblyInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

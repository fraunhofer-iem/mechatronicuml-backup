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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.instance.providers.InstanceMessages;


// End of user code

/**
 * 
 * 
 */
public class DelegationInstancePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DelegationInstancePropertiesEditionPart {

	protected EObjectFlatComboViewer source;
	protected EObjectFlatComboViewer target;
	protected EObjectFlatComboViewer connectorType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DelegationInstancePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence delegationInstanceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = delegationInstanceStep.addStep(InstanceViewsRepository.DelegationInstance.Properties.class);
		propertiesStep.addStep(InstanceViewsRepository.DelegationInstance.Properties.source);
		propertiesStep.addStep(InstanceViewsRepository.DelegationInstance.Properties.target);
		propertiesStep.addStep(InstanceViewsRepository.DelegationInstance.Properties.connectorType);
		
		
		composer = new PartComposer(delegationInstanceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == InstanceViewsRepository.DelegationInstance.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == InstanceViewsRepository.DelegationInstance.Properties.source) {
					return createSourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.DelegationInstance.Properties.target) {
					return createTargetFlatComboViewer(parent, widgetFactory);
				}
				if (key == InstanceViewsRepository.DelegationInstance.Properties.connectorType) {
					return createConnectorTypeFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(InstanceMessages.DelegationInstancePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DelegationInstancePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DelegationInstance.Properties.source, InstanceViewsRepository.FORM_KIND));
		source = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.DelegationInstance.Properties.source, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DelegationInstance.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSource()));
			}

		});
		source.setID(InstanceViewsRepository.DelegationInstance.Properties.source);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DelegationInstance.Properties.source, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DelegationInstancePropertiesEditionPart_TargetLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DelegationInstance.Properties.target, InstanceViewsRepository.FORM_KIND));
		target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.DelegationInstance.Properties.target, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DelegationInstance.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTarget()));
			}

		});
		target.setID(InstanceViewsRepository.DelegationInstance.Properties.target);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DelegationInstance.Properties.target, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createConnectorTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, InstanceMessages.DelegationInstancePropertiesEditionPart_ConnectorTypeLabel, propertiesEditionComponent.isRequired(InstanceViewsRepository.DelegationInstance.Properties.connectorType, InstanceViewsRepository.FORM_KIND));
		connectorType = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(InstanceViewsRepository.DelegationInstance.Properties.connectorType, InstanceViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelegationInstancePropertiesEditionPartForm.this, InstanceViewsRepository.DelegationInstance.Properties.connectorType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectorType()));
			}

		});
		connectorType.setID(InstanceViewsRepository.DelegationInstance.Properties.connectorType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(InstanceViewsRepository.DelegationInstance.Properties.connectorType, InstanceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#getSource()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#initSource(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#setSource(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#setSourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceButtonMode(ButtonsModeEnum newValue) {
		source.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		source.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		source.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#getTarget()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#initTarget(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#setTarget(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		target.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		target.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#getConnectorType()
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#initConnectorType(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#setConnectorType(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#setConnectorTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setConnectorTypeButtonMode(ButtonsModeEnum newValue) {
		connectorType.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#addFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConnectorType(ViewerFilter filter) {
		connectorType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.instance.parts.DelegationInstancePropertiesEditionPart#addBusinessFilterConnectorType(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConnectorType(ViewerFilter filter) {
		connectorType.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return InstanceMessages.DelegationInstance_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

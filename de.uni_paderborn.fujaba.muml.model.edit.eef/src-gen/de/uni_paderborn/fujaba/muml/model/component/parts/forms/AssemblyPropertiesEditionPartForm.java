/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.forms;

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

import de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;

// Start of user code for imports


// End of user code

/**
 * 
 * 
 */
public class AssemblyPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AssemblyPropertiesEditionPart {

	protected EObjectFlatComboViewer fromPort;
	protected EObjectFlatComboViewer toPort;
	protected EObjectFlatComboViewer parentComponent;
	protected EObjectFlatComboViewer behavior;
	protected EObjectFlatComboViewer to;
	protected EObjectFlatComboViewer from;
	protected EObjectFlatComboViewer coordinationPattern;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AssemblyPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence assemblyStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = assemblyStep.addStep(ComponentViewsRepository.Assembly.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.fromPort);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.toPort);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.parentComponent);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.behavior);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.to);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.from);
		propertiesStep.addStep(ComponentViewsRepository.Assembly.Properties.coordinationPattern);
		
		
		composer = new PartComposer(assemblyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.Assembly.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.fromPort) {
					return createFromPortFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.toPort) {
					return createToPortFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.parentComponent) {
					return createParentComponentFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.to) {
					return createToFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.from) {
					return createFromFlatComboViewer(parent, widgetFactory);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.coordinationPattern) {
					return createCoordinationPatternFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ComponentMessages.AssemblyPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createFromPortFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_FromPortLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.fromPort, ComponentViewsRepository.FORM_KIND));
		fromPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.fromPort, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(fromPort);
		fromPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fromPortData = new GridData(GridData.FILL_HORIZONTAL);
		fromPort.setLayoutData(fromPortData);
		fromPort.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.fromPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFromPort()));
			}

		});
		fromPort.setID(ComponentViewsRepository.Assembly.Properties.fromPort);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.fromPort, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createToPortFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_ToPortLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.toPort, ComponentViewsRepository.FORM_KIND));
		toPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.toPort, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(toPort);
		toPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData toPortData = new GridData(GridData.FILL_HORIZONTAL);
		toPort.setLayoutData(toPortData);
		toPort.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.toPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getToPort()));
			}

		});
		toPort.setID(ComponentViewsRepository.Assembly.Properties.toPort);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.toPort, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createParentComponentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_ParentComponentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.parentComponent, ComponentViewsRepository.FORM_KIND));
		parentComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.parentComponent, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(parentComponent);
		parentComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parentComponentData = new GridData(GridData.FILL_HORIZONTAL);
		parentComponent.setLayoutData(parentComponentData);
		parentComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.parentComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParentComponent()));
			}

		});
		parentComponent.setID(ComponentViewsRepository.Assembly.Properties.parentComponent);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.parentComponent, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.behavior, ComponentViewsRepository.FORM_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.behavior, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(behavior);
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.behavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		behavior.setID(ComponentViewsRepository.Assembly.Properties.behavior);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.behavior, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createToFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_ToLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.to, ComponentViewsRepository.FORM_KIND));
		to = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.to, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(to);
		to.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData toData = new GridData(GridData.FILL_HORIZONTAL);
		to.setLayoutData(toData);
		to.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.to, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTo()));
			}

		});
		to.setID(ComponentViewsRepository.Assembly.Properties.to);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.to, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFromFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_FromLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.from, ComponentViewsRepository.FORM_KIND));
		from = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.from, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(from);
		from.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData fromData = new GridData(GridData.FILL_HORIZONTAL);
		from.setLayoutData(fromData);
		from.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.from, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFrom()));
			}

		});
		from.setID(ComponentViewsRepository.Assembly.Properties.from);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.from, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCoordinationPatternFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ComponentMessages.AssemblyPropertiesEditionPart_CoordinationPatternLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.coordinationPattern, ComponentViewsRepository.FORM_KIND));
		coordinationPattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.coordinationPattern, ComponentViewsRepository.FORM_KIND));
		widgetFactory.adapt(coordinationPattern);
		coordinationPattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData coordinationPatternData = new GridData(GridData.FILL_HORIZONTAL);
		coordinationPattern.setLayoutData(coordinationPatternData);
		coordinationPattern.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartForm.this, ComponentViewsRepository.Assembly.Properties.coordinationPattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCoordinationPattern()));
			}

		});
		coordinationPattern.setID(ComponentViewsRepository.Assembly.Properties.coordinationPattern);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.coordinationPattern, ComponentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getFromPort()
	 * 
	 */
	public EObject getFromPort() {
		if (fromPort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) fromPort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initFromPort(EObjectFlatComboSettings)
	 */
	public void initFromPort(EObjectFlatComboSettings settings) {
		fromPort.setInput(settings);
		if (current != null) {
			fromPort.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setFromPort(EObject newValue)
	 * 
	 */
	public void setFromPort(EObject newValue) {
		if (newValue != null) {
			fromPort.setSelection(new StructuredSelection(newValue));
		} else {
			fromPort.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setFromPortButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFromPortButtonMode(ButtonsModeEnum newValue) {
		fromPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterFromPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFromPort(ViewerFilter filter) {
		fromPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterFromPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFromPort(ViewerFilter filter) {
		fromPort.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getToPort()
	 * 
	 */
	public EObject getToPort() {
		if (toPort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) toPort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initToPort(EObjectFlatComboSettings)
	 */
	public void initToPort(EObjectFlatComboSettings settings) {
		toPort.setInput(settings);
		if (current != null) {
			toPort.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setToPort(EObject newValue)
	 * 
	 */
	public void setToPort(EObject newValue) {
		if (newValue != null) {
			toPort.setSelection(new StructuredSelection(newValue));
		} else {
			toPort.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setToPortButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToPortButtonMode(ButtonsModeEnum newValue) {
		toPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterToPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToPort(ViewerFilter filter) {
		toPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterToPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToPort(ViewerFilter filter) {
		toPort.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getParentComponent()
	 * 
	 */
	public EObject getParentComponent() {
		if (parentComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initParentComponent(EObjectFlatComboSettings)
	 */
	public void initParentComponent(EObjectFlatComboSettings settings) {
		parentComponent.setInput(settings);
		if (current != null) {
			parentComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setParentComponent(EObject newValue)
	 * 
	 */
	public void setParentComponent(EObject newValue) {
		if (newValue != null) {
			parentComponent.setSelection(new StructuredSelection(newValue));
		} else {
			parentComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setParentComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParentComponentButtonMode(ButtonsModeEnum newValue) {
		parentComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterParentComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParentComponent(ViewerFilter filter) {
		parentComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterParentComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParentComponent(ViewerFilter filter) {
		parentComponent.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getBehavior()
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initBehavior(EObjectFlatComboSettings)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setBehavior(EObject newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBehaviorButtonMode(ButtonsModeEnum newValue) {
		behavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behavior.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getTo()
	 * 
	 */
	public EObject getTo() {
		if (to.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) to.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initTo(EObjectFlatComboSettings)
	 */
	public void initTo(EObjectFlatComboSettings settings) {
		to.setInput(settings);
		if (current != null) {
			to.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setTo(EObject newValue)
	 * 
	 */
	public void setTo(EObject newValue) {
		if (newValue != null) {
			to.setSelection(new StructuredSelection(newValue));
		} else {
			to.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setToButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToButtonMode(ButtonsModeEnum newValue) {
		to.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterTo(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTo(ViewerFilter filter) {
		to.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterTo(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTo(ViewerFilter filter) {
		to.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getFrom()
	 * 
	 */
	public EObject getFrom() {
		if (from.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) from.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initFrom(EObjectFlatComboSettings)
	 */
	public void initFrom(EObjectFlatComboSettings settings) {
		from.setInput(settings);
		if (current != null) {
			from.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setFrom(EObject newValue)
	 * 
	 */
	public void setFrom(EObject newValue) {
		if (newValue != null) {
			from.setSelection(new StructuredSelection(newValue));
		} else {
			from.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setFromButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFromButtonMode(ButtonsModeEnum newValue) {
		from.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterFrom(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFrom(ViewerFilter filter) {
		from.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterFrom(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFrom(ViewerFilter filter) {
		from.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#getCoordinationPattern()
	 * 
	 */
	public EObject getCoordinationPattern() {
		if (coordinationPattern.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) coordinationPattern.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#initCoordinationPattern(EObjectFlatComboSettings)
	 */
	public void initCoordinationPattern(EObjectFlatComboSettings settings) {
		coordinationPattern.setInput(settings);
		if (current != null) {
			coordinationPattern.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setCoordinationPattern(EObject newValue)
	 * 
	 */
	public void setCoordinationPattern(EObject newValue) {
		if (newValue != null) {
			coordinationPattern.setSelection(new StructuredSelection(newValue));
		} else {
			coordinationPattern.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#setCoordinationPatternButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCoordinationPatternButtonMode(ButtonsModeEnum newValue) {
		coordinationPattern.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addFilterCoordinationPattern(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCoordinationPattern(ViewerFilter filter) {
		coordinationPattern.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart#addBusinessFilterCoordinationPattern(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCoordinationPattern(ViewerFilter filter) {
		coordinationPattern.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.Assembly_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

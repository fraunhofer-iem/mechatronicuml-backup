/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.parts.impl;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.uni_paderborn.fujaba.muml.model.component.parts.AssemblyPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.providers.ComponentMessages;


// End of user code

/**
 * 
 * 
 */
public class AssemblyPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AssemblyPropertiesEditionPart {

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
	public AssemblyPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.fromPort) {
					return createFromPortFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.toPort) {
					return createToPortFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.parentComponent) {
					return createParentComponentFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.behavior) {
					return createBehaviorFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.to) {
					return createToFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.from) {
					return createFromFlatComboViewer(parent);
				}
				if (key == ComponentViewsRepository.Assembly.Properties.coordinationPattern) {
					return createCoordinationPatternFlatComboViewer(parent);
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
		propertiesGroup.setText(ComponentMessages.AssemblyPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFromPortFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_FromPortLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.fromPort, ComponentViewsRepository.SWT_KIND));
		fromPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.fromPort, ComponentViewsRepository.SWT_KIND));
		fromPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		fromPort.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.fromPort, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFromPort()));
			}

		});
		GridData fromPortData = new GridData(GridData.FILL_HORIZONTAL);
		fromPort.setLayoutData(fromPortData);
		fromPort.setID(ComponentViewsRepository.Assembly.Properties.fromPort);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.fromPort, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createToPortFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_ToPortLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.toPort, ComponentViewsRepository.SWT_KIND));
		toPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.toPort, ComponentViewsRepository.SWT_KIND));
		toPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		toPort.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.toPort, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getToPort()));
			}

		});
		GridData toPortData = new GridData(GridData.FILL_HORIZONTAL);
		toPort.setLayoutData(toPortData);
		toPort.setID(ComponentViewsRepository.Assembly.Properties.toPort);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.toPort, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createParentComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_ParentComponentLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.parentComponent, ComponentViewsRepository.SWT_KIND));
		parentComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.parentComponent, ComponentViewsRepository.SWT_KIND));
		parentComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.parentComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentComponent()));
			}

		});
		GridData parentComponentData = new GridData(GridData.FILL_HORIZONTAL);
		parentComponent.setLayoutData(parentComponentData);
		parentComponent.setID(ComponentViewsRepository.Assembly.Properties.parentComponent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.parentComponent, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBehaviorFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_BehaviorLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.behavior, ComponentViewsRepository.SWT_KIND));
		behavior = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.behavior, ComponentViewsRepository.SWT_KIND));
		behavior.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		behavior.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.behavior, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBehavior()));
			}

		});
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behavior.setLayoutData(behaviorData);
		behavior.setID(ComponentViewsRepository.Assembly.Properties.behavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.behavior, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createToFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_ToLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.to, ComponentViewsRepository.SWT_KIND));
		to = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.to, ComponentViewsRepository.SWT_KIND));
		to.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		to.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.to, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTo()));
			}

		});
		GridData toData = new GridData(GridData.FILL_HORIZONTAL);
		to.setLayoutData(toData);
		to.setID(ComponentViewsRepository.Assembly.Properties.to);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.to, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFromFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_FromLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.from, ComponentViewsRepository.SWT_KIND));
		from = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.from, ComponentViewsRepository.SWT_KIND));
		from.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		from.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.from, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFrom()));
			}

		});
		GridData fromData = new GridData(GridData.FILL_HORIZONTAL);
		from.setLayoutData(fromData);
		from.setID(ComponentViewsRepository.Assembly.Properties.from);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.from, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCoordinationPatternFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ComponentMessages.AssemblyPropertiesEditionPart_CoordinationPatternLabel, propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.coordinationPattern, ComponentViewsRepository.SWT_KIND));
		coordinationPattern = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ComponentViewsRepository.Assembly.Properties.coordinationPattern, ComponentViewsRepository.SWT_KIND));
		coordinationPattern.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		coordinationPattern.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssemblyPropertiesEditionPartImpl.this, ComponentViewsRepository.Assembly.Properties.coordinationPattern, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCoordinationPattern()));
			}

		});
		GridData coordinationPatternData = new GridData(GridData.FILL_HORIZONTAL);
		coordinationPattern.setLayoutData(coordinationPatternData);
		coordinationPattern.setID(ComponentViewsRepository.Assembly.Properties.coordinationPattern);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.Assembly.Properties.coordinationPattern, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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

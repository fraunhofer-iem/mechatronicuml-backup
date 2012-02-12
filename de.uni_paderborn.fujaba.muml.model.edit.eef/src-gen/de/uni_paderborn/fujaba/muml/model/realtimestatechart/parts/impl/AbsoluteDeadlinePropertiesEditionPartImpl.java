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

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.RealtimestatechartViewsRepository;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.providers.RealtimestatechartMessages;


// End of user code

/**
 * 
 * 
 */
public class AbsoluteDeadlinePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AbsoluteDeadlinePropertiesEditionPart {

	protected EObjectFlatComboViewer clock;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AbsoluteDeadlinePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence absoluteDeadlineStep = new BindingCompositionSequence(propertiesEditionComponent);
		absoluteDeadlineStep
			.addStep(RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.class)
			.addStep(RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock);
		
		
		composer = new PartComposer(absoluteDeadlineStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock) {
					return createClockFlatComboViewer(parent);
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
		propertiesGroup.setText(RealtimestatechartMessages.AbsoluteDeadlinePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createClockFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, RealtimestatechartMessages.AbsoluteDeadlinePropertiesEditionPart_ClockLabel, propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock, RealtimestatechartViewsRepository.SWT_KIND));
		clock = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock, RealtimestatechartViewsRepository.SWT_KIND));
		clock.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		clock.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbsoluteDeadlinePropertiesEditionPartImpl.this, RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getClock()));
			}

		});
		GridData clockData = new GridData(GridData.FILL_HORIZONTAL);
		clock.setLayoutData(clockData);
		clock.setID(RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RealtimestatechartViewsRepository.AbsoluteDeadline.Properties.clock, RealtimestatechartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart#getClock()
	 * 
	 */
	public EObject getClock() {
		if (clock.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) clock.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart#initClock(EObjectFlatComboSettings)
	 */
	public void initClock(EObjectFlatComboSettings settings) {
		clock.setInput(settings);
		if (current != null) {
			clock.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart#setClock(EObject newValue)
	 * 
	 */
	public void setClock(EObject newValue) {
		if (newValue != null) {
			clock.setSelection(new StructuredSelection(newValue));
		} else {
			clock.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart#setClockButtonMode(ButtonsModeEnum newValue)
	 */
	public void setClockButtonMode(ButtonsModeEnum newValue) {
		clock.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart#addFilterClock(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClock(ViewerFilter filter) {
		clock.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.parts.AbsoluteDeadlinePropertiesEditionPart#addBusinessFilterClock(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClock(ViewerFilter filter) {
		clock.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RealtimestatechartMessages.AbsoluteDeadline_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

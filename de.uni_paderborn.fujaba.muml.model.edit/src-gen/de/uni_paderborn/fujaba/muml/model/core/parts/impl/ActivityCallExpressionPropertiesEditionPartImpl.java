/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.core.parts.impl;

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

import de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.parts.CoreViewsRepository;
import de.uni_paderborn.fujaba.muml.model.core.providers.CoreMessages;


// End of user code

/**
 * 
 * 
 */
public class ActivityCallExpressionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ActivityCallExpressionPropertiesEditionPart {

	protected Text comment;
	protected EObjectFlatComboViewer callee;
	protected EObjectFlatComboViewer activity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ActivityCallExpressionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence activityCallExpressionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = activityCallExpressionStep.addStep(CoreViewsRepository.ActivityCallExpression.Properties.class);
		propertiesStep.addStep(CoreViewsRepository.ActivityCallExpression.Properties.comment);
		propertiesStep.addStep(CoreViewsRepository.ActivityCallExpression.Properties.callee);
		propertiesStep.addStep(CoreViewsRepository.ActivityCallExpression.Properties.activity);
		
		
		composer = new PartComposer(activityCallExpressionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreViewsRepository.ActivityCallExpression.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreViewsRepository.ActivityCallExpression.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == CoreViewsRepository.ActivityCallExpression.Properties.callee) {
					return createCalleeFlatComboViewer(parent);
				}
				if (key == CoreViewsRepository.ActivityCallExpression.Properties.activity) {
					return createActivityFlatComboViewer(parent);
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
		propertiesGroup.setText(CoreMessages.ActivityCallExpressionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.ActivityCallExpressionPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.ActivityCallExpression.Properties.comment, CoreViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityCallExpressionPropertiesEditionPartImpl.this, CoreViewsRepository.ActivityCallExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityCallExpressionPropertiesEditionPartImpl.this, CoreViewsRepository.ActivityCallExpression.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, CoreViewsRepository.ActivityCallExpression.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.ActivityCallExpression.Properties.comment, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCalleeFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.ActivityCallExpressionPropertiesEditionPart_CalleeLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.ActivityCallExpression.Properties.callee, CoreViewsRepository.SWT_KIND));
		callee = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CoreViewsRepository.ActivityCallExpression.Properties.callee, CoreViewsRepository.SWT_KIND));
		callee.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		callee.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityCallExpressionPropertiesEditionPartImpl.this, CoreViewsRepository.ActivityCallExpression.Properties.callee, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCallee()));
			}

		});
		GridData calleeData = new GridData(GridData.FILL_HORIZONTAL);
		callee.setLayoutData(calleeData);
		callee.setID(CoreViewsRepository.ActivityCallExpression.Properties.callee);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.ActivityCallExpression.Properties.callee, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createActivityFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, CoreMessages.ActivityCallExpressionPropertiesEditionPart_ActivityLabel, propertiesEditionComponent.isRequired(CoreViewsRepository.ActivityCallExpression.Properties.activity, CoreViewsRepository.SWT_KIND));
		activity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CoreViewsRepository.ActivityCallExpression.Properties.activity, CoreViewsRepository.SWT_KIND));
		activity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		activity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActivityCallExpressionPropertiesEditionPartImpl.this, CoreViewsRepository.ActivityCallExpression.Properties.activity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getActivity()));
			}

		});
		GridData activityData = new GridData(GridData.FILL_HORIZONTAL);
		activity.setLayoutData(activityData);
		activity.setID(CoreViewsRepository.ActivityCallExpression.Properties.activity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreViewsRepository.ActivityCallExpression.Properties.activity, CoreViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#getCallee()
	 * 
	 */
	public EObject getCallee() {
		if (callee.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) callee.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#initCallee(EObjectFlatComboSettings)
	 */
	public void initCallee(EObjectFlatComboSettings settings) {
		callee.setInput(settings);
		if (current != null) {
			callee.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#setCallee(EObject newValue)
	 * 
	 */
	public void setCallee(EObject newValue) {
		if (newValue != null) {
			callee.setSelection(new StructuredSelection(newValue));
		} else {
			callee.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#setCalleeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCalleeButtonMode(ButtonsModeEnum newValue) {
		callee.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#addFilterCallee(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCallee(ViewerFilter filter) {
		callee.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#addBusinessFilterCallee(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCallee(ViewerFilter filter) {
		callee.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#getActivity()
	 * 
	 */
	public EObject getActivity() {
		if (activity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) activity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#initActivity(EObjectFlatComboSettings)
	 */
	public void initActivity(EObjectFlatComboSettings settings) {
		activity.setInput(settings);
		if (current != null) {
			activity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#setActivity(EObject newValue)
	 * 
	 */
	public void setActivity(EObject newValue) {
		if (newValue != null) {
			activity.setSelection(new StructuredSelection(newValue));
		} else {
			activity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#setActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setActivityButtonMode(ButtonsModeEnum newValue) {
		activity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#addFilterActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActivity(ViewerFilter filter) {
		activity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.core.parts.ActivityCallExpressionPropertiesEditionPart#addBusinessFilterActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActivity(ViewerFilter filter) {
		activity.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreMessages.ActivityCallExpression_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

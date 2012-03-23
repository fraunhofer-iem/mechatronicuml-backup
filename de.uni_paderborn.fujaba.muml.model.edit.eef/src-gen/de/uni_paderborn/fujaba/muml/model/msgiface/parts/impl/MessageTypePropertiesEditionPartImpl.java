/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.parts.impl;

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

import de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.msgiface.parts.MsgifaceViewsRepository;
import de.uni_paderborn.fujaba.muml.model.msgiface.providers.MsgifaceMessages;


// End of user code

/**
 * 
 * 
 */
public class MessageTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MessageTypePropertiesEditionPart {

	protected Text name;
	protected Text comment;
	protected EObjectFlatComboViewer messageInterface;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MessageTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence messageTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = messageTypeStep.addStep(MsgifaceViewsRepository.MessageType.Properties.class);
		propertiesStep.addStep(MsgifaceViewsRepository.MessageType.Properties.name);
		propertiesStep.addStep(MsgifaceViewsRepository.MessageType.Properties.comment);
		propertiesStep.addStep(MsgifaceViewsRepository.MessageType.Properties.messageInterface);
		
		
		composer = new PartComposer(messageTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MsgifaceViewsRepository.MessageType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MsgifaceViewsRepository.MessageType.Properties.name) {
					return createNameText(parent);
				}
				if (key == MsgifaceViewsRepository.MessageType.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == MsgifaceViewsRepository.MessageType.Properties.messageInterface) {
					return createMessageInterfaceFlatComboViewer(parent);
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
		propertiesGroup.setText(MsgifaceMessages.MessageTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MsgifaceMessages.MessageTypePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MsgifaceViewsRepository.MessageType.Properties.name, MsgifaceViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MessageTypePropertiesEditionPartImpl.this, MsgifaceViewsRepository.MessageType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MessageTypePropertiesEditionPartImpl.this, MsgifaceViewsRepository.MessageType.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MsgifaceViewsRepository.MessageType.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MsgifaceViewsRepository.MessageType.Properties.name, MsgifaceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, MsgifaceMessages.MessageTypePropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(MsgifaceViewsRepository.MessageType.Properties.comment, MsgifaceViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MessageTypePropertiesEditionPartImpl.this, MsgifaceViewsRepository.MessageType.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MessageTypePropertiesEditionPartImpl.this, MsgifaceViewsRepository.MessageType.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, MsgifaceViewsRepository.MessageType.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MsgifaceViewsRepository.MessageType.Properties.comment, MsgifaceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createMessageInterfaceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MsgifaceMessages.MessageTypePropertiesEditionPart_MessageInterfaceLabel, propertiesEditionComponent.isRequired(MsgifaceViewsRepository.MessageType.Properties.messageInterface, MsgifaceViewsRepository.SWT_KIND));
		messageInterface = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MsgifaceViewsRepository.MessageType.Properties.messageInterface, MsgifaceViewsRepository.SWT_KIND));
		messageInterface.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		messageInterface.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MessageTypePropertiesEditionPartImpl.this, MsgifaceViewsRepository.MessageType.Properties.messageInterface, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMessageInterface()));
			}

		});
		GridData messageInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		messageInterface.setLayoutData(messageInterfaceData);
		messageInterface.setID(MsgifaceViewsRepository.MessageType.Properties.messageInterface);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MsgifaceViewsRepository.MessageType.Properties.messageInterface, MsgifaceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#setName(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#setComment(String newValue)
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
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#getMessageInterface()
	 * 
	 */
	public EObject getMessageInterface() {
		if (messageInterface.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) messageInterface.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#initMessageInterface(EObjectFlatComboSettings)
	 */
	public void initMessageInterface(EObjectFlatComboSettings settings) {
		messageInterface.setInput(settings);
		if (current != null) {
			messageInterface.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#setMessageInterface(EObject newValue)
	 * 
	 */
	public void setMessageInterface(EObject newValue) {
		if (newValue != null) {
			messageInterface.setSelection(new StructuredSelection(newValue));
		} else {
			messageInterface.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#setMessageInterfaceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMessageInterfaceButtonMode(ButtonsModeEnum newValue) {
		messageInterface.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#addFilterMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMessageInterface(ViewerFilter filter) {
		messageInterface.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.parts.MessageTypePropertiesEditionPart#addBusinessFilterMessageInterface(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMessageInterface(ViewerFilter filter) {
		messageInterface.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MsgifaceMessages.MessageType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

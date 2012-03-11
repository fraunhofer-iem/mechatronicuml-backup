/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.storydriven.modeling.SDMPackage;

import de.uni_paderborn.fujaba.muml.model.component.Component;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.DiscretePortPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifaceFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;


// End of user code

/**
 * 
 * 
 */
public class DiscretePortPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for incomingConnectors ReferencesTable
	 */
	private	ReferencesTableSettings incomingConnectorsSettings;
	
	/**
	 * Settings for outgoingConnectors ReferencesTable
	 */
	private	ReferencesTableSettings outgoingConnectorsSettings;
	
	/**
	 * Settings for component EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings componentSettings;
	
	/**
	 * Settings for behavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings behaviorSettings;
	
	/**
	 * Settings for refines EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings refinesSettings;
	
	/**
	 * Settings for senderMessageInterface EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings senderMessageInterfaceSettings;
	
	/**
	 * Settings for receiverMessageInterface EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings receiverMessageInterfaceSettings;
	
	/**
	 * Settings for adaptationBehavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings adaptationBehaviorSettings;
	
	/**
	 * Settings for roleAndAdaptationBehavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings roleAndAdaptationBehaviorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DiscretePortPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject discretePort, String editing_mode) {
		super(editingContext, discretePort, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.DiscretePort.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final DiscretePort discretePort = (DiscretePort)elt;
			final DiscretePortPropertiesEditionPart basePart = (DiscretePortPropertiesEditionPart)editingPart;
			// init values
			if (discretePort.getName() != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discretePort.getName()));
			
			if (discretePort.getComment() != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discretePort.getComment()));
			
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors)) {
				incomingConnectorsSettings = new ReferencesTableSettings(discretePort, ComponentPackage.eINSTANCE.getPort_IncomingConnectors());
				basePart.initIncomingConnectors(incomingConnectorsSettings);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors)) {
				outgoingConnectorsSettings = new ReferencesTableSettings(discretePort, ComponentPackage.eINSTANCE.getPort_OutgoingConnectors());
				basePart.initOutgoingConnectors(outgoingConnectorsSettings);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.component_)) {
				// init part
				componentSettings = new EObjectFlatComboSettings(discretePort, ComponentPackage.eINSTANCE.getPort_Component());
				basePart.initComponent(componentSettings);
				// set the button mode
				basePart.setComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.behavior)) {
				// init part
				behaviorSettings = new EObjectFlatComboSettings(discretePort, CorePackage.eINSTANCE.getBehavioralElement_Behavior());
				basePart.initBehavior(behaviorSettings);
				// set the button mode
				basePart.setBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.refines)) {
				// init part
				refinesSettings = new EObjectFlatComboSettings(discretePort, ComponentPackage.eINSTANCE.getDiscretePort_Refines());
				basePart.initRefines(refinesSettings);
				// set the button mode
				basePart.setRefinesButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface)) {
				// init part
				senderMessageInterfaceSettings = new EObjectFlatComboSettings(discretePort, ComponentPackage.eINSTANCE.getDiscretePort_SenderMessageInterface());
				basePart.initSenderMessageInterface(senderMessageInterfaceSettings);
				// set the button mode
				basePart.setSenderMessageInterfaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface)) {
				// init part
				receiverMessageInterfaceSettings = new EObjectFlatComboSettings(discretePort, ComponentPackage.eINSTANCE.getDiscretePort_ReceiverMessageInterface());
				basePart.initReceiverMessageInterface(receiverMessageInterfaceSettings);
				// set the button mode
				basePart.setReceiverMessageInterfaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior)) {
				// init part
				adaptationBehaviorSettings = new EObjectFlatComboSettings(discretePort, ComponentPackage.eINSTANCE.getDiscretePort_AdaptationBehavior());
				basePart.initAdaptationBehavior(adaptationBehaviorSettings);
				// set the button mode
				basePart.setAdaptationBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior)) {
				// init part
				roleAndAdaptationBehaviorSettings = new EObjectFlatComboSettings(discretePort, ComponentPackage.eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior());
				basePart.initRoleAndAdaptationBehavior(roleAndAdaptationBehaviorSettings);
				// set the button mode
				basePart.setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			basePart.addFilterToIncomingConnectors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingConnectorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncomingConnectors(new EObjectFilter(ComponentPackage.eINSTANCE.getConnectorType()));
			// Start of user code for additional businessfilters for incomingConnectors
			// End of user code
			
			basePart.addFilterToOutgoingConnectors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingConnectorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoingConnectors(new EObjectFilter(ComponentPackage.eINSTANCE.getConnectorType()));
			// Start of user code for additional businessfilters for outgoingConnectors
			// End of user code
			
			basePart.addFilterToComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Component); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for component
			// End of user code
			
			basePart.addFilterToBehavior(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Behavior); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for behavior
			// End of user code
			
			basePart.addFilterToRefines(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Role); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for refines
			// End of user code
			
			basePart.addFilterToSenderMessageInterface(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MessageInterface); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for senderMessageInterface
			// End of user code
			
			basePart.addFilterToReceiverMessageInterface(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof MessageInterface); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for receiverMessageInterface
			// End of user code
			
			basePart.addFilterToAdaptationBehavior(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Behavior); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for adaptationBehavior
			// End of user code
			
			basePart.addFilterToRoleAndAdaptationBehavior(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Behavior); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for roleAndAdaptationBehavior
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}














	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.incomingConnectors) {
			return ComponentPackage.eINSTANCE.getPort_IncomingConnectors();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors) {
			return ComponentPackage.eINSTANCE.getPort_OutgoingConnectors();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.component_) {
			return ComponentPackage.eINSTANCE.getPort_Component();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.behavior) {
			return CorePackage.eINSTANCE.getBehavioralElement_Behavior();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.refines) {
			return ComponentPackage.eINSTANCE.getDiscretePort_Refines();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface) {
			return ComponentPackage.eINSTANCE.getDiscretePort_SenderMessageInterface();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface) {
			return ComponentPackage.eINSTANCE.getDiscretePort_ReceiverMessageInterface();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior) {
			return ComponentPackage.eINSTANCE.getDiscretePort_AdaptationBehavior();
		}
		if (editorKey == ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior) {
			return ComponentPackage.eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DiscretePort discretePort = (DiscretePort)semanticObject;
		if (ComponentViewsRepository.DiscretePort.Properties.name == event.getAffectedEditor()) {
			discretePort.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.DiscretePort.Properties.comment == event.getAffectedEditor()) {
			discretePort.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.DiscretePort.Properties.incomingConnectors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ConnectorType) {
					incomingConnectorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingConnectorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingConnectorsSettings.move(event.getNewIndex(), (ConnectorType) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ConnectorType) {
					outgoingConnectorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingConnectorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingConnectorsSettings.move(event.getNewIndex(), (ConnectorType) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.component_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				componentSettings.setToReference((Component)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, componentSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.behavior == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				behaviorSettings.setToReference((Behavior)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, behaviorSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.refines == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				refinesSettings.setToReference((Role)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Role eObject = PatternFactory.eINSTANCE.createRole();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				refinesSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				senderMessageInterfaceSettings.setToReference((MessageInterface)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MessageInterface eObject = MsgifaceFactory.eINSTANCE.createMessageInterface();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				senderMessageInterfaceSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				receiverMessageInterfaceSettings.setToReference((MessageInterface)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MessageInterface eObject = MsgifaceFactory.eINSTANCE.createMessageInterface();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				receiverMessageInterfaceSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				adaptationBehaviorSettings.setToReference((Behavior)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, adaptationBehaviorSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				roleAndAdaptationBehaviorSettings.setToReference((Behavior)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, roleAndAdaptationBehaviorSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DiscretePortPropertiesEditionPart basePart = (DiscretePortPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ComponentPackage.eINSTANCE.getPort_IncomingConnectors().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.DiscretePort.Properties.incomingConnectors))
				basePart.updateIncomingConnectors();
			if (ComponentPackage.eINSTANCE.getPort_OutgoingConnectors().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.DiscretePort.Properties.outgoingConnectors))
				basePart.updateOutgoingConnectors();
			if (ComponentPackage.eINSTANCE.getPort_Component().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.component_))
				basePart.setComponent((EObject)msg.getNewValue());
			if (CorePackage.eINSTANCE.getBehavioralElement_Behavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.behavior))
				basePart.setBehavior((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_Refines().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.refines))
				basePart.setRefines((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_SenderMessageInterface().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.senderMessageInterface))
				basePart.setSenderMessageInterface((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_ReceiverMessageInterface().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.receiverMessageInterface))
				basePart.setReceiverMessageInterface((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_AdaptationBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.adaptationBehavior))
				basePart.setAdaptationBehavior((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.DiscretePort.Properties.roleAndAdaptationBehavior))
				basePart.setRoleAndAdaptationBehavior((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.DiscretePort.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ComponentViewsRepository.DiscretePort.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.DiscretePort.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}

/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.component.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
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
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.HybridPortPropertiesEditionPart;
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
public class HybridPortPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for type EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings typeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HybridPortPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hybridPort, String editing_mode) {
		super(editingContext, hybridPort, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.HybridPort.class;
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
			final HybridPort hybridPort = (HybridPort)elt;
			final HybridPortPropertiesEditionPart basePart = (HybridPortPropertiesEditionPart)editingPart;
			// init values
			if (hybridPort.getName() != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), hybridPort.getName()));
			
			if (hybridPort.getComment() != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), hybridPort.getComment()));
			
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.incomingConnectors)) {
				incomingConnectorsSettings = new ReferencesTableSettings(hybridPort, ComponentPackage.eINSTANCE.getPort_IncomingConnectors());
				basePart.initIncomingConnectors(incomingConnectorsSettings);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.outgoingConnectors)) {
				outgoingConnectorsSettings = new ReferencesTableSettings(hybridPort, ComponentPackage.eINSTANCE.getPort_OutgoingConnectors());
				basePart.initOutgoingConnectors(outgoingConnectorsSettings);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.component_)) {
				// init part
				componentSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getPort_Component());
				basePart.initComponent(componentSettings);
				// set the button mode
				basePart.setComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.behavior)) {
				// init part
				behaviorSettings = new EObjectFlatComboSettings(hybridPort, CorePackage.eINSTANCE.getBehavioralElement_Behavior());
				basePart.initBehavior(behaviorSettings);
				// set the button mode
				basePart.setBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.refines)) {
				// init part
				refinesSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getDiscretePort_Refines());
				basePart.initRefines(refinesSettings);
				// set the button mode
				basePart.setRefinesButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.senderMessageInterface)) {
				// init part
				senderMessageInterfaceSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getDiscretePort_SenderMessageInterface());
				basePart.initSenderMessageInterface(senderMessageInterfaceSettings);
				// set the button mode
				basePart.setSenderMessageInterfaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.receiverMessageInterface)) {
				// init part
				receiverMessageInterfaceSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getDiscretePort_ReceiverMessageInterface());
				basePart.initReceiverMessageInterface(receiverMessageInterfaceSettings);
				// set the button mode
				basePart.setReceiverMessageInterfaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.adaptationBehavior)) {
				// init part
				adaptationBehaviorSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getDiscretePort_AdaptationBehavior());
				basePart.initAdaptationBehavior(adaptationBehaviorSettings);
				// set the button mode
				basePart.setAdaptationBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.roleAndAdaptationBehavior)) {
				// init part
				roleAndAdaptationBehaviorSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior());
				basePart.initRoleAndAdaptationBehavior(roleAndAdaptationBehaviorSettings);
				// set the button mode
				basePart.setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.kind)) {
				basePart.initKind((EEnum) ComponentPackage.eINSTANCE.getContinuousPort_Kind().getEType(), hybridPort.getKind());
			}
			if (isAccessible(ComponentViewsRepository.HybridPort.Properties.type)) {
				// init part
				typeSettings = new EObjectFlatComboSettings(hybridPort, ComponentPackage.eINSTANCE.getContinuousPort_Type());
				basePart.initType(typeSettings);
				// set the button mode
				basePart.setTypeButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			basePart.addFilterToType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof EDataType);
				}
			
			});
			// Start of user code for additional businessfilters for type
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
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.incomingConnectors) {
			return ComponentPackage.eINSTANCE.getPort_IncomingConnectors();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.outgoingConnectors) {
			return ComponentPackage.eINSTANCE.getPort_OutgoingConnectors();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.component_) {
			return ComponentPackage.eINSTANCE.getPort_Component();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.behavior) {
			return CorePackage.eINSTANCE.getBehavioralElement_Behavior();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.refines) {
			return ComponentPackage.eINSTANCE.getDiscretePort_Refines();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.senderMessageInterface) {
			return ComponentPackage.eINSTANCE.getDiscretePort_SenderMessageInterface();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.receiverMessageInterface) {
			return ComponentPackage.eINSTANCE.getDiscretePort_ReceiverMessageInterface();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.adaptationBehavior) {
			return ComponentPackage.eINSTANCE.getDiscretePort_AdaptationBehavior();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.roleAndAdaptationBehavior) {
			return ComponentPackage.eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.kind) {
			return ComponentPackage.eINSTANCE.getContinuousPort_Kind();
		}
		if (editorKey == ComponentViewsRepository.HybridPort.Properties.type) {
			return ComponentPackage.eINSTANCE.getContinuousPort_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HybridPort hybridPort = (HybridPort)semanticObject;
		if (ComponentViewsRepository.HybridPort.Properties.name == event.getAffectedEditor()) {
			hybridPort.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.HybridPort.Properties.comment == event.getAffectedEditor()) {
			hybridPort.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.HybridPort.Properties.incomingConnectors == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.outgoingConnectors == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.component_ == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.behavior == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.refines == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.senderMessageInterface == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.receiverMessageInterface == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.adaptationBehavior == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.roleAndAdaptationBehavior == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.HybridPort.Properties.kind == event.getAffectedEditor()) {
			hybridPort.setKind((ContinuousPortDirectionKind)event.getNewValue());
		}
		if (ComponentViewsRepository.HybridPort.Properties.type == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeSettings.setToReference((EDataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EDataType eObject = EcoreFactory.eINSTANCE.createEDataType();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				typeSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			HybridPortPropertiesEditionPart basePart = (HybridPortPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ComponentPackage.eINSTANCE.getPort_IncomingConnectors().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.HybridPort.Properties.incomingConnectors))
				basePart.updateIncomingConnectors();
			if (ComponentPackage.eINSTANCE.getPort_OutgoingConnectors().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.HybridPort.Properties.outgoingConnectors))
				basePart.updateOutgoingConnectors();
			if (ComponentPackage.eINSTANCE.getPort_Component().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.component_))
				basePart.setComponent((EObject)msg.getNewValue());
			if (CorePackage.eINSTANCE.getBehavioralElement_Behavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.behavior))
				basePart.setBehavior((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_Refines().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.refines))
				basePart.setRefines((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_SenderMessageInterface().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.senderMessageInterface))
				basePart.setSenderMessageInterface((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_ReceiverMessageInterface().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.receiverMessageInterface))
				basePart.setReceiverMessageInterface((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_AdaptationBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.adaptationBehavior))
				basePart.setAdaptationBehavior((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getDiscretePort_RoleAndAdaptationBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.roleAndAdaptationBehavior))
				basePart.setRoleAndAdaptationBehavior((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getContinuousPort_Kind().equals(msg.getFeature()) && isAccessible(ComponentViewsRepository.HybridPort.Properties.kind))
				basePart.setKind((Enumerator)msg.getNewValue());
			
			if (ComponentPackage.eINSTANCE.getContinuousPort_Type().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.HybridPort.Properties.type))
				basePart.setType((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.HybridPort.Properties.name || key == ComponentViewsRepository.HybridPort.Properties.kind || key == ComponentViewsRepository.HybridPort.Properties.type;
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
				if (ComponentViewsRepository.HybridPort.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.HybridPort.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.HybridPort.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ComponentPackage.eINSTANCE.getContinuousPort_Kind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ComponentPackage.eINSTANCE.getContinuousPort_Kind().getEAttributeType(), newValue);
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

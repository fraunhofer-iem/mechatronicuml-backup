/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.pattern.components;

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

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifaceFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;
import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.PatternViewsRepository;
import de.uni_paderborn.fujaba.muml.model.pattern.parts.RolePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class RolePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for behavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings behaviorSettings;
	
	/**
	 * Settings for incomingRoleConnector EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings incomingRoleConnectorSettings;
	
	/**
	 * Settings for coordinationPattern EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings coordinationPatternSettings;
	
	/**
	 * Settings for senderMessageInterface EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings senderMessageInterfaceSettings;
	
	/**
	 * Settings for receiverMessageInterface EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings receiverMessageInterfaceSettings;
	
	/**
	 * Settings for port ReferencesTable
	 */
	private	ReferencesTableSettings portSettings;
	
	/**
	 * Settings for adaptationBehavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings adaptationBehaviorSettings;
	
	/**
	 * Settings for roleAndAdaptationBehavior EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings roleAndAdaptationBehaviorSettings;
	
	/**
	 * Settings for outgoingRoleConnector EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings outgoingRoleConnectorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RolePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject role, String editing_mode) {
		super(editingContext, role, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PatternViewsRepository.class;
		partKey = PatternViewsRepository.Role.class;
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
			final Role role = (Role)elt;
			final RolePropertiesEditionPart basePart = (RolePropertiesEditionPart)editingPart;
			// init values
			if (role.getName() != null && isAccessible(PatternViewsRepository.Role.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getName()));
			
			if (isAccessible(PatternViewsRepository.Role.Properties.behavior)) {
				// init part
				behaviorSettings = new EObjectFlatComboSettings(role, CorePackage.eINSTANCE.getBehavioralElement_Behavior());
				basePart.initBehavior(behaviorSettings);
				// set the button mode
				basePart.setBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.incomingRoleConnector)) {
				// init part
				incomingRoleConnectorSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_IncomingRoleConnector());
				basePart.initIncomingRoleConnector(incomingRoleConnectorSettings);
				// set the button mode
				basePart.setIncomingRoleConnectorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.coordinationPattern)) {
				// init part
				coordinationPatternSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_CoordinationPattern());
				basePart.initCoordinationPattern(coordinationPatternSettings);
				// set the button mode
				basePart.setCoordinationPatternButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.senderMessageInterface)) {
				// init part
				senderMessageInterfaceSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_SenderMessageInterface());
				basePart.initSenderMessageInterface(senderMessageInterfaceSettings);
				// set the button mode
				basePart.setSenderMessageInterfaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.receiverMessageInterface)) {
				// init part
				receiverMessageInterfaceSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_ReceiverMessageInterface());
				basePart.initReceiverMessageInterface(receiverMessageInterfaceSettings);
				// set the button mode
				basePart.setReceiverMessageInterfaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.port)) {
				portSettings = new ReferencesTableSettings(role, PatternPackage.eINSTANCE.getRole_Port());
				basePart.initPort(portSettings);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.adaptationBehavior)) {
				// init part
				adaptationBehaviorSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_AdaptationBehavior());
				basePart.initAdaptationBehavior(adaptationBehaviorSettings);
				// set the button mode
				basePart.setAdaptationBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior)) {
				// init part
				roleAndAdaptationBehaviorSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_RoleAndAdaptationBehavior());
				basePart.initRoleAndAdaptationBehavior(roleAndAdaptationBehaviorSettings);
				// set the button mode
				basePart.setRoleAndAdaptationBehaviorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.ordered)) {
				basePart.setOrdered(role.isOrdered());
			}
			if (isAccessible(PatternViewsRepository.Role.Properties.outgoingRoleConnector)) {
				// init part
				outgoingRoleConnectorSettings = new EObjectFlatComboSettings(role, PatternPackage.eINSTANCE.getRole_OutgoingRoleConnector());
				basePart.initOutgoingRoleConnector(outgoingRoleConnectorSettings);
				// set the button mode
				basePart.setOutgoingRoleConnectorButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
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
			
			basePart.addFilterToIncomingRoleConnector(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof RoleConnector); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for incomingRoleConnector
			// End of user code
			
			basePart.addFilterToCoordinationPattern(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof CoordinationPattern);
				}
			
			});
			// Start of user code for additional businessfilters for coordinationPattern
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
			
			basePart.addFilterToPort(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInPortTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToPort(new EObjectFilter(ComponentPackage.eINSTANCE.getDiscretePort()));
			// Start of user code for additional businessfilters for port
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
			
			
			basePart.addFilterToOutgoingRoleConnector(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof RoleConnector); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for outgoingRoleConnector
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
		if (editorKey == PatternViewsRepository.Role.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.behavior) {
			return CorePackage.eINSTANCE.getBehavioralElement_Behavior();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.incomingRoleConnector) {
			return PatternPackage.eINSTANCE.getRole_IncomingRoleConnector();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.coordinationPattern) {
			return PatternPackage.eINSTANCE.getRole_CoordinationPattern();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.senderMessageInterface) {
			return PatternPackage.eINSTANCE.getRole_SenderMessageInterface();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.receiverMessageInterface) {
			return PatternPackage.eINSTANCE.getRole_ReceiverMessageInterface();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.port) {
			return PatternPackage.eINSTANCE.getRole_Port();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.adaptationBehavior) {
			return PatternPackage.eINSTANCE.getRole_AdaptationBehavior();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior) {
			return PatternPackage.eINSTANCE.getRole_RoleAndAdaptationBehavior();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.ordered) {
			return PatternPackage.eINSTANCE.getRole_Ordered();
		}
		if (editorKey == PatternViewsRepository.Role.Properties.outgoingRoleConnector) {
			return PatternPackage.eINSTANCE.getRole_OutgoingRoleConnector();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Role role = (Role)semanticObject;
		if (PatternViewsRepository.Role.Properties.name == event.getAffectedEditor()) {
			role.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (PatternViewsRepository.Role.Properties.behavior == event.getAffectedEditor()) {
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
		if (PatternViewsRepository.Role.Properties.incomingRoleConnector == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				incomingRoleConnectorSettings.setToReference((RoleConnector)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RoleConnector eObject = PatternFactory.eINSTANCE.createRoleConnector();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				incomingRoleConnectorSettings.setToReference(eObject);
			}
		}
		if (PatternViewsRepository.Role.Properties.coordinationPattern == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				coordinationPatternSettings.setToReference((CoordinationPattern)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				CoordinationPattern eObject = PatternFactory.eINSTANCE.createCoordinationPattern();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				coordinationPatternSettings.setToReference(eObject);
			}
		}
		if (PatternViewsRepository.Role.Properties.senderMessageInterface == event.getAffectedEditor()) {
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
		if (PatternViewsRepository.Role.Properties.receiverMessageInterface == event.getAffectedEditor()) {
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
		if (PatternViewsRepository.Role.Properties.port == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof DiscretePort) {
					portSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				portSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				portSettings.move(event.getNewIndex(), (DiscretePort) event.getNewValue());
			}
		}
		if (PatternViewsRepository.Role.Properties.adaptationBehavior == event.getAffectedEditor()) {
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
		if (PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior == event.getAffectedEditor()) {
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
		if (PatternViewsRepository.Role.Properties.ordered == event.getAffectedEditor()) {
			role.setOrdered((Boolean)event.getNewValue());
		}
		if (PatternViewsRepository.Role.Properties.outgoingRoleConnector == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				outgoingRoleConnectorSettings.setToReference((RoleConnector)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RoleConnector eObject = PatternFactory.eINSTANCE.createRoleConnector();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				outgoingRoleConnectorSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RolePropertiesEditionPart basePart = (RolePropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CorePackage.eINSTANCE.getBehavioralElement_Behavior().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.behavior))
				basePart.setBehavior((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_IncomingRoleConnector().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.incomingRoleConnector))
				basePart.setIncomingRoleConnector((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_CoordinationPattern().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.coordinationPattern))
				basePart.setCoordinationPattern((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_SenderMessageInterface().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.senderMessageInterface))
				basePart.setSenderMessageInterface((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_ReceiverMessageInterface().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.receiverMessageInterface))
				basePart.setReceiverMessageInterface((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_Port().equals(msg.getFeature())  && isAccessible(PatternViewsRepository.Role.Properties.port))
				basePart.updatePort();
			if (PatternPackage.eINSTANCE.getRole_AdaptationBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.adaptationBehavior))
				basePart.setAdaptationBehavior((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_RoleAndAdaptationBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.roleAndAdaptationBehavior))
				basePart.setRoleAndAdaptationBehavior((EObject)msg.getNewValue());
			if (PatternPackage.eINSTANCE.getRole_Ordered().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.ordered))
				basePart.setOrdered((Boolean)msg.getNewValue());
			
			if (PatternPackage.eINSTANCE.getRole_OutgoingRoleConnector().equals(msg.getFeature()) && basePart != null && isAccessible(PatternViewsRepository.Role.Properties.outgoingRoleConnector))
				basePart.setOutgoingRoleConnector((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PatternViewsRepository.Role.Properties.name || key == PatternViewsRepository.Role.Properties.coordinationPattern;
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
				if (PatternViewsRepository.Role.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (PatternViewsRepository.Role.Properties.ordered == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(PatternPackage.eINSTANCE.getRole_Ordered().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PatternPackage.eINSTANCE.getRole_Ordered().getEAttributeType(), newValue);
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

/**
 * Generated with Acceleo
 */
package de.uni_paderborn.fujaba.muml.model.instance.components;

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

import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.parts.DiscreteSinglePortInstancePropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.instance.parts.InstanceViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DiscreteSinglePortInstancePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for portType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings portTypeSettings;
	
	/**
	 * Settings for componentInstance EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings componentInstanceSettings;
	
	/**
	 * Settings for incomingConnectorInstances ReferencesTable
	 */
	private	ReferencesTableSettings incomingConnectorInstancesSettings;
	
	/**
	 * Settings for outgoingConnectorInstances ReferencesTable
	 */
	private	ReferencesTableSettings outgoingConnectorInstancesSettings;
	
	/**
	 * Settings for multiPortInstance EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings multiPortInstanceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DiscreteSinglePortInstancePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject discreteSinglePortInstance, String editing_mode) {
		super(editingContext, discreteSinglePortInstance, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = InstanceViewsRepository.class;
		partKey = InstanceViewsRepository.DiscreteSinglePortInstance.class;
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
			final DiscreteSinglePortInstance discreteSinglePortInstance = (DiscreteSinglePortInstance)elt;
			final DiscreteSinglePortInstancePropertiesEditionPart basePart = (DiscreteSinglePortInstancePropertiesEditionPart)editingPart;
			// init values
			if (discreteSinglePortInstance.getName() != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discreteSinglePortInstance.getName()));
			
			if (discreteSinglePortInstance.getComment() != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), discreteSinglePortInstance.getComment()));
			
			if (isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType)) {
				// init part
				portTypeSettings = new EObjectFlatComboSettings(discreteSinglePortInstance, InstancePackage.eINSTANCE.getPortInstance_PortType());
				basePart.initPortType(portTypeSettings);
				// set the button mode
				basePart.setPortTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance)) {
				// init part
				componentInstanceSettings = new EObjectFlatComboSettings(discreteSinglePortInstance, InstancePackage.eINSTANCE.getPortInstance_ComponentInstance());
				basePart.initComponentInstance(componentInstanceSettings);
				// set the button mode
				basePart.setComponentInstanceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances)) {
				incomingConnectorInstancesSettings = new ReferencesTableSettings(discreteSinglePortInstance, InstancePackage.eINSTANCE.getPortInstance_IncomingConnectorInstances());
				basePart.initIncomingConnectorInstances(incomingConnectorInstancesSettings);
			}
			if (isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances)) {
				outgoingConnectorInstancesSettings = new ReferencesTableSettings(discreteSinglePortInstance, InstancePackage.eINSTANCE.getPortInstance_OutgoingConnectorInstances());
				basePart.initOutgoingConnectorInstances(outgoingConnectorInstancesSettings);
			}
			if (isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance)) {
				// init part
				multiPortInstanceSettings = new EObjectFlatComboSettings(discreteSinglePortInstance, InstancePackage.eINSTANCE.getDiscreteSinglePortInstance_MultiPortInstance());
				basePart.initMultiPortInstance(multiPortInstanceSettings);
				// set the button mode
				basePart.setMultiPortInstanceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			basePart.addFilterToPortType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Port);
				}
			
			});
			// Start of user code for additional businessfilters for portType
			// End of user code
			
			basePart.addFilterToComponentInstance(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ComponentInstance); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for componentInstance
			// End of user code
			
			basePart.addFilterToIncomingConnectorInstances(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIncomingConnectorInstancesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIncomingConnectorInstances(new EObjectFilter(InstancePackage.eINSTANCE.getConnectorInstance()));
			// Start of user code for additional businessfilters for incomingConnectorInstances
			// End of user code
			
			basePart.addFilterToOutgoingConnectorInstances(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOutgoingConnectorInstancesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOutgoingConnectorInstances(new EObjectFilter(InstancePackage.eINSTANCE.getConnectorInstance()));
			// Start of user code for additional businessfilters for outgoingConnectorInstances
			// End of user code
			
			basePart.addFilterToMultiPortInstance(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof DiscreteMultiPortInstance); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for multiPortInstance
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
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType) {
			return InstancePackage.eINSTANCE.getPortInstance_PortType();
		}
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance) {
			return InstancePackage.eINSTANCE.getPortInstance_ComponentInstance();
		}
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances) {
			return InstancePackage.eINSTANCE.getPortInstance_IncomingConnectorInstances();
		}
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances) {
			return InstancePackage.eINSTANCE.getPortInstance_OutgoingConnectorInstances();
		}
		if (editorKey == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance) {
			return InstancePackage.eINSTANCE.getDiscreteSinglePortInstance_MultiPortInstance();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DiscreteSinglePortInstance discreteSinglePortInstance = (DiscreteSinglePortInstance)semanticObject;
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name == event.getAffectedEditor()) {
			discreteSinglePortInstance.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment == event.getAffectedEditor()) {
			discreteSinglePortInstance.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				portTypeSettings.setToReference((Port)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, portTypeSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				componentInstanceSettings.setToReference((ComponentInstance)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ComponentInstance eObject = InstanceFactory.eINSTANCE.createComponentInstance();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				componentInstanceSettings.setToReference(eObject);
			}
		}
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ConnectorInstance) {
					incomingConnectorInstancesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				incomingConnectorInstancesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				incomingConnectorInstancesSettings.move(event.getNewIndex(), (ConnectorInstance) event.getNewValue());
			}
		}
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ConnectorInstance) {
					outgoingConnectorInstancesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outgoingConnectorInstancesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outgoingConnectorInstancesSettings.move(event.getNewIndex(), (ConnectorInstance) event.getNewValue());
			}
		}
		if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				multiPortInstanceSettings.setToReference((DiscreteMultiPortInstance)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				DiscreteMultiPortInstance eObject = InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				multiPortInstanceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			DiscreteSinglePortInstancePropertiesEditionPart basePart = (DiscreteSinglePortInstancePropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (InstancePackage.eINSTANCE.getPortInstance_PortType().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType))
				basePart.setPortType((EObject)msg.getNewValue());
			if (InstancePackage.eINSTANCE.getPortInstance_ComponentInstance().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.componentInstance))
				basePart.setComponentInstance((EObject)msg.getNewValue());
			if (InstancePackage.eINSTANCE.getPortInstance_IncomingConnectorInstances().equals(msg.getFeature())  && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.incomingConnectorInstances))
				basePart.updateIncomingConnectorInstances();
			if (InstancePackage.eINSTANCE.getPortInstance_OutgoingConnectorInstances().equals(msg.getFeature())  && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.outgoingConnectorInstances))
				basePart.updateOutgoingConnectorInstances();
			if (InstancePackage.eINSTANCE.getDiscreteSinglePortInstance_MultiPortInstance().equals(msg.getFeature()) && basePart != null && isAccessible(InstanceViewsRepository.DiscreteSinglePortInstance.Properties.multiPortInstance))
				basePart.setMultiPortInstance((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name || key == InstanceViewsRepository.DiscreteSinglePortInstance.Properties.portType;
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
				if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (InstanceViewsRepository.DiscreteSinglePortInstance.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
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

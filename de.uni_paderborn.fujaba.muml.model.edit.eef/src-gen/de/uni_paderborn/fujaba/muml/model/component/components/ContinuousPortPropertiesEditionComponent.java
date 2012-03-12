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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
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
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPortDirectionKind;
import de.uni_paderborn.fujaba.muml.model.component.parts.ComponentViewsRepository;
import de.uni_paderborn.fujaba.muml.model.component.parts.ContinuousPortPropertiesEditionPart;
import de.uni_paderborn.fujaba.muml.model.core.DataType;


// End of user code

/**
 * 
 * 
 */
public class ContinuousPortPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for type EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings typeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ContinuousPortPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject continuousPort, String editing_mode) {
		super(editingContext, continuousPort, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.ContinuousPort.class;
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
			final ContinuousPort continuousPort = (ContinuousPort)elt;
			final ContinuousPortPropertiesEditionPart basePart = (ContinuousPortPropertiesEditionPart)editingPart;
			// init values
			if (continuousPort.getName() != null && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), continuousPort.getName()));
			
			if (continuousPort.getComment() != null && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), continuousPort.getComment()));
			
			if (isAccessible(ComponentViewsRepository.ContinuousPort.Properties.incomingConnectors)) {
				incomingConnectorsSettings = new ReferencesTableSettings(continuousPort, ComponentPackage.eINSTANCE.getPort_IncomingConnectors());
				basePart.initIncomingConnectors(incomingConnectorsSettings);
			}
			if (isAccessible(ComponentViewsRepository.ContinuousPort.Properties.outgoingConnectors)) {
				outgoingConnectorsSettings = new ReferencesTableSettings(continuousPort, ComponentPackage.eINSTANCE.getPort_OutgoingConnectors());
				basePart.initOutgoingConnectors(outgoingConnectorsSettings);
			}
			if (isAccessible(ComponentViewsRepository.ContinuousPort.Properties.component_)) {
				// init part
				componentSettings = new EObjectFlatComboSettings(continuousPort, ComponentPackage.eINSTANCE.getPort_Component());
				basePart.initComponent(componentSettings);
				// set the button mode
				basePart.setComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.ContinuousPort.Properties.kind)) {
				basePart.initKind((EEnum) ComponentPackage.eINSTANCE.getContinuousPort_Kind().getEType(), continuousPort.getKind());
			}
			if (isAccessible(ComponentViewsRepository.ContinuousPort.Properties.type)) {
				// init part
				typeSettings = new EObjectFlatComboSettings(continuousPort, ComponentPackage.eINSTANCE.getContinuousPort_Type());
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
			
			
			basePart.addFilterToType(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof DataType);
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
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.name) {
			return SDMPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.comment) {
			return SDMPackage.eINSTANCE.getCommentableElement_Comment();
		}
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.incomingConnectors) {
			return ComponentPackage.eINSTANCE.getPort_IncomingConnectors();
		}
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.outgoingConnectors) {
			return ComponentPackage.eINSTANCE.getPort_OutgoingConnectors();
		}
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.component_) {
			return ComponentPackage.eINSTANCE.getPort_Component();
		}
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.kind) {
			return ComponentPackage.eINSTANCE.getContinuousPort_Kind();
		}
		if (editorKey == ComponentViewsRepository.ContinuousPort.Properties.type) {
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
		ContinuousPort continuousPort = (ContinuousPort)semanticObject;
		if (ComponentViewsRepository.ContinuousPort.Properties.name == event.getAffectedEditor()) {
			continuousPort.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.ContinuousPort.Properties.comment == event.getAffectedEditor()) {
			continuousPort.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.ContinuousPort.Properties.incomingConnectors == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.ContinuousPort.Properties.outgoingConnectors == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.ContinuousPort.Properties.component_ == event.getAffectedEditor()) {
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
		if (ComponentViewsRepository.ContinuousPort.Properties.kind == event.getAffectedEditor()) {
			continuousPort.setKind((ContinuousPortDirectionKind)event.getNewValue());
		}
		if (ComponentViewsRepository.ContinuousPort.Properties.type == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeSettings.setToReference((DataType)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, typeSettings, editingContext.getAdapterFactory());
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
			ContinuousPortPropertiesEditionPart basePart = (ContinuousPortPropertiesEditionPart)editingPart;
			if (SDMPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SDMPackage.eINSTANCE.getCommentableElement_Comment().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (ComponentPackage.eINSTANCE.getPort_IncomingConnectors().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.incomingConnectors))
				basePart.updateIncomingConnectors();
			if (ComponentPackage.eINSTANCE.getPort_OutgoingConnectors().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.outgoingConnectors))
				basePart.updateOutgoingConnectors();
			if (ComponentPackage.eINSTANCE.getPort_Component().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.component_))
				basePart.setComponent((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getContinuousPort_Kind().equals(msg.getFeature()) && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.kind))
				basePart.setKind((Enumerator)msg.getNewValue());
			
			if (ComponentPackage.eINSTANCE.getContinuousPort_Type().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.ContinuousPort.Properties.type))
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
		return key == ComponentViewsRepository.ContinuousPort.Properties.name || key == ComponentViewsRepository.ContinuousPort.Properties.kind || key == ComponentViewsRepository.ContinuousPort.Properties.type;
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
				if (ComponentViewsRepository.ContinuousPort.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.ContinuousPort.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SDMPackage.eINSTANCE.getCommentableElement_Comment().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.ContinuousPort.Properties.kind == event.getAffectedEditor()) {
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

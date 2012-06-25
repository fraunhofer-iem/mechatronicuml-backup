package de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class MumlModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_2017);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_2018);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_2019);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_2020);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AtomicComponentInstance_2016);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_2015);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstanceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3027);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3029);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3030);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstanceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3027);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3029);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3023);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3026);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.AtomicComponentInstance2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3027);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3029);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3030);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.StructuredComponentInstance2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.HybridPortInstance_3027);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteSinglePortInstance_3028);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.DiscreteMultiPortInstance_3029);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ContinuousPortInstance_3030);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.ComponentInstanceConfiguration_3023);
			return types;
		}
		if (editPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ComponentInstanceConfigurationComponentInstanceConfigurationContentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.AtomicComponentInstance_3024);
			types.add(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.providers.MumlElementTypes.StructuredComponentInstance_3025);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstanceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstanceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstanceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstanceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.HybridPortInstance2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteSinglePortInstance3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.DiscreteMultiPortInstance2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) {
			return ((de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.edit.parts.ContinuousPortInstance2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.ComponentinstanceconfigurationDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.MumlModelingAssistantProviderMessage);
		dialog.setTitle(de.uni_paderborn.fujaba.muml.componentinstanceconfigurationeditor.diagram.part.Messages.MumlModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}

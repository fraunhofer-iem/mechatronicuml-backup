package org.muml.pm.hardware.resource.diagram.edit.policies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;
import org.muml.pm.hardware.hwresource.Cache;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.Processor;
import org.muml.pm.hardware.resource.diagram.expressions.HardwareAbstractExpression;
import org.muml.pm.hardware.resource.diagram.expressions.HardwareOCLFactory;
import org.muml.pm.hardware.resource.diagram.part.HardwareDiagramEditorPlugin;
import org.muml.pm.hardware.resource.diagram.part.HardwareVisualIDRegistry;
import org.muml.pm.hardware.resource.diagram.providers.HardwareElementTypes;

/**
 * @generated
 */
public class HardwareBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected HardwareBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(HardwareVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = HardwareElementTypes.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = HardwareDiagramEditorPlugin.getInstance().getLinkConstraints();
		if (cached == null) {
			HardwareDiagramEditorPlugin.getInstance().setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		* @generated
		*/
		public boolean canCreateProcessorOwnedCache_4002(Processor source, Cache target, View sourceView,
				View targetView) {
			if (source != null) {
				if (source.getOwnedCache() != null) {
					return false;
				}
			}
			if (target != null && (target.getUsedByProcessor().contains(target))) {
				return false;
			}

			return canExistProcessorOwnedCache_4002(source, target, sourceView, targetView);
		}

		/**
		* @generated
		*/
		public boolean canExistProcessorOwnedCache_4002(Processor source, Cache target, View sourceView,
				View targetView) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> envType = new HashMap<String, EClassifier>();
					Map<String, Object> env = new HashMap<String, Object>();
					envType.put("oppositeEnd", HwresourcePackage.eINSTANCE.getCache()); //$NON-NLS-1$
					env.put("oppositeEnd", target);
					envType.put("view", NotationPackage.Literals.VIEW);
					env.put("view", sourceView);
					envType.put("oppositeView", NotationPackage.Literals.VIEW);
					env.put("oppositeView", targetView);

					HardwareAbstractExpression expression = HardwareOCLFactory.getExpression(31,
							HwresourcePackage.eINSTANCE.getProcessor(), envType);
					Object sourceVal = expression.evaluate(source, env); //$NON-NLS-1$

					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> envType = new HashMap<String, EClassifier>();
					Map<String, Object> env = new HashMap<String, Object>();
					envType.put("oppositeEnd", HwresourcePackage.eINSTANCE.getProcessor()); //$NON-NLS-1$
					env.put("oppositeEnd", source);
					envType.put("view", NotationPackage.Literals.VIEW);
					env.put("view", targetView);
					envType.put("oppositeView", NotationPackage.Literals.VIEW);
					env.put("oppositeView", sourceView);

					HardwareAbstractExpression expression = HardwareOCLFactory.getExpression(32,
							HwresourcePackage.eINSTANCE.getCache(), envType);
					Object targetVal = expression.evaluate(target, env); //$NON-NLS-1$

					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				HardwareDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		* @generated
		*/
		public java.lang.String getErrorProcessorOwnedCache_4002(Processor source, Cache target, View sourceView,
				View targetView) {
			try {
				if (source == null) {
					return null;
				} else {
					Map<String, EClassifier> envType = new HashMap<String, EClassifier>();
					Map<String, Object> env = new HashMap<String, Object>();
					envType.put("oppositeEnd", HwresourcePackage.eINSTANCE.getCache()); //$NON-NLS-1$
					env.put("oppositeEnd", target);
					envType.put("view", NotationPackage.Literals.VIEW);
					env.put("view", sourceView);
					envType.put("oppositeView", NotationPackage.Literals.VIEW);
					env.put("oppositeView", targetView);

					HardwareAbstractExpression expression = HardwareOCLFactory.getExpression(31,
							HwresourcePackage.eINSTANCE.getProcessor(), envType);
					Object sourceVal = expression.evaluate(source, env); //$NON-NLS-1$

					if (false == sourceVal instanceof Boolean || !((Boolean) sourceVal).booleanValue()) {
						String body = expression.body().trim();
						if (body.startsWith("--")) {
							int end = body.indexOf('\n');
							if (end < 0) {
								end = body.length() - 1;
							} else {
								if (body.charAt(end - 1) == '\r') {
									end--;
								}
							}
							return body.substring(2, end);
						}
						return "Creation is not allowed.";
					} // else fall-through
				}
				if (target == null) {
					return null;
				} else {
					Map<String, EClassifier> envType = new HashMap<String, EClassifier>();
					Map<String, Object> env = new HashMap<String, Object>();
					envType.put("oppositeEnd", HwresourcePackage.eINSTANCE.getProcessor()); //$NON-NLS-1$
					env.put("oppositeEnd", source);
					envType.put("view", NotationPackage.Literals.VIEW);
					env.put("view", targetView);
					envType.put("oppositeView", NotationPackage.Literals.VIEW);
					env.put("oppositeView", sourceView);

					HardwareAbstractExpression expression = HardwareOCLFactory.getExpression(32,
							HwresourcePackage.eINSTANCE.getCache(), envType);
					Object targetVal = expression.evaluate(target, env); //$NON-NLS-1$

					if (false == targetVal instanceof Boolean || !((Boolean) targetVal).booleanValue()) {
						String body = expression.body().trim();
						if (body.startsWith("--")) {
							int end = body.indexOf('\n');
							if (end < 0) {
								end = body.length() - 1;
							} else {
								if (body.charAt(end - 1) == '\r') {
									end--;
								}
							}
							return body.substring(2, end);
						}
						return "Creation is not allowed.";
					} // else fall-through
				}
				return null;
			} catch (Exception e) {
				HardwareDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return "Link constraint evaluation error";
			}
		}

	}

}

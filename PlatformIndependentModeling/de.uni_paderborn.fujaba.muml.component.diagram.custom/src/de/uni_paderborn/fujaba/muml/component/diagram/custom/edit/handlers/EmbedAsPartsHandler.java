package de.uni_paderborn.fujaba.muml.component.diagram.custom.edit.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.component.diagram.custom.part.Activator;
import de.uni_paderborn.fujaba.muml.component.diagram.part.ComponentDiagramEditorPlugin;
import de.uni_paderborn.fujaba.muml.component.diagram.part.MumlVisualIDRegistry;

public class EmbedAsPartsHandler extends AbstractHandler {

	public EmbedAsPartsHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		Diagram diagram = null;
		
		List<Component> objects = new ArrayList<Component>();
		
		for (Object sel : ((IStructuredSelection) selection).toArray()) {
			if (false == sel instanceof GraphicalEditPart) {
				continue;
			}
			GraphicalEditPart editPart = (GraphicalEditPart) sel;

			Diagram currentDiagram = editPart.getNotationView().getDiagram();
			if (diagram == null) {
				diagram = currentDiagram;
			}
			
			EObject object = editPart.resolveSemanticElement();
			if (object instanceof Component) {
				objects.add((Component) object);
			}
		}

		if (!objects.isEmpty()) {
			TransactionalEditingDomain editingDomain = TransactionUtil
					.getEditingDomain(diagram);
			EmbedAsPartsCommand command = new EmbedAsPartsCommand(
					editingDomain, objects, diagram);
			editingDomain.getCommandStack().execute(command);
		}	
		return null; // return null as required by the current API
	}

	public class EmbedAsPartsCommand extends ChangeCommand {

		private TransactionalEditingDomain editingDomain;

		private List<Component> components;

		private Diagram diagram;

		public EmbedAsPartsCommand(TransactionalEditingDomain editingDomain,
				List<Component> components, Diagram diagram) {
			super(new ArrayList<Notifier>(components));
			this.components = components;
			this.editingDomain = editingDomain;
			this.diagram = diagram;
		}

		@Override
		protected void doExecute() {
			StructuredComponent structuredComponent = Activator.createStructuredComponentWithEmbeddedParts(editingDomain, components);

			if (structuredComponent == null) {
				return;
			}
			
			// Add new StructuredComponent to ModelElementCategory
			if (!components.isEmpty()) {
				EObject container = components.get(0).eContainer();
				if (container instanceof ModelElementCategory) {
					((ModelElementCategory) container).getModelElements().add(structuredComponent);
				}
			}

			// Create PortParts
			for (ComponentPart componentPart : structuredComponent.getEmbeddedComponentParts()) {
				Activator.updateComponentPart(editingDomain, componentPart);
			}
			
			
			// Create view
			List<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>();

			int visualID = MumlVisualIDRegistry
					.getNodeVisualID(diagram, structuredComponent);
			String hint = MumlVisualIDRegistry.getType(visualID);
			if (hint != null) {
				IAdaptable elementAdapter = new ElementAdapter(structuredComponent, hint);
				CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
						elementAdapter, Node.class, hint, ViewUtil.APPEND,
						true,
						ComponentDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				viewDescriptors.add(descriptor);
			}

			CreateViewRequest request = new CreateViewRequest(viewDescriptors);

			org.eclipse.gef.commands.Command cmd = getCreateViewCommand(
					request, diagram);
			if (cmd != null && cmd.canExecute()) {
				SetViewMutabilityCommand.makeMutable(
						new EObjectAdapter(diagram)).execute();
				executeCreateViewsCommand(cmd, diagram);
			}

		}

		// Copied from CreationEditPolicy.getCreateCommand()
		protected org.eclipse.gef.commands.Command getCreateViewCommand(
				CreateViewRequest request, Diagram diagram) {

			TransactionalEditingDomain editingDomain = TransactionUtil
					.getEditingDomain(diagram);
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
					editingDomain, DiagramUIMessages.AddCommand_Label);

			Iterator<?> descriptors = request.getViewDescriptors().iterator();

			while (descriptors.hasNext()) {
				CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor) descriptors
						.next();

				CreateCommand createCommand = new CreateCommand(editingDomain,
						descriptor, diagram);

				cc.compose(createCommand);
			}
			return new ICommandProxy(cc.reduce());
		}

		protected void executeCreateViewsCommand(
				final org.eclipse.gef.commands.Command cmd, Diagram diagram) {

			AbstractEMFOperation operation = new AbstractEMFOperation(
					TransactionUtil.getEditingDomain(diagram),
					StringStatics.BLANK, Collections.emptyMap()) {

				protected IStatus doExecute(IProgressMonitor monitor,
						IAdaptable info) throws ExecutionException {

					cmd.execute();

					return Status.OK_STATUS;
				}
			};
			try {
				operation.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				ComponentDiagramEditorPlugin.getInstance().logError(
						"Unable to create initial views.", e); //$NON-NLS-1$
			}
		}

		// Copied from CanonicalEditPolicy$CanonicalElementAdapter.
		private class ElementAdapter extends EObjectAdapter {
			private String _hint;

			/**
			 * constructor
			 * 
			 * @param element
			 * @param hint
			 */
			public ElementAdapter(EObject element, String hint) {
				super(element);
				_hint = hint;
			}

			/** Adds <code>String.class</tt> adaptablity. */
			@SuppressWarnings("rawtypes")
			public Object getAdapter(Class adapter) {
				if (adapter.equals(String.class)) {
					return _hint;
				}
				return super.getAdapter(adapter);
			}
		}
	};

}

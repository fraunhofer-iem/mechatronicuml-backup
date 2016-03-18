package de.uni_paderborn.fujaba.muml.reconfiguration.ui.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.ui.edit.parts.ReconfigurableStructuredComponentEditPart;

//TODO adapt comments

public class GenerateRuleBasedReconfigurationController extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ReconfigurableStructuredComponentEditPart editPart = null;

		// get and process current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		// collect all StaticStructureComponents from the selection
		Iterator<?> iter = ((IStructuredSelection) selection).iterator();
		while (iter.hasNext()) {
			Object currentObject = iter.next();

			// set up variables
			ReconfigurableStructuredComponent sc = null;
			EditingDomain editingDomain = null;

			// if command is triggered via the graphical editor, the selection
			// contains an EditPart
			if (currentObject instanceof ReconfigurableStructuredComponentEditPart) {

				editPart = (ReconfigurableStructuredComponentEditPart) currentObject;

				sc = (ReconfigurableStructuredComponent) ((View) editPart
						.getModel()).getElement();
				editingDomain = editPart.getEditingDomain();
			} else if (currentObject instanceof ReconfigurableStructuredComponent) {
				// if the command is triggered via the tree editor, the
				// selection contains a StaticStructuredComponent
				sc = (ReconfigurableStructuredComponent) currentObject;

				// obtain the editing domain for the resource set
				editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(sc);
				if (editingDomain == null) {
					// create new editing domain because no editing domain
					// exists yet
					ResourceSet rset = sc.eResource().getResourceSet();
					editingDomain = TransactionalEditingDomain.Factory.INSTANCE
							.createEditingDomain(rset);
				}
			} else {
				// there is an object within the selection, which is not
				// supported -> ignore
				continue;
			}

			editingDomain
					.getCommandStack()
					.execute(
							new GenerateRuleBasedReconfigurationControllerTransformationCommand(
									sc));

			// canonical edit policy has to be triggered "manually" because
			// nothing is changed in modelelementcategory. However, canonical
			// edit policy of modelelementcategory handels the view creation of
			// all edges of the diagram and we added such links to the model.
			if (editPart != null) {
				EditPart parent = editPart.getParent();
				CanonicalEditPolicy can = (CanonicalEditPolicy) parent
						.getEditPolicy("CustomCanonical");
				can.refresh();
			}

		}

		return null;
	}

	/**
	 * This function calls the model transformation that actually generates the
	 * implementation for the manager of the given
	 * ReconfigurableStructuredComponent. Before generating the implementation,
	 * this function deletes any existing implementation.
	 * 
	 * @param sc
	 */
	private void generateRuleBasedReconfigurationController(
			ReconfigurableStructuredComponent sc) {

		ModelElementCategory category = (ModelElementCategory) sc.eContainer();

		URI transformationURI = URI
				.createPlatformPluginURI(
						"/de.uni_paderborn.fujaba.muml.reconfiguration.ui/transforms/GenerateReconfigurationController.qvto",
						true);

		// create executor and execution context
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();

		// create input extend containing the component and the category
		List<ReconfigurableStructuredComponent> compList = new ArrayList<ReconfigurableStructuredComponent>();
		compList.add(sc);
		ModelExtent inputComponent = new BasicModelExtent(compList);

		// execute transformation
		ExecutionDiagnostic result = executor.execute(context, inputComponent);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {

			System.out
					.println("A QVT-O ERROR occured while execution the transformation. Message was:");
			System.out.println(result.getMessage());
		}

	}

	/**
	 * Helper class to edit the resource/model.
	 * 
	 * Direct manipulation would lead to a "java.lang.IllegalStateException:
	 * Cannot modify resource set without a write transaction"
	 * 
	 */
	class GenerateRuleBasedReconfigurationControllerTransformationCommand
			extends ChangeCommand {

		private ReconfigurableStructuredComponent sc;

		public GenerateRuleBasedReconfigurationControllerTransformationCommand(
				ReconfigurableStructuredComponent comp) {
			super(comp);
			setLabel("Generate RuleBasedReconfigurationController");
			this.sc = comp;
		}

		@Override
		protected void doExecute() {

			generateRuleBasedReconfigurationController(sc);

		}
	}

}

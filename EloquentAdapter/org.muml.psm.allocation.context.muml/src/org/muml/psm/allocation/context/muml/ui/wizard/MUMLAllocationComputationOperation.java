package org.muml.psm.allocation.context.muml.ui.wizard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.categories.ModelElementCategoryRegistry;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.algorithm.main.AllocationAlgorithm;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationOperation;
import org.muml.psm.allocation.context.muml.Activator;
import org.muml.psm.allocation.language.cs.SpecificationCS;

/* urgs - needs more love... do we really need this editingDomain dance etc.? */
public class MUMLAllocationComputationOperation extends AllocationComputationOperation<SystemAllocation> {
	private static final String allocationModelElementCategoryKey = "org.muml.psm.allocation.category";
	private static final String allocationModelElementCategoryName = "allocation";
	private static final String inconsistentContainmentHierarchy = "Containment hierarchy of %s is inconsistent (expected RootNode (at top))";
	
	private EObject target;
	private EditingDomain editingDomain;

	public MUMLAllocationComputationOperation(@NonNull EditingDomain editingDomain,
			@NonNull SpecificationCS allocationSpecification, @NonNull EObject oclContext,
			@NonNull EObject target,
			@NonNull IAllocationComputationStrategy<?, ?> allocationComputationStrategy) {
		super(allocationSpecification, oclContext,
				allocationComputationStrategy);
		this.editingDomain = editingDomain;
		this.target = target;
	}
	
	@Override
	public void postProcess(@NonNull AllocationAlgorithm<SystemAllocation> algorithm,
			@NonNull Diagnostic diagnostic) {
		addSystemAllocationToTarget(algorithm.getStorageObject());
		logTransformationTimes(diagnostic);
	}
	
	private void addSystemAllocationToTarget(SystemAllocation systemAllocation) {
		if (target instanceof RootNode || target instanceof ModelElementCategory) {
			addToAllocationModelElementCategory(systemAllocation);
		} else if (target instanceof SystemAllocation) {
			replaceExistingSystemAllocation(systemAllocation);
		}
	}
	
	private void addToAllocationModelElementCategory(final SystemAllocation systemAllocation) {
		// passing the resource to the change command should record all
		// changes performed to directly or indirectly contained elements
		editingDomain.getCommandStack().execute(new ChangeCommand(target.eResource()) {
			
			@Override
			protected void doExecute() {
				ModelElementCategory category = getOrCreateAllocationModelElementCategory(target);
				category.getModelElements().add(systemAllocation);
				saveResource(systemAllocation.eResource());
			}

		});
	}
	
	private void replaceExistingSystemAllocation(final SystemAllocation systemAllocation) {
		// target is the old SystemAllocation
		editingDomain.getCommandStack().execute(new ChangeCommand(target.eResource()) {

			@Override
			protected void doExecute() {
				ModelElementCategory category = getOrCreateAllocationModelElementCategory(target);
				int idx = category.getModelElements().indexOf(target);
				category.getModelElements().remove(idx);
				category.getModelElements().add(idx, systemAllocation);
				saveResource(systemAllocation.eResource());
			}

		});
	}
	
	private void saveResource(@NonNull Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@NonNull
	private ModelElementCategory getOrCreateAllocationModelElementCategory(EObject eObject) {
		RootNode rootNode = getRootNode(eObject);
		ModelElementCategoryRegistry registry = new ModelElementCategoryRegistry(true);
		ModelElementCategory category = registry.getModelElementCategory(rootNode, allocationModelElementCategoryKey);
		if (category.getName() == null) {
			// this happens if the model element category is not properly
			// registered
			category.setName(allocationModelElementCategoryName);
		}
		return category;
	}
	
	@NonNull
	private RootNode getRootNode(EObject eObject) {
		EObject orig = eObject;
		while (eObject != null && !(eObject instanceof RootNode)) {
			eObject = eObject.eContainer();
		}
		if (eObject == null) {
			throw new IllegalArgumentException(String.format(inconsistentContainmentHierarchy, orig));
		}
		return (RootNode) eObject;
	}
	
	private void logTransformationTimes(Diagnostic diagnostic) {
		// log times...
		Diagnostic logDiagnostic = null;
		List<Diagnostic> todo = new ArrayList<Diagnostic>(diagnostic.getChildren());
		while (!todo.isEmpty()) {
			Diagnostic child = todo.remove(0);
			if (QVToTransformationRunner.LOG_SOURCE.equals(child.getSource())) {
				logDiagnostic = child;
				//XXX
				//FIXME diagnostic getChildren grows with each execution ... to many diagnostics
//				System.out.println("XXXX");
				//break;
			}
			todo.addAll(child.getChildren());
		}
		if (logDiagnostic == null) {
			// hrm log error?
			return;
		}
		Pattern pattern = Pattern.compile("^(Time for create [^:]*:.*seconds)$",
				Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(logDiagnostic.getMessage());
		while (matcher.find()) {
			Status timeStatus = new Status(IStatus.INFO, Activator.PLUGIN_ID,
					matcher.group(1));
			Activator.getDefault().getLog().log(timeStatus);
		}
	}

}

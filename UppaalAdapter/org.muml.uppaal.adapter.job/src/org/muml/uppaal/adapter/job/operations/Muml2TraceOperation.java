package org.muml.uppaal.adapter.job.operations;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionPackage;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.quantifiers.TemporalQuantifierExpr;
import org.muml.uppaal.options.Options;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph;

public class Muml2TraceOperation implements IWorkspaceRunnable {
	
	private VerifiableElement verifiableElement;
	private ZoneGraph trace;
	protected VerificationOptionsProvider optionsProvider;
	protected VerificationPropertyChoiceProvider propertyChoiceProvider;
	
	public Muml2TraceOperation(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider) {
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;
	}
	
	public void run(IProgressMonitor monitor) throws CoreException {
		ModelExtent reachabilityResultExtent;
				
		try {
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, "MUML to Trace Transformation", 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelOperation prepareOperation = new PrepareModelOperation(verifiableElement);
			prepareOperation.run(subMonitor.newChild(10));
			verifiableElement = prepareOperation.getClonedVerifiableElement();
			ModelExtent clonedModel = prepareOperation.getClonedExtent();
			
			//Get verification options
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				throw new OperationCanceledException();
			
			//Create CIC, run mtctl normalizations and split normalization to figure out which properties can be verified
			TransformationOperation verifiableElement2VerifiableCICOperation = new TransformationOperation("Creating equivalent CIC and splitting properties", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2VerifiableCIC.qvto", true));
			//input, options, out propertySplitModel, out staticallyNormalized, out muml_cic
			ModelExtent verifiableCicExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifiableElement2VerifiableCICOperation.setTransformationParameters(clonedModel, optionsExtent, verifiableCicExtent, new BasicModelExtent(), new BasicModelExtent());
			verifiableElement2VerifiableCICOperation.run(subMonitor.newChild(20));
			
			//Find the new element to verify (now a CIC)
			EObject newCICtoVerify = null;
			for (EObject root : verifiableCicExtent.getContents()) {
				EObject obj = null;
				TreeIterator<EObject> it = root.eAllContents();
				while (it.hasNext()) {
					obj = it.next();
					if (obj instanceof VerifiableElement && ((VerifiableElement) obj).getExtension(VerificationExtensionPackage.eINSTANCE.getElementToVerifyExtension()) != null) {
						newCICtoVerify = obj;
						break;
					}
				}
			}
			assert newCICtoVerify != null && newCICtoVerify instanceof ComponentInstanceConfiguration;
			verifiableElement = (VerifiableElement) newCICtoVerify;
			
			//Get property choice for the CIC
			if (!propertyChoiceProvider.preparePropertyChoiceProvider(verifiableElement))
				throw new OperationCanceledException();
			
			//Remove the properties that are not supposed to be verified
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement.getVerificationConstraintRepositories().iterator();
			int propertyCount = 0;
			Property lastProperty = null;
			while (repoIt.hasNext()) {
				//Remove constraints not chosen
				org.muml.uppaal.adapter.mtctl.PropertyRepository repo = (org.muml.uppaal.adapter.mtctl.PropertyRepository) repoIt.next();
				Iterator<Property> it = repo.getProperties().iterator();
				while (it.hasNext()) {
					Property property = it.next();
					if (!propertyChoiceProvider.isChosen(property))
						it.remove();
					else {
						propertyCount++;
						lastProperty = property;
					}
				}
				if (repo.getProperties().isEmpty())
					repoIt.remove();
			}
			
			if (propertyCount != 1 || !(lastProperty.getExpression() instanceof TemporalQuantifierExpr)) {
				throw new CoreException(new Status(Status.ERROR, "org.muml.uppaal.adapter.job", "Please select exactly one simple property verifiable with Uppaal"));
			}			
			
			//Verify the resulting CIC with the one property
			TransformationOperation mainTransformation = new TransformationOperation("MUML to Trace Transformation", URI.createPlatformPluginURI("/org.muml.uppaal.adapter.transformation/transforms/VerifiableElement2Trace.qvto", true));
			reachabilityResultExtent = new BasicModelExtent();
			mainTransformation.setTransformationParameters(verifiableCicExtent, optionsExtent, reachabilityResultExtent);
			mainTransformation.run(subMonitor.newChild(70));

			//Finished
			trace = (ZoneGraph) reachabilityResultExtent.getContents().get(0);
						
			if (monitor.isCanceled()) {
				throw new OperationCanceledException();
			}
		}
		finally {
			monitor.done();
		}
			
	};
	
	public ZoneGraph getTrace() {		
		return trace;
	}
	
}

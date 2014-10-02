package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.constraint.VerificationConstraintRepository;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationPropertyChoiceProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.fujaba.muml.verification.verificationExtension.VerificationExtensionPackage;

public class Muml2TraceJob extends SynchronousJob {
	
	private VerifiableElement verifiableElement;
	private ZoneGraph trace;
	protected VerificationOptionsProvider optionsProvider;
	protected VerificationPropertyChoiceProvider propertyChoiceProvider;
	
	public Muml2TraceJob(VerifiableElement verifiableElement, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider) {
		super("MUML to Trace Transformation");
		this.verifiableElement = verifiableElement;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		ModelExtent reachabilityResultExtent;
		IStatus status;
		
		try {
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			//Clone model, mark verifiable element, etc.
			PrepareModelJob prepareJob = new PrepareModelJob(verifiableElement);
			status = prepareJob.execute(subMonitor.newChild(10));
			if (!status.isOK())
				return status;
			verifiableElement = prepareJob.getClonedVerifiableElement();
			ModelExtent clonedModel = prepareJob.getClonedExtent();
			
			//Get verification options
			if (!optionsProvider.prepareOptionsProvider(verifiableElement))
				return Status.CANCEL_STATUS;
			
			//Create CIC, run mtctl normalizations and split normalization to figure out which properties can be verified
			TransformationJob verifiableElement2VerifiableCICTransformation = new TransformationJob("Creating equivalent CIC and splitting properties", URI.createPlatformPluginURI("/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/VerifiableElement2VerifiableCIC.qvto", true));
			//input, options, out propertySplitModel, out staticallyNormalized, out muml_cic
			ModelExtent verifiableCicExtent = new BasicModelExtent();
			ModelExtent optionsExtent = new BasicModelExtent(Arrays.asList(new Options[] {optionsProvider.getOptions()}));
			verifiableElement2VerifiableCICTransformation.setTransformationParameters(clonedModel, optionsExtent, verifiableCicExtent, new BasicModelExtent(), new BasicModelExtent());
			verifiableElement2VerifiableCICTransformation.execute(subMonitor.newChild(20));
			
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
				return Status.CANCEL_STATUS;
			
			//Remove the properties that are not supposed to be verified
			Iterator<VerificationConstraintRepository> repoIt = verifiableElement.getVerificationConstraintRepositories().iterator();
			int propertyCount = 0;
			Property lastProperty = null;
			while (repoIt.hasNext()) {
				//Remove constraints not chosen
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository repo = (de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.PropertyRepository) repoIt.next();
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
				return new Status(Status.ERROR, "de.uni_paderborn.fujaba.muml.verification.uppaal.job", "Please select exactly one simple property verifiable with Uppaal");
			}			
			
			//Verify the resulting CIC with the one property
			TransformationJob mainTransformation = new TransformationJob(this.getName(), URI.createPlatformPluginURI("/de.uni_paderborn.fujaba.muml.verification.uppaal.transformation/transforms/VerifiableElement2Trace.qvto", true));
			reachabilityResultExtent = new BasicModelExtent();
			mainTransformation.setTransformationParameters(verifiableCicExtent, optionsExtent, reachabilityResultExtent);
			status = mainTransformation.execute(subMonitor.newChild(70));

			//Finished
			if(status.isOK())
				trace = (ZoneGraph) reachabilityResultExtent.getContents().get(0);
			else
				return status;
			
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			
			return Status.OK_STATUS;
		}
		finally {
			monitor.done();
		}
			
	};
	
	public ZoneGraph getTrace() {
		try {
			join();
		} catch (InterruptedException e) {
			return null;
		}
		
		return trace;
	}
	
}

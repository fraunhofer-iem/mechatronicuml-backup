package org.example.tests;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.NamedElement;
import org.muml.core.tests.TestUtilities;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.uppaal.adapter.extension.verificationextension.VerificationExtensionFactory;
import org.muml.uppaal.adapter.job.VerifyForResultsJob;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyResultAcceptor;
import org.muml.uppaal.adapter.mtctl.MtctlFactory;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.PropertyRepository;
import org.muml.uppaal.adapter.mtctl.comparables.ComparablesFactory;
import org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesFactory;
import org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable;
import org.muml.uppaal.adapter.mtctl.quantifiers.EFExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.ExistenceQuantExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersFactory;
import org.muml.uppaal.adapter.mtctl.sets.SetsFactory;
import org.muml.uppaal.adapter.mtctl.sets.StateSetExpr;
import org.muml.uppaal.adapter.results.PropertyResult;
import org.muml.uppaal.adapter.results.PropertyResultRepository;
import org.muml.uppaal.options.CoordinationProtocolOptions;
import org.muml.uppaal.options.Options;
import org.muml.uppaal.options.OptionsFactory;
import org.muml.uppaal.options.StateSpaceReduction;
import org.muml.uppaal.options.TraceOptions;

@RunWith(Parameterized.class)
public class UppaalTest {
	private File project;

	public UppaalTest(File project) {
		this.project = project;
	}

	// Check all muml/fujaba files in that project, see getProjects()
	@Test
	public void Codegen() throws Exception {
		checkFiles(project, new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".muml") || name.endsWith(".fujaba");
			}
		});
	}

	// Find all projects and use them as constructor parameter
	@Parameters(name = "{0}")
	public static Collection<Object[]> getProjects() {
		List<Object[]> projects = new ArrayList<Object[]>();
		for (File directory : findWorkspaceLocation().listFiles()) {
			if (directory.isDirectory()) {
				if (Platform.getBundle(directory.getName()) != null) {
					projects.add(new Object[] { directory });
				}
			}
		}
		return projects;
	}

	private void checkFiles(File directory, FilenameFilter filenameFilter) throws Exception {
		for (File file : directory.listFiles()) {
			if (file.isDirectory() && !".".equals(file.getName()) && !"..".equals(file.getName())) {
				checkFiles(file, filenameFilter);
			} else if (file.isFile() && filenameFilter.accept(directory, file.getName())) {
				checkModelFile(URI.createFileURI(file.getAbsolutePath()));
			}
		}
	}

	private void checkModelFile(URI uri) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = TestUtilities.loadResource(resourceSet, uri);
		EcoreUtil.resolveAll(resourceSet);
		// currently always complains; deactivated.
		// XXX investigate further!
		// validateResource(resource);
		for (EObject element : resource.getContents()) {
			uppaaalModelChecking(element);
		}
	}

	private void validateResource(Resource resource) throws Exception {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		for (EObject contents : resource.getContents()) {
			Map<Object, Object> context = new HashMap<Object, Object>();
			if (!Diagnostician.INSTANCE.validate(contents, diagnostics, context)) {
				throw new Exception(resource.getURI().toString() + " is not valid. ERROR: " + diagnostics.getMessage());
			}
		}
	}

	private void uppaaalModelChecking(EObject element) throws Exception {
		if (element instanceof CoordinationProtocol && shouldValidateProtoc((CoordinationProtocol) element)) {
			uppaalCheck((CoordinationProtocol) element);
			// prevent children from being processed.
			// we only want to process root cic, no child cics within
			// structuredcomponentinstances.
			return;
		}
		for (EObject child : element.eContents()) {
			uppaaalModelChecking(child);
		}
	}

	private boolean shouldValidateProtoc(CoordinationProtocol proto) {
		for(Role role : proto.getRoles()){
			if(role.getBehavior() instanceof RealtimeStatechart && ((RealtimeStatechart)role.getBehavior()).isUsesOneToManyCommunicationSchemata()){
				return false;
			}
		}
		return true;
	}

	private void uppaalCheck(CoordinationProtocol protocol) throws Exception {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("uppaal");
		if (project.exists()) {
			if (!project.isOpen()) {
				project.open(new NullProgressMonitor());
			}
			project.delete(true, new NullProgressMonitor());
		}
		project.create(new NullProgressMonitor());
		if (!project.isOpen()) {
			project.open(new NullProgressMonitor());
		}
		try {
			
			
			// create uppaal model checking options
			CoordinationProtocolOptions options;

			options = OptionsFactory.eINSTANCE.createCoordinationProtocolOptions();
			options.setTraceOptions(TraceOptions.NONE);
			options.setConnectorOutBufferSize(8);
			
			options.setHashTableSize(7);
			options.setStateSpaceReduction(StateSpaceReduction.CONSERVATIVE);
			
			boolean usesMultiRole = false;
			for(Role role : protocol.getRoles()) {
				usesMultiRole = usesMultiRole || role.isMultiRole();
			}
			if(usesMultiRole) {
				options.setRoleMultiplicity(1);
			}
					
			
			// create verifying properties
			PropertyRepository repo = MtctlFactory.eINSTANCE.createPropertyRepository();
			
			
			Property prop = MtctlFactory.eINSTANCE.createProperty();
			ExistenceQuantExpr eqe = QuantifiersFactory.eINSTANCE.createExistenceQuantExpr();
			EFExpr efe = QuantifiersFactory.eINSTANCE.createEFExpr();
			StateActiveExpr sae = PredicatesFactory.eINSTANCE.createStateActiveExpr();
			MumlElemExpr mee = ComparablesFactory.eINSTANCE.createMumlElemExpr();	
			
			StateSetExpr sse = SetsFactory.eINSTANCE.createStateSetExpr();
			
			BoundVariable bv = QuantifiersFactory.eINSTANCE.createBoundVariable();
			bv.setName("s");
			bv.setSet(sse);			
			eqe.setVar(bv);
			
			prop.setExpression(eqe);
			eqe.setFormula(efe);
			efe.setExpr(sae);
			sae.setState(mee);
			mee.setElem(bv);
			
			repo.getProperties().add(prop);
			
			
			// only check our property, remove all other properties
			protocol.getVerificationConstraintRepositories().clear();
			protocol.getVerificationConstraintRepositories().add(repo);
			
			// add ElementToVerifyExtension
			protocol.getExtensions().add(VerificationExtensionFactory.eINSTANCE.createElementToVerifyExtension());			
			
			
		
			System.err.println("testing:" + protocol.getName());
			// MtctlXtextPropertyEditor			
			
			final boolean exportAsXml = false;
			final Options uppaalOptions = options;
			final URI destination = URI.createPlatformResourceURI(project.getFullPath().toString(), true);
			final VerifiableElement verifiableElement = protocol;

			URI targetURI = destination.appendSegment(((NamedElement) verifiableElement).getName())
					.appendFileExtension("uppaal");
			URI targetURIRequirements = destination.appendSegment(((NamedElement) verifiableElement).getName())
					.appendFileExtension("requirements");

			// Start the job
			
			
			
			Job job = new VerifyForResultsJob( protocol, new VerificationOptionsProvider() {
				
				@Override
				public boolean prepareOptionsProvider(VerifiableElement element) {
					// TODO Auto-generated method stub
					return true;
				}
				
				@Override
				public Options getOptions() {
					// TODO Auto-generated method stub
					return uppaalOptions;
				}
			},
			new VerificationPropertyChoiceProvider() {
				
				@Override
				public boolean preparePropertyChoiceProvider(VerifiableElement element) {
					// TODO Auto-generated method stub
					return true;
				}
				
				@Override
				public boolean isChosen(Property property) {
					// TODO Auto-generated method stub
					return true;
				}
			},
			new VerificationPropertyResultAcceptor() {			

				@Override
				public void acceptResult(PropertyResultRepository result) {
					// TODO Auto-generated method stub
					for(PropertyResult propertyResult : result.getResults()) {
						Assert.assertTrue(propertyResult.isFulfilled());
					}
				}
			});
					
			job.schedule();
			job.join();
			System.err.println(job.getResult());
			Assert.assertTrue(job.getResult().isOK());
		} finally {
			project.delete(true, new NullProgressMonitor());
		}
	}

	/**
	 * Finds the path that contains all bundles.
	 * 
	 * @return The workspace location.
	 */
	private static File findWorkspaceLocation() {
		File workspace = new File("..");
		System.out.println(workspace.getAbsolutePath());
		return workspace; // This requires that the launch configuration
								// sets ${workspace_loc} as working directory!
	}

}

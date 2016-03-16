package de.uni_paderborn.fujaba.properties.codegen;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolver;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.osgi.framework.Bundle;

import de.uni_paderborn.fujaba.properties.Plugin;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.PropertyGenerator;

public class Generator {
	private JControlModel mergeModel;
	
	public Generator() {
		Bundle bundle = Platform.getBundle(PropertiesCodegenPlugin.ID);
		URL controlFile = bundle.getEntry("/emf-merge.xml");
		if (controlFile != null){
			mergeModel = new JControlModel();
			mergeModel.initialize(CodeGenUtil.instantiateFacadeHelper(JMerger.DEFAULT_FACADE_HELPER_CLASS), controlFile.toString());
			if (!mergeModel.canMerge()){
				throw new IllegalStateException("Can not initialize JControlModel");
			}
		}
	}

	public void generate(PropertyGenerator generator) throws CoreException {
		Assert.isNotNull(generator);
		
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		Map<Object, Object> context = new HashMap<Object, Object>();
		if (!Diagnostician.INSTANCE.validate(generator, diagnostics, context)) {
			throw new CoreException(new Status(Status.ERROR, PropertiesCodegenPlugin.ID, "Model is not valid!"));
		}
		Plugin plugin = generator.getPlugin();
		if (plugin == null) {
			throw new UnsupportedOperationException(
					"No plugin element defined!");
		}
		if (plugin.getId() == null) {
			throw new UnsupportedOperationException(
					"Plugin: No plugin id specified!");
		}
		
		String sourceFolder = "src-gen";
		if (generator.getSourceFolder() != null) {
			sourceFolder = generator.getSourceFolder();
		}

		// create project
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(plugin.getId());
		if (!project.exists()) {
			createProject(project, Arrays.asList(new String[] { sourceFolder }),
					new NullProgressMonitor());
		}
		
		
//		source.. = src-gen/
//		output.. = bin/
//		bin.includes = META-INF/,\
//			.,\
//			plugin.xml

		// configure outlet
		String containerName = project.getLocation().toPortableString();
		OutputImpl output = new OutputImpl();
		Outlet outlet = new Outlet(containerName);
		outlet.setOverwrite(true);

		// TODO: Enable JMerge again!
//		outlet.addPostprocessor(new JMergePostProcessor(mergeModel));
		outlet.addPostprocessor(new org.eclipse.xpand2.output.JavaBeautifier());
		output.addOutlet(outlet);

		// resolver for protected regions

		ProtectedRegionResolver prs = new ProtectedRegionResolverImpl();

		// create execution context

		Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(
				output, prs, globalVarsMap, null, null);
		EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
			@Override
			protected EPackage[] allPackages() {
				return new EPackage[] { PropertiesPackage.eINSTANCE,
						GenModelPackage.eINSTANCE, EcorePackage.eINSTANCE };
			}
		};
		execCtx.registerMetaModel(metamodel);

		// generate

		XpandFacade facade = XpandFacade.create(execCtx);
		outlet.setOverwrite(true);
		facade.evaluate("xpt::Generator::GenerateOverwrite", generator);
		outlet.setOverwrite(false);
		facade.evaluate("xpt::Generator::GenerateOnce", generator);

		project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private IProject createProject(IProject project,
			final List<String> srcFolders,
			final IProgressMonitor progressMonitor) {

		String projectName = project.getName();
		try {
			progressMonitor.beginTask("", 10);
			progressMonitor.subTask("Creating project " + projectName);
			final IWorkspace workspace = ResourcesPlugin.getWorkspace();
			project = workspace.getRoot().getProject(projectName);

			final IJavaProject javaProject = JavaCore.create(project);
			final IProjectDescription projectDescription = ResourcesPlugin
					.getWorkspace().newProjectDescription(projectName);
			projectDescription.setLocation(null);
			project.create(projectDescription, new SubProgressMonitor(
					progressMonitor, 1));
			final List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();

			projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID,
					"org.eclipse.pde.PluginNature" });

			final ICommand java = projectDescription.newCommand();
			java.setBuilderName(JavaCore.BUILDER_ID);

			final ICommand manifest = projectDescription.newCommand();
			manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");

			final ICommand schema = projectDescription.newCommand();
			schema.setBuilderName("org.eclipse.pde.SchemaBuilder");

			projectDescription.setBuildSpec(new ICommand[] { java, manifest,
					schema });

			project.open(new SubProgressMonitor(progressMonitor, 1));
			project.setDescription(projectDescription, new SubProgressMonitor(
					progressMonitor, 1));

			Collections.reverse(srcFolders);
			for (final String src : srcFolders) {
				final IFolder srcContainer = project.getFolder(src);
				if (!srcContainer.exists()) {
					srcContainer.create(false, true, new SubProgressMonitor(
							progressMonitor, 1));
				}
				final IClasspathEntry srcClasspathEntry = JavaCore
						.newSourceEntry(srcContainer.getFullPath());
				classpathEntries.add(0, srcClasspathEntry);
			}

			classpathEntries
					.add(JavaCore
							.newContainerEntry(new Path(
									"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5")));
			classpathEntries.add(JavaCore.newContainerEntry(new Path(
					"org.eclipse.pde.core.requiredPlugins")));

			javaProject.setRawClasspath(classpathEntries
					.toArray(new IClasspathEntry[classpathEntries.size()]),
					new SubProgressMonitor(progressMonitor, 1));

			javaProject.setOutputLocation(new Path("/" + projectName + "/bin"),
					new SubProgressMonitor(progressMonitor, 1));

		} catch (final Exception exception) {
			exception.printStackTrace();
			// logError(exception);
		} finally {
			progressMonitor.done();
		}

		return project;
	}
}

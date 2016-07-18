package build.execution;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.acceleo.internal.ide.ui.builders.AcceleoMarkerUtils;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.xtend.core.XtendInjectorSingleton;
import org.eclipse.xtend.core.compiler.batch.Main;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;

import com.google.common.base.Joiner;
import com.google.inject.Injector;

public class BuildExecution {
	
	private static class Compiler {
		public static void main(String[] args) {
			List<String> existingDirs = new ArrayList<String>();
			BasicConfigurator.configure();
			Injector injector = XtendInjectorSingleton.INJECTOR;
			XtendBatchCompiler compiler = injector.getInstance(XtendBatchCompiler.class);
			if ((args == null) || (args.length == 0)) {
				printUsage();
				return;
			}
			Iterator<String> arguments = Arrays.asList(args).iterator();
			while (arguments.hasNext()) {
				String argument = arguments.next().trim();
				if ("-d".equals(argument)) {
					compiler.setOutputPath(arguments.next().trim());
				} else if ("-classpath".equals(argument) || "-cp".equals(argument)) {
					compiler.setClassPath(arguments.next().trim());
				} else if ("-tempdir".equals(argument) || "-td".equals(argument)) {
					compiler.setTempDirectory(arguments.next().trim());
				} else if ("-encoding".equals(argument)) {
					compiler.setFileEncoding(arguments.next().trim());
				} else if ("-javaSourceVersion".equals(argument)) {
					compiler.setJavaSourceVersion(arguments.next().trim());
				} else if ("-noSuppressWarningsAnnotation".equals(argument)) {
					compiler.setGenerateSyntheticSuppressWarnings(false);
				} else if ("-generateGeneratedAnnotation".equals(argument)) {
					compiler.setGenerateGeneratedAnnotation(true);
				} else if ("-includeDateInGeneratedAnnnotation".equals(argument)) {
					compiler.setIncludeDateInGeneratedAnnotation(true);
				} else if ("-generateAnnotationComment".equals(argument)) {
					compiler.setGeneratedAnnotationComment(arguments.next().trim());
				} else if ("-useCurrentClassLoader".equals(argument)) {
					compiler.setUseCurrentClassLoaderAsParent(true);
				} else if ("-writeTraceFiles".equals(argument)) {
					compiler.setWriteTraceFiles(true);
				} else {
					//List<String> existingDirs = new ArrayList<String>(compiler.getSourcePathDirectories());
					existingDirs.add(argument);
					String pathes = Joiner.on(File.pathSeparator).join(existingDirs);
					System.out.println(pathes);
					compiler.setSourcePath(pathes);
				}
			}
			if (!compiler.compile()) {
				System.out.println("XXX: compile failed");
			} else {
				System.out.println("XXX: compile worked");
			}
		}

		private static void printUsage() {
			PrintStream out = System.out;
			out.println("Usage: Main <options> <source directories>");
			out.println("where possible options include:");
			out.println("-d <directory>                      Specify where to place generated xtend files");
			out.println("-tp <path>                          Temp directory to hold generated stubs and classes");
			out.println("-cp <path>                          Specify where to find user class files");
			out.println("-encoding <encoding>                Specify character encoding used by source files");
			out.println("-javaSourceVersion <version>        Create Java Source compatible to this version. Can be: 1.5, 1.6, 1.7 or 1.8");
			out.println("-noSuppressWarningsAnnotation       Don't put @SuppressWarnings() into generated Java Code");
			out.println("-generateGeneratedAnnotation        Put @Generated into generated Java Code");
			out.println("-includeDateInGeneratedAnnnotation  If -generateGeneratedAnnotation is used, add the current date/time.");
			out.println("-generateAnnotationComment <string> If -generateGeneratedAnnotation is used, add a comment.");
			out.println("-useCurrentClassLoader              Use current classloader as parent classloader");
			out.println("-writeTraceFiles                    Write Trace-Files");
		}
	}

	public static IMarker[] build() throws CoreException, InvocationTargetException, InterruptedException {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		root.refreshLocal(IWorkspaceRoot.DEPTH_INFINITE, progressMonitor);
		root.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				System.out.println(resource.getName());
				if (resource instanceof IWorkspaceRoot)
					return true;
				if (resource.getName().endsWith("xtext") || resource.getName().endsWith("ui")) {
					BasicConfigurator.configure();
					System.out.println("before: Main " + resource.getName());
					Compiler.main(new String[] {
							"-classpath", "${project_classpath:" + resource.getName() + "}",
							"-d", "xtend-gen", "src" //, "src-gen"
					});
					System.out.println("after: Main " + resource.getName());
				}
				return false;
			}
		});

		/*try {
			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
		} catch (CoreException e) {
			workspace.build(IncrementalProjectBuilder.CLEAN_BUILD, progressMonitor);
			workspace.build(IncrementalProjectBuilder.FULL_BUILD, progressMonitor);
			e.printStackTrace(System.out);
		}*/
		System.out.println("Build Progress Successfully!");

		IMarker[] markers = null;
		try {
			markers = root.findMarkers(AcceleoMarkerUtils.PROBLEM_MARKER_ID, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		SaveJob job = new SaveJob("Save Workspace");

		IStatus stat = job.run(progressMonitor);
		job.join();
		if (stat.isOK()) {
			System.out.println("Save Progress Successfully!");
		} else {
			System.err.println("Saving Workspace Failed with" + stat.getMessage());
		}
		return markers;
	}

	public static class SaveJob extends Job {

		public SaveJob(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("Save Workspace", 1);
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IStatus status = null;
			try {
				status = workspace.save(true, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			monitor.worked(1);
			monitor.done();
			return status;
		}

	}

}

package org.muml.uppaal.adapter.log;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.mtctl.PropertyRepository;
import org.muml.uppaal.adapter.mtctl.xtext.MtctlStandaloneSetup;
import org.muml.uppaal.adapter.mtctl.xtext.scoping.MtctlScopeProvider;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class UppaalAdapterLogPlugin extends AbstractUIPlugin {

	private class LogEntry {
		public int iteration;
		public String task;
		public int millis;

		public LogEntry(int iteration, String task, int millis) {
			this.iteration = iteration;
			this.task = task;
			this.millis = millis;
		}

		public String getCSV(String propertyName) {
			StringBuilder buf = new StringBuilder();
			buf.append(iteration);
			buf.append(";");
			buf.append(propertyName);
			buf.append(";");
			buf.append(task);
			buf.append(";");
			buf.append(millis);
			return buf.toString();
		}
	}

	public long startMillis = 0;
	private List<LogEntry> entries = new ArrayList<LogEntry>();
	public int iteration = 1;
	private Runnable restartRunnable = null;

	// The plug-in ID
	public static final String PLUGIN_ID = "org.muml.uppaal.adapter.log"; //$NON-NLS-1$

	// The shared instance
	private static UppaalAdapterLogPlugin plugin;

	/**
	 * The constructor
	 */
	public UppaalAdapterLogPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		startNewEvaluation();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static UppaalAdapterLogPlugin getDefault() {
		return plugin;
	}

	public void startEvaluationIteration() {
		startMillis = System.currentTimeMillis();
	}

	public void evaluationDone(String verifiableElementName, Property property, boolean trace) {
		String propertyName = "ALL";
		if (property != null) {
			try {
				class VerificationPropertyLanguageResource extends AbstractLanguageResource {
					@Override
					protected void init(EObject context) {
						MtctlScopeProvider.getInstance().setScopeForEObject(context);
					}

					@Override
					protected Injector getInjector() {
						return new MtctlStandaloneSetup().createInjectorAndDoEMFRegistration();
					}

					@Override
					protected boolean isSerializable(EObject object) {
						return object instanceof PropertyRepository || object instanceof Property
								|| object instanceof Expression;
					}

				}
				;
				propertyName = new VerificationPropertyLanguageResource().serializeEObjectSafe(property,
						property.eContainer());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		logInfo("DONE");
		int iterations = org.muml.uppaal.preferences.UppaalPreferencesPlugin.getDefault().getPreferenceStore()
				.getInt("org.muml.uppaal.adapter.preferences.num_iterations");
		if (iteration >= iterations || restartRunnable == null) {
			String currentCSV = getCSV(propertyName);
			startNewEvaluation();
			SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd_HH:mm:ss");
			Date now = new Date();
			String filename = sdfDate.format(now).replace(':', '-') + "_UppaalAdapterTiming_" + verifiableElementName + "_"
					+ (trace ? "Trace" : "NoTrace") + ".csv";
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					displayTextEditor(currentCSV, filename);
				}
			});
		} else {
			iteration++;
			Display.getDefault().asyncExec(restartRunnable);
		}
	}

	private void startNewEvaluation() {
		entries.clear();
		iteration = 1;
	}

	private String getCSV(String propertyName) {
		String csv = "iteration;property;task;milliseconds\n";
		for (LogEntry entry : entries) {
			csv += entry.getCSV(propertyName) + "\n";
		}
		return csv;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void displayTextEditor(String text, String filename) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IStorage storage = new IStorage() {
			public InputStream getContents() throws CoreException {
				return new ByteArrayInputStream(text.getBytes());
			}

			public IPath getFullPath() {
				return null;
			}

			public Object getAdapter(Class adapter) {
				return null;
			}

			public String getName() {
				return filename;
			}

			public boolean isReadOnly() {
				return true;
			}
		};
		org.eclipse.ui.IStorageEditorInput input = new org.eclipse.ui.IStorageEditorInput() {
			public boolean exists() {
				return false;
			}

			public ImageDescriptor getImageDescriptor() {
				return null;
			}

			public String getName() {
				return storage.getName();
			}

			public IPersistableElement getPersistable() {
				return null;
			}

			public IStorage getStorage() {
				return storage;
			}

			public String getToolTipText() {
				return storage.getName();
			}

			public Object getAdapter(Class adapter) {
				return null;
			}
		};
		IWorkbenchPage page = window.getActivePage();
		if (page != null) {
			try {
				page.openEditor(input, "org.eclipse.ui.DefaultTextEditor");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}

	public void startNextIteration() {
		iteration++;
	}

	public void logInfo(String message) {
		if (shouldDoStatisticalEvaluation()) {
			getLog().log(new Status(Status.INFO, PLUGIN_ID, message));
			entries.add(new LogEntry(iteration, message, (int) (System.currentTimeMillis() - startMillis)));
		}
	}

	public void setRestartRunnable(Runnable runnable) {
		this.restartRunnable = runnable;
	}

	public boolean shouldDoStatisticalEvaluation() {
		return org.muml.uppaal.preferences.UppaalPreferencesPlugin.getDefault().getPreferenceStore()
				.getBoolean("org.muml.uppaal.adapter.preferences.measure_statistics");
	}

}

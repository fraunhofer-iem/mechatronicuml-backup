package org.muml.uppaal.adapter.log;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class UppaalAdapterLogPlugin extends AbstractUIPlugin {

	public long startMillis = 0;
	public String csv = "";
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

	public void evaluationDone() {
		logInfo("DONE");
		int iterations = org.muml.uppaal.preferences.UppaalPreferencesPlugin.getDefault().getPreferenceStore().getInt("org.muml.uppaal.adapter.preferences.num_iterations");
		if (iteration >= iterations || restartRunnable == null) {
			String currentCSV = csv;
			startNewEvaluation();
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					displayTextEditor(currentCSV);
				}
			});
		} else {
			iteration++;
			Display.getDefault().asyncExec(restartRunnable);
		}
	}

	private void startNewEvaluation() {
		csv = "iteration,task,milliseconds\n";
		csv += "1,Starting Log,0\n";	
		iteration = 1;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void displayTextEditor(String text) {
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
				return "Uppaal Adapter Timing.csv";
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
			csv += iteration + "," + message + "," + (System.currentTimeMillis() - startMillis) + "\n";
		}
	}

	public void setRestartRunnable(Runnable runnable) {
		this.restartRunnable = runnable;
	}
	
	public boolean shouldDoStatisticalEvaluation() {
		return org.muml.uppaal.preferences.UppaalPreferencesPlugin.getDefault().getPreferenceStore().getBoolean("org.muml.uppaal.adapter.preferences.measure_statistics");
	}

}

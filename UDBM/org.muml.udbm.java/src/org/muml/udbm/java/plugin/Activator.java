package org.muml.udbm.java.plugin;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

import com.tools.logging.PluginLogManager;

public class Activator extends Plugin {

	private static BundleContext context;

    // logger configuration
    private static final String LOG_PROPERTIES_FILE = "logger.properties";

    //log manager
    private PluginLogManager logManager;

	// The shared instance
	private static Activator plugin;

    
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
		configureLogger();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		stopLogger();
		super.stop(bundleContext);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}


	/**
     * @return Returns the logManager.
     */
    public static PluginLogManager getLogManager() {
        return getDefault().logManager;
    }
	
	public void stopLogger(){
		if(this.logManager != null) {
			logManager.shutdown();
			logManager = null;
		}
	}
	
	private void configureLogger() {
		URL url = getBundle().getEntry("/" + LOG_PROPERTIES_FILE);
		try {
			InputStream inputStream = url.openStream();
			if (inputStream != null) {
				Properties properties = new Properties();
				properties.load(inputStream);
				inputStream.close();
				logManager = new PluginLogManager(this, properties);
			}
		} catch (IOException e) {
			IStatus status = new Status(
					IStatus.ERROR,
					getDefault().getBundle().getSymbolicName(),
					IStatus.ERROR,
					"Error while initializing log properties." + e.getMessage(),
					e);
			getDefault().getLog().log(status);
			throw new RuntimeException(
					"Error while initializing log properties.", e);
		}
	}

}

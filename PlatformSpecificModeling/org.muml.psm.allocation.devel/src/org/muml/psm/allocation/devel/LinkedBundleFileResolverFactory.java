package org.muml.psm.allocation.devel;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.osgi.internal.hookregistry.BundleFileWrapperFactoryHook;
import org.eclipse.osgi.storage.BundleInfo.Generation;
import org.eclipse.osgi.storage.bundlefile.BundleEntry;
import org.eclipse.osgi.storage.bundlefile.BundleFile;
import org.eclipse.osgi.storage.bundlefile.BundleFileWrapper;
import org.eclipse.osgi.storage.bundlefile.FileBundleEntry;

public class LinkedBundleFileResolverFactory implements BundleFileWrapperFactoryHook {
	private static final String project =
			"org.muml.psm.allocation.devel";
	private static final String propertiesFilename = "lookup.properties";
	private Map<String, List<String>> lookupMap = null;
	
	private void setupLookupMap(BundleFile bundleFile) {
		BundleEntry entry = bundleFile.getEntry(propertiesFilename);
		if (!(entry instanceof FileBundleEntry)) {
			return;
		}
		Properties properties = new Properties();
		try {
			properties.load(((FileBundleEntry) entry).getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		lookupMap = new HashMap<String, List<String>>();
		for (String key : properties.stringPropertyNames()) {
			String[] val = properties.getProperty(key).split("\\s*,\\s*");
			lookupMap.put(key, Arrays.asList(val));
		}
	}

	@Override
	public BundleFileWrapper wrapBundleFile(BundleFile bundleFile,
			Generation generation, boolean base) {
		String basename = bundleFile.getBaseFile().getName();
		if (lookupMap == null && basename.equals(project)) {
			setupLookupMap(bundleFile);
		} else if (lookupMap != null && lookupMap.containsKey(basename)) {
			return new LinkedBundleFileResolver(bundleFile,
					lookupMap.get(basename));
		}
		return null;
	}

}
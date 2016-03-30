package org.muml.psm.allocation.devel;

import java.io.File;
import java.util.List;

import org.eclipse.osgi.storage.BundleInfo;
import org.eclipse.osgi.storage.bundlefile.BundleEntry;
import org.eclipse.osgi.storage.bundlefile.BundleFile;
import org.eclipse.osgi.storage.bundlefile.BundleFileWrapper;
import org.eclipse.osgi.storage.bundlefile.FileBundleEntry;

public class LinkedBundleFileResolver extends BundleFileWrapper {
	
	private final List<String> lookupList;

	public LinkedBundleFileResolver(BundleFile bundleFile, List<String> lookupList) {
		super(bundleFile);
		this.lookupList = lookupList;
	}
	
	private BundleEntry lookup(String path) {
		for (String directory : lookupList) {
			File file = new File(directory + File.separator + path);
			if (file.exists()) {
				return new FileBundleEntry(file, path);
			}
		}
		return null;
	}
	
	@Override
	public BundleEntry getEntry(String path) {
		BundleEntry entry = super.getEntry(path);
		// do not lookup META-INF/MANIFEST.MF
		// (this would probably cause some trouble)
		if (entry == null && path != null
				&& !path.endsWith(BundleInfo.OSGI_BUNDLE_MANIFEST)) {
			entry = lookup(path);
		}
		return entry;
	}

}

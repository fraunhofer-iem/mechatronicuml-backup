package org.muml.core.example.ui.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.eclipse.core.runtime.IProgressMonitor;


public class CopyUtil {
	
	/**
	 * Copy a whole directory to another location.
	 * @param sourceDir a File object represents the source directory
	 * @param destDir a File object represents the destination directory
	 * @throws IOException thrown if IO error occurred.
	 * @throws InterruptedException 
	 */
	public static void copyDirectory(File sourceDir, File destDir, IProgressMonitor monitor)
			throws IOException, InterruptedException {
		// creates the destination directory if it does not exist
		if (!destDir.exists()) {
			destDir.mkdirs();
		}

		// throws exception if the source does not exist
		if (!sourceDir.exists()) {
			throw new IllegalArgumentException("sourceDir does not exist");
		}

		// throws exception if the arguments are not directories
		if (sourceDir.isFile() || destDir.isFile()) {
			throw new IllegalArgumentException(
					"Either sourceDir or destDir is not a directory");
		}

		copyDirectoryImpl(sourceDir, destDir, monitor);
	}

	/**
	 * Internal implementation of the copy method.
	 * @param sourceDir a File object represents the source directory
	 * @param destDir a File object represents the destination directory
	 * @throws IOException thrown if IO error occurred.
	 * @throws InterruptedException 
	 */
	private static void copyDirectoryImpl(File sourceDir, File destDir, IProgressMonitor monitor)
			throws IOException, InterruptedException {
		File[] items = sourceDir.listFiles();
		if (items != null && items.length > 0) {
			for (File anItem : items) {
				if (anItem.isDirectory()) {
					// create the directory in the destination
					File newDir = new File(destDir, anItem.getName());
					newDir.mkdir();

					// copy the directory (recursive call)
					copyDirectory(anItem, newDir, monitor);
				} else {
					// copy the file
					File destFile = new File(destDir, anItem.getName());
					copySingleFile(anItem, destFile);
				}
				
				monitor.worked(1);
				
				if (monitor.isCanceled()) {
					throw new InterruptedException();
				}
			}
		}
	}

	/**
	 * Copy a file from a location to another
	 * @param sourceFile a File object represents the source file
	 * @param destFile a File object represents the destination file
	 * @throws IOException thrown if IO error occurred.
	 */
	private static void copySingleFile(File sourceFile, File destFile)
			throws IOException {
	
		if (!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel sourceChannel = null;
		FileChannel destChannel = null;

		try {
			sourceChannel = new FileInputStream(sourceFile).getChannel();
			destChannel = new FileOutputStream(destFile).getChannel();
			sourceChannel.transferTo(0, sourceChannel.size(), destChannel);
		} finally {
			if (sourceChannel != null) {
				sourceChannel.close();
			}
			if (destChannel != null) {
				destChannel.close();
			}
		}
	}
}
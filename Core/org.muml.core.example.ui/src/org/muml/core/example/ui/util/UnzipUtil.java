package org.muml.core.example.ui.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

public class UnzipUtil {

	/**
	 * Unzips the platform formatted zip file to specified folder
	 * 
	 * @param zipFile
	 *            The platform formatted zip file
	 * @param projectFolderFile
	 *            The folder where to unzip the project archive
	 * @param monitor
	 *            Monitor to display progress and/or cancel operation
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 * @throws UnsupportedEncodingException
	 */
	public static void unzip(ZipFile zipFile, File projectFolderFile,
			IProgressMonitor monitor) throws InterruptedException,
			UnsupportedEncodingException, IOException {

		try {
			Enumeration<? extends ZipEntry> e = zipFile.entries();

			while (e.hasMoreElements()) {
				ZipEntry zipEntry = (ZipEntry) e.nextElement();
				File file = new File(projectFolderFile, zipEntry.getName());

				if (false == zipEntry.isDirectory()) {

					/*
					 * Copy files (and make sure parent directory exist)
					 */
					File parentFile = file.getParentFile();
					if (null != parentFile && false == parentFile.exists()) {
						parentFile.mkdirs();
					}

					Path path = new Path(file.getPath());
					if (path.getFileExtension().equals("java")) { //$NON-NLS-1$
						InputStreamReader is = null;
						OutputStreamWriter os = null;

						try {

							is = new InputStreamReader(
									zipFile.getInputStream(zipEntry),
									"ISO-8859-1"); //$NON-NLS-1$

							os = new OutputStreamWriter(new FileOutputStream(
									file), ResourcesPlugin.getEncoding());
							char[] buffer = new char[102400];
							while (true) {
								int len = is.read(buffer);
								if (len < 0)
									break;
								os.write(buffer, 0, len);
							}
						} finally {
							if (null != is) {
								is.close();
							}
							if (null != os) {
								os.close();
							}
						}
					} else {
						InputStream is = null;
						OutputStream os = null;

						try {
							is = zipFile.getInputStream(zipEntry);
							os = new FileOutputStream(file);

							byte[] buffer = new byte[102400];
							while (true) {
								int len = is.read(buffer);
								if (len < 0)
									break;
								os.write(buffer, 0, len);
							}
						} finally {
							if (null != is) {
								is.close();
							}
							if (null != os) {
								os.close();
							}
						}
					}
				}

				monitor.worked(1);

				if (monitor.isCanceled()) {
					throw new InterruptedException();
				}
			}
		} finally {
			zipFile.close();
		}
	}
}

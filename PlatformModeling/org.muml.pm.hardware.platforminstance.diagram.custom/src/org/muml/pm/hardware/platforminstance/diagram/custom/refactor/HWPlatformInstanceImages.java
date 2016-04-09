package org.muml.pm.hardware.platforminstance.diagram.custom.refactor;


import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.muml.pm.hardware.platforminstance.diagram.part.PlatformInstanceDiagramEditorPlugin;
/**
 * 
 * @author andreas muelder - Initial contribution and API
 *
 */
public enum HWPlatformInstanceImages {

	COLLAPSE_PICTOGRAM("platform:/plugin/org.muml.pm.hardware.common/icons/collapse_large.gif"),
	EXPAND_PICTOGRAM("platform:/plugin/org.muml.pm.hardware.common/icons/expand_large.gif"),

	LOGO("icons/obj16/logo-16.png");
	

	private final String path;

	private HWPlatformInstanceImages(String path) {
		this.path = path;
	}

	/**
	 * Returns an image. Clients do not need to dispose the image, it will be
	 * disposed automatically.
	 * 
	 * @return an {@link Image}
	 */
	public Image image() {
		final ImageRegistry imageRegistry = PlatformInstanceDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(path);
		if (image == null) {
			addImageDescriptor();
			image = imageRegistry.get(path);
		}

		return image;
	}

	/**
	 * Returns an image descriptor.
	 * 
	 * @return an {@link ImageDescriptor}
	 */
	public ImageDescriptor imageDescriptor() {
		final ImageRegistry imageRegistry = PlatformInstanceDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		ImageDescriptor imageDescriptor = imageRegistry.getDescriptor(path);
		if (imageDescriptor == null) {
			addImageDescriptor();
			imageDescriptor = imageRegistry.getDescriptor(path);
		}

		return imageDescriptor;
	}

	private void addImageDescriptor() {
		final PlatformInstanceDiagramEditorPlugin plugin = PlatformInstanceDiagramEditorPlugin.getInstance();
		URL imageURL = null;
		try {
			imageURL = new URL(path);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final ImageDescriptor id = ImageDescriptor.createFromURL(imageURL);
		plugin.getImageRegistry().put(path, id);
	}

}

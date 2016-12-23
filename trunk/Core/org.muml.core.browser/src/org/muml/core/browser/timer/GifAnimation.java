package org.muml.core.browser.timer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;

import org.muml.core.browser.ModelBrowserPlugin;

public class GifAnimation extends Timer {
	private volatile int frame = 0;
	private volatile Image currentImage;
	private Image[] images;
	
	public GifAnimation(int delayMs, URL url) {
		super(delayMs);

		InputStream inputStream = null;
		try {
			inputStream = new BufferedInputStream(url.openStream());
			ImageLoader loader = new ImageLoader();
			loader.load(inputStream);
			images = new Image[loader.data.length];
			for (int i = 0; i < loader.data.length; i++) {
				ImageData imageData = loader.data[i];
				images[i] = new Image(Display.getCurrent(), imageData);
			}
		} catch (IOException e) {
			ModelBrowserPlugin.log(e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
				}
			}
		}
	}

	@Override
	public void elapsed() {
		if (images != null && images.length > 0) {
			frame = (frame + 1) % images.length;
			currentImage = images[frame];
		}

		super.elapsed();
	}
	

	public Image getCurrentImage() {
		return currentImage;
	}

}

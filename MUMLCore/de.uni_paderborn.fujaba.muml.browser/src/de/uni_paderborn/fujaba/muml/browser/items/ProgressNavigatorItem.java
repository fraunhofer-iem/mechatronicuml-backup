package de.uni_paderborn.fujaba.muml.browser.items;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;

import de.uni_paderborn.fujaba.muml.browser.ModelBrowserPlugin;
import de.uni_paderborn.fujaba.muml.browser.timer.GifAnimation;
import de.uni_paderborn.fujaba.muml.browser.timer.Timer;

public class ProgressNavigatorItem implements Timer.Callback {
	private Object parent;
	private StructuredViewer viewer;
	private String[] properties = new String[] { "image" }; 
	
	public static GifAnimation ANIMATION = null;
	public GifAnimation getAnimation() {
		if (ANIMATION == null) {
			URL url = ModelBrowserPlugin.getDefault().getBundleUrl("/icons/progress.gif");
			ANIMATION = new GifAnimation(75, url);
		}
		return ANIMATION;
	}
	
	
	public ProgressNavigatorItem(Object parent) {
		this.parent = parent;
		
	}

	
	public void elapsed() {
		if (viewer != null) {
			viewer.update(ProgressNavigatorItem.this, null);
		}
	}
	
	public void setViewer(Viewer viewer) {
		if (viewer instanceof StructuredViewer) {
			this.viewer = (StructuredViewer) viewer;
		}
		
		if (viewer != null) {
			getAnimation().addCallback(this);
		} else {
			getAnimation().removeCallback(this);
		}
	}
	
	public Object getParent() {
		return parent;
	}
	
	public void dispose() {
		viewer = null;
	}
	
	public Image getCurrentImage() {
		return getAnimation().getCurrentImage();
	}
}

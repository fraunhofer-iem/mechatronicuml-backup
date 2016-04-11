package org.muml.core.browser.items;

import java.net.URL;

import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

import org.muml.core.browser.ModelBrowserPlugin;
import org.muml.core.browser.timer.GifAnimation;
import org.muml.core.browser.timer.Timer;

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

package org.muml.core.browser.timer;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.widgets.Display;



public class Timer implements Runnable {
	public interface Callback {
		void elapsed();
	}
	private volatile boolean running = false;
	private volatile int delayMs;
	private Set<Callback> callbacks = new HashSet<Callback>();

	public Timer(int delayMs) {
		this.delayMs = delayMs;
	}
	
	public void setDelayMs(int delayMs) {
		this.delayMs = delayMs;
	}
	
	@Override
	public void run() {
		if (!callbacks.isEmpty() && running) {
			start();
			elapsed();
		}
	}
	
	public void start() {
		if (delayMs > 0) {
			running = true;
			Display.getCurrent().timerExec(delayMs, this);
		}
	}
	
	public void stop() {
		running = false;
	}
	
	public void elapsed() {
		for (Callback callback : callbacks) {
			callback.elapsed();
		}
	}
	
	public void addCallback(Callback callback) {
		if (callbacks.isEmpty()) {
			start();
		}
		callbacks.add(callback);
	}

	public void removeCallback(Callback callback) {
		callbacks.remove(callback);
		if (callbacks.isEmpty()) {
			stop();
		}
	}
}
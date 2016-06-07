package org.muml.graphviz.blackbox;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.common.xtext.ILanguageResource;
import org.muml.core.common.xtext.ILoadResult;


public abstract class AbstractGraphvizLayouter<I, O> {
	
	public O layout(I graph) {
		String input = createInput(graph);
		return runLayouter(input);
	}
	
	@NonNull
	public abstract String createInput(I graph);
	
	@NonNull
	protected abstract ILanguageResource getLanguageResource();
	
	@NonNull
	protected abstract String[] getCommand();
	
	protected O runLayouter(String dotString) {
		ProcessBuilder pb = new ProcessBuilder(getCommand());
		ThreadPool threadPool = new ThreadPool();
		try {
			Process process = pb.start();
			// FIXME: the dot grammar should ensure a trailing newline
			process.getOutputStream().write((dotString + "\n").getBytes());
			process.getOutputStream().close();
			StdoutWorker<O> layouter = new StdoutWorker<O>(process.getInputStream());
			threadPool.add(layouter);
			StreamWorker errorWorker = new StderrWorker(process.getErrorStream());
			threadPool.add(errorWorker);
			System.err.println(errorWorker.getData());
			threadPool.join();
			process.getInputStream().close();
			process.getErrorStream().close();
			process.waitFor();
			return layouter.getGraph();
		} catch (IOException e) {
			System.out.println("No Layouting. Maybe, Graphviz is not installed, i.e., dot is not available via the command line");
			// e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static class StreamUtil {
		
		@NonNull
		public static String read(@NonNull InputStream in) throws IOException {
			InputStreamReader streamReader = new InputStreamReader(in);
			StringBuilder builder = new StringBuilder();
			int c;
			do {
				c = streamReader.read();
				if (c != -1) {
					builder.append((char) c);
				}
			} while (c != -1);
			streamReader.close();
			return builder.toString();
		}
		
	}
	
	public static class ThreadPool {
		private List<Thread> pool;
		
		public ThreadPool() {
			pool = new ArrayList<Thread>();
		}
		
		public void add(@NonNull Runnable runnable) {
			Thread thread = new Thread(runnable);
			pool.add(thread);
			thread.start();
		}
		
		public void join() throws InterruptedException {
			for (Thread thread : pool) {
				thread.join();
			}
		}
	}
	
	public static class StreamWorker implements Runnable {
		@NonNull
		private InputStream in;
		private String data;
		
		public StreamWorker(@NonNull InputStream in) {
			this.in = in;
		}
		
		public void run() {
			try {
				data = StreamUtil.read(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@NonNull
		public String getData() {
			return data;
		}
	}
	
	public class StdoutWorker<G> extends StreamWorker {

		public StdoutWorker(InputStream in) {
			super(in);
		}
		
		// TODO: make ILanguageResource/ILoadResult generic
		@SuppressWarnings("unchecked")
		public G getGraph() {
			ILoadResult loadResult = getLanguageResource()
					.loadFromString(getData(), null);
			if (loadResult.hasError()) {
				throw new IllegalArgumentException(loadResult.getError());
			}
			return (G) loadResult.getEObject();
		}
		
	}
	
	public static class StderrWorker extends StreamWorker {

		public StderrWorker(InputStream in) {
			super(in);
		}
		
	}

}

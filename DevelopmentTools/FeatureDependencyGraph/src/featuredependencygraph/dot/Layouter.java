package featuredependencygraph.dot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.muml.graphviz.blackbox.GraphvizDotLayouter;
import org.muml.graphviz.dot.DotGraph;

public class Layouter extends GraphvizDotLayouter {

	@Override
	protected String[] getDotOptions() {
		String[] options = {"-Tpng"};
		return options;
	}

	@Override
	protected String[] getCommand() {
		String[] options = getDotOptions();
		String[] cmd = new String[1 + options.length];
		cmd[0] = "dot";
		System.arraycopy(options, 0, cmd, 1, options.length);
		return cmd;
	}
	
	@Override
	protected DotGraph runLayouter(String dotString) {
		ProcessBuilder pb = new ProcessBuilder(getCommand());
		ThreadPool threadPool = new ThreadPool();
		try {
			Process process = pb.start();
			// FIXME: the dot grammar should ensure a trailing newline
			process.getOutputStream().write((dotString + "\n").getBytes());
			process.getOutputStream().close();
			SaveToFileStreamWorker layouter = new SaveToFileStreamWorker(process.getInputStream(), new File("test.png"));
			threadPool.add(layouter);
			threadPool.add(new StderrWorker(process.getErrorStream()));
			threadPool.join();
			process.getInputStream().close();
			process.getErrorStream().close();
			process.waitFor();

		} catch (IOException e) {
			System.out.println("No Layouting. Maybe, Graphviz is not installed, i.e., dot is not available via the command line");
			// e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public static class SaveToFileStreamWorker implements Runnable {
		private InputStream in;
		private File file;
		public SaveToFileStreamWorker(InputStream in, File file) {
			this.in = in;
			this.file = file;
		}
		
		public void run() {
			FileOutputStream out = null;
			try {
				out = new FileOutputStream(file);
				IOUtils.copy(in, out);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (out != null) {
						out.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	}
}

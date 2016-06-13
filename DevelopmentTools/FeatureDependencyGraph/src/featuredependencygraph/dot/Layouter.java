package featuredependencygraph.dot;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.muml.graphviz.blackbox.GraphvizDotLayouter;
import org.muml.graphviz.dot.DotGraph;

public class Layouter extends GraphvizDotLayouter {

	
	private String filename;
	private String filetype;
	
	public Layouter(String filename, String filetype) {
		this.filename = filename;
		this.filetype = filetype;
	}
	
	@Override
	protected String[] getDotOptions() {
		String[] options = { "-T" + filetype };
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
		System.out.println(dotString);
		ProcessBuilder pb = new ProcessBuilder(getCommand());
		ThreadPool threadPool = new ThreadPool();
		Process process = null;
		try {
			process = pb.start();
	
			// FIXME: the dot grammar should ensure a trailing newline
			process.getOutputStream().write((dotString + "\n").getBytes());
			process.getOutputStream().close();
			SaveToFileStreamWorker layouter = new SaveToFileStreamWorker(process.getInputStream(),
					new File(filename + "." + filetype));
			threadPool.add(layouter);
			threadPool.join();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
			

		} catch (IOException e) {
			System.out.println(
					"No Layouting. Maybe, Graphviz is not installed, i.e., dot is not available via the command line");
			
			// e.printStackTrace();
	
		}
		
		if (process != null) {
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String line;
			try {
				while (null != (line = br.readLine())) {
					System.out.println(line);
				}
			} catch (IOException e1) {
			}
		}
	
		try {
			process.getInputStream().close();
			process.getErrorStream().close();
			process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
			FileOutputStream out;
			try {
				out = new FileOutputStream(file);
				int n;
				byte[] buffer = new byte[1024];
				while ((n = in.read(buffer)) > -1) {
					out.write(buffer, 0, n);
				}
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package org.muml.core.common.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Process implements Callable<Integer> {
		
	private final java.lang.Process process;
		
	private Reader reader;
	private Writer[] writers;
		
	private ExecutorService executor = Executors.newCachedThreadPool();
	private Future<Integer> futureExitValue;
					
	public Process(Command command, Reader reader, Writer... writers) throws IOException {
		
		this.reader = reader;
		this.writers = writers;
		
		ProcessBuilder pbuilder = getProcessBuilder(command);
												
		pbuilder.redirectErrorStream(true);
						
		process = pbuilder.start();
						
		futureExitValue = executor.submit(this);
	}
	
	
	public Process(Command command, Writer... writers) throws IOException {
		this(command, null, writers);
	}	
	
	protected boolean stayAlive() {
		return true;
	};
	
	@Override
	public Integer call() throws InterruptedException, ExecutionException {
		
		// reads the output of the given reader and writes it to the process output stream
		Callable<Void> outputStreamCallable = new ReadWriteCallable(reader, new OutputStreamWriter(getOutputStream()));
		
		// reads the the process input stream and writes it to the given writers  
		Callable<Void> inputStreamCallable  = new ReadWriteCallable(new InputStreamReader(getInputStream()), writers);
		
		// start reading the input stream first to ensure that the full output stream is processed 
		Future<Void> inputFuture = executor.submit(inputStreamCallable);
		Future<Void> outputFuture = executor.submit(outputStreamCallable);
				
		while (!hasProcessTerminated()) {
			if (stayAlive()) {
				Thread.yield();
			}
			else {
				process.destroy();
			}
		}
						
		outputFuture.get();
		inputFuture.get();
		
		return process.exitValue();
	}
		
	private boolean hasProcessTerminated() {
		try {
			process.exitValue();
			return true;
		}
		catch(IllegalThreadStateException e) {
			return false;
		}
	}	
	
	protected ProcessBuilder getProcessBuilder(Command command) {
		return command.createProcessBuilder();
	}
	
	public int waitForExitValue() throws InterruptedException, ExecutionException {
		return futureExitValue.get();
	}
	
	public boolean isRunning() {		
		return futureExitValue.isDone();
	}
		
	public OutputStream getOutputStream() {
		return process.getOutputStream();
	}
	
	public InputStream getInputStream() {
		return process.getInputStream();
	}
	
	
	private class ReadWriteCallable implements Callable<Void> {
		
		private Writer[] writers;
		
		private BufferedReader bufferedReader;
		
		public ReadWriteCallable(Reader reader, Writer... writers) {
			this.bufferedReader = (reader == null || reader instanceof BufferedReader) ? (BufferedReader) reader : new BufferedReader(reader);
			this.writers = writers;
		}
		
		@Override
		public Void call() throws IOException {

			if (bufferedReader != null) {
											
				String line = null;
				
				while ((line = bufferedReader.readLine()) != null) {
					for (Writer writer : writers) {
						writer.write(line);
						writer.write(System.getProperty("line.separator"));						
					}
				}				
			}
			
			return null;
		}
	}
	
}

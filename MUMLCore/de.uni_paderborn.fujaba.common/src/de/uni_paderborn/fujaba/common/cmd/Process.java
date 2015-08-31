package de.uni_paderborn.fujaba.common.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Process implements Runnable {
		
	private final java.lang.Process process;
	private final Thread processThread = new Thread(this, "Process Thread for " + toString());;
	
	private Reader reader;
	private Writer[] writers;
				
	public Process(Command command, Reader reader, Writer... writers) throws IOException {
		
		this.reader = reader;
		this.writers = writers;
		
		ProcessBuilder pbuilder = getProcessBuilder(command);
												
		pbuilder.redirectErrorStream(true);
						
		process = pbuilder.start();
				
		write();
			
	}
	
	
	public Process(Command command, Writer... writers) throws IOException {
		
		this(command, null, writers);
	
	}	
	
	protected boolean isRunning() {
		return true;
	};
	
	protected java.lang.Process getProcess() {
		return process;
	}
		
	@Override
	public void run() {
		
		// reads the output of the specified reader and writes it to the process output stream
		Thread outputStreamThread = new Thread(new ReadWriteRunnable(reader, new OutputStreamWriter(getOutputStream())), "Output Thread for " + toString());
		
		// reads the the process input stream and writes it to the specified writers  
		Thread inputStreamThread = new Thread(new ReadWriteRunnable(new InputStreamReader(getInputStream()), writers), "Input Thread for " + toString());
		
		// start reading the input stream first to ensure that the full output stream is processed 
		inputStreamThread.start();
		outputStreamThread.start();
		
		while (isProcessAlive()) {
			if (isRunning()) {
				Thread.yield();
			}
			else {
				process.destroy();
			}
		}
				
		try {
			outputStreamThread.join();			
			inputStreamThread.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	private boolean isProcessAlive() {
		try {
			process.exitValue();
			return false;
		}
		catch(IllegalThreadStateException e) {
			return true;
		}
	}	
	
	protected ProcessBuilder getProcessBuilder(Command command) {
		return command.createProcessBuilder();
	}
	
	
	public int waitFor() {
			
		try {

			processThread.join();
			
			return process.waitFor();
			
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean isAlive() {
		return processThread.isAlive();
	}
	
	public OutputStream getOutputStream() {
		
		return process.getOutputStream();
		
	}
	
	public InputStream getInputStream() {
		
		return process.getInputStream();
		
	}
			
	private void write() {
		write(getOutputStream(), getInputStream());
	}	
				
	private void write(OutputStream out, InputStream in) {		
		processThread.start();
	}
		
	private class ReadWriteRunnable implements Runnable {
		
		private Writer[] writers;
		
		private BufferedReader bufferedReader;
		
		public ReadWriteRunnable(Reader reader, Writer... writers) {
			this.bufferedReader = (reader == null || reader instanceof BufferedReader) ? (BufferedReader) reader : new BufferedReader(reader);
			this.writers = writers;
		}
		
		@Override
		public void run() {

			if (bufferedReader != null) {
											
				String line = null;
				
				try {
					while ((line = bufferedReader.readLine()) != null) {
						for (Writer writer : writers) {
							writer.write(line);
							writer.write(System.getProperty("line.separator"));						
						}
					}					
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}				
			}
		}
	}
}

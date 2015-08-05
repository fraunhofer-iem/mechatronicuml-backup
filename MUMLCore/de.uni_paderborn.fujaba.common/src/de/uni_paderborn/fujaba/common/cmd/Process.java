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
		
	private java.lang.Process process;
	private Thread processThread;
	
	private Reader reader;
	private Writer[] writers;
	
	private InputStream inputStream;
	private OutputStream outputStream;
			
	public Process(Command command, Reader reader, Writer... writers) {
		
		this.reader = reader;
		this.writers = writers;
		
		ProcessBuilder pbuilder = getProcessBuilder(command);
												
		pbuilder.redirectErrorStream(true);
						
		try {
		
			process = pbuilder.start();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		write();
			
	}
	
	
	public Process(Command command, Writer... writers) {
		
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
		Thread outputStreamThread = new ReadWriteThread("Output Thread for " + toString(), reader, new OutputStreamWriter(outputStream));
		
		// reads the the process input stream and writes it to the specified writers  
		Thread inputStreamThread = new ReadWriteThread("Input Thread for " + toString(), new InputStreamReader(inputStream), writers);
		
		// start reading the input stream first to ensure that the full output stream is processed 
		inputStreamThread.start();
		outputStreamThread.start();
		
		while (process.isAlive()) {
			if (isRunning()) {
				Thread.yield();
			}
			else {
				process.destroyForcibly();
			}
		}
				
		try {
			outputStreamThread.join();			
			inputStreamThread.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
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
		
		this.outputStream = out;
		this.inputStream = in;
		
		processThread = new Thread(this, "Program Thread for " + toString());
		processThread.start();
		
	}
		
	private class ReadWriteThread extends Thread {
		
		private Writer[] writers;
		
		private BufferedReader bufferedReader;
		
		public ReadWriteThread(String name, Reader reader, Writer... writers) {
			super(name);
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
													
							synchronized (writer) {
								writer.write(line);
								writer.write(System.getProperty("line.separator"));							
							}	
													
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

package de.uni_paderborn.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Process implements Runnable {
	
	private boolean running;
	
	private java.lang.Process process;
	private Thread programThread;
	
	private Reader reader;
	private Writer[] writers;
	
	private InputStream inputStream;
	private OutputStream outputStream;
			
	public <P extends Process> Process(Command command, Reader reader, Writer... writers) {
		
		this.reader = reader;
		this.writers = writers;
		
		ProcessBuilder pbuilder = getProcessBuilder(command);
												
		pbuilder.redirectErrorStream(true);
						
		try {
		
			process = pbuilder.start();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		running = true;
		
		write();
			
	}
	
	
	public <P extends Process> Process(Command command, Writer... writers) {
		
		this(command, null, writers);
	
	}	
	
	
	
	protected java.lang.Process getProcess() {
		return process;
	}
	
	private synchronized String readLine(BufferedReader reader) throws IOException {
		
		// synchronize in order to avoid reading while program is destroyed
		
		if (running) {
			
			return reader.readLine();
			
		};
		
		return null;
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
				
		try {
			outputStreamThread.join();			
			inputStreamThread.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	
	protected <P extends Process> ProcessBuilder getProcessBuilder(Command command) {
		return command.createProcessBuilder();
	}
	
	
	public int waitFor() {
			
		try {

			programThread.join();
			
			return process.waitFor();
			
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean isAlive() {
		return programThread.isAlive();
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
		
		programThread = new Thread(this, "Program Thread for " + toString());
		programThread.start();
		
	}
	
	public void destroy() {
		
		synchronized(this) {
			
			// synchronize in order to avoid destruction while the stream is being read
			running = false;
		}
		
		process.destroy();	
		
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
							
				List<FlusherThread> threads = new ArrayList<FlusherThread>();
				for (Writer writer : writers) {
					FlusherThread thread = new FlusherThread(writer);
					threads.add(thread);
					thread.start();
				}
				
				String line = null;
				
				try {
												
					while ((line = readLine(bufferedReader)) != null) {
						
						for (FlusherThread thread : threads) {
													
							synchronized (thread.writer) {
								
								thread.writer.write(line);
								thread.writer.write(System.getProperty("line.separator"));
								
								// notify writer thread
								thread.pending = true;
								thread.writer.notifyAll();
							
							}	
													
						}
					}
					
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
								
				for (FlusherThread thread : threads) {
					thread.terminate();
				}
				
			}
		}
		
		private class FlusherThread extends Thread {
			
			private Writer writer;
			private boolean running = false;
			private boolean pending = false;
			
			FlusherThread(Writer writer) {
				super("Flusher Thread for " + writer.toString());
				this.writer = writer;
			}
			
			@Override
			public void start() {
				
				running = true;
				
				super.start();
				
			}
										
			@Override
			public void run() {
										
				try {
					
					while (running || pending) {
						
						synchronized (writer) {
						
							if (pending) {
								writer.flush();
								pending = false;
							}
							
							writer.wait();
						}
												
					}
					
				}	
				catch (Exception e) {
					throw new RuntimeException(e);
				}
				
			}
			
			void terminate() {
				running = false;
							
				try {
					this.join();
				} 
				catch (InterruptedException e) {
					throw new RuntimeException(e);
				}	
			}
		}	
	}
}

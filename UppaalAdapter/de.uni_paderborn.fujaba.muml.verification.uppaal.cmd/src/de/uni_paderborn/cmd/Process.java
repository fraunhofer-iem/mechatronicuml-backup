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
		
		Thread output = new OutputThread("Output Thread for " + toString());
		Thread input = new InputThread("Input Thread for " + toString());
		
		output.start();
		input.start();
		
		try {
			output.join();			
			input.join();
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

	
	private class OutputThread extends Thread {
				
		private BufferedReader outReader;
		private Writer outWriter = new OutputStreamWriter(outputStream);
		
		WriterThread thread = new WriterThread(outWriter);
		
		OutputThread(String name) {
			super(name);
		}
				
		@Override
		public void run() {
			
			if (reader != null) {
				
				outReader = new BufferedReader(reader);
			
				String line = null;
				
				thread.start();
				
				try {
				
					while ((line = readLine(outReader)) != null) {
												
						thread.writer.write(line);
						thread.writer.write(System.getProperty("line.separator"));
						
						synchronized (thread) {
							
							// kick off writer thread
												
							thread.pending = true;
						
							thread.notifyAll();
						
						}
						
					}
					
					//close writer to make process execute
					thread.writer.close();
					
					
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				
				thread.terminate();
				
			}	
			
		}
		
	}
	
	private class InputThread extends Thread  {
		
		InputThread(String name) {
			super(name);
		}
		
		@Override
		public void run() {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			List<WriterThread> threads = new ArrayList<WriterThread>();
			for (Writer writer : writers) {
				WriterThread thread = new WriterThread(writer);
				threads.add(thread);
				thread.start();
			}
			
			String line = null;
			
			try {
											
				while ((line = readLine(reader)) != null) {
					
					for (WriterThread thread : threads) {
						
						thread.writer.write(line);
						thread.writer.write(System.getProperty("line.separator"));
					
						synchronized (thread) {
							
							// kick off writer thread
												
							thread.pending = true;
						
							thread.notifyAll();
						
						}	
												
					}
				}
				
			}
			catch (IOException e) {
				throw new RuntimeException(e);
			}
							
			for (WriterThread thread : threads) {
				thread.terminate();
			}
			
		}
		
	}
		
	private class WriterThread extends Thread {
		
		private Writer writer;
		private boolean running = false;
		private boolean pending = false;
		
		WriterThread(Writer writer) {
			super("Writer Thread for " + writer.toString());
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
				
				synchronized (this) {
					
					while (running || pending) {
											
						if (!pending) {
							this.wait();
						}
						else {
							writer.flush();
							pending = false;
						}					
					}
					
				};
				
			}	
			catch (Exception e) {
				throw new RuntimeException(e);
			}
			
		}
		
		void terminate() {
			running = false;
			
			synchronized (this) {
				this.notifyAll();
			}
			
			try {
				this.join();
			} 
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
		}

	}

}

package de.uni_paderborn.cmd;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;


public abstract class Command {
	
	private IPath directory = null;
	
	private List<Parameter<? extends Command>> params = new ArrayList<Parameter<? extends Command>>();
		
	public abstract String getName();
		
	public List<Parameter<? extends Command>> getParameters() {
				
		return Collections.unmodifiableList(params);
		
	}
		
	public Process execute(Reader reader, Writer... writers) {
		return new Process(this,reader,writers);
	}
	
	public void addParameter(Parameter<? extends Command> param) {
		
		params.add(param);
		
	}
	
	public String getOutput(Reader reader) {
		
		StringWriter stringWriter = new StringWriter();
				
		this.execute(reader, stringWriter).waitFor();
		
		return stringWriter.toString();		
		
	}
	
	public void printOutput(Reader reader, OutputStream stream) {
				
		this.execute(reader, new PrintWriter(stream));
		
	}
			
	public List<String> getSegments() {
		
		List<String> segments = new ArrayList<String>();
		segments.add(getName());
				
		for(Parameter<? extends Command> p : getParameters()) {
			if (p != null) {
				segments.addAll(p.getSegments());
			}	
		};
		
		return segments;
		
	};
	
	public IPath getDirectory() {
		return directory;
	}
	
	public void setDirectory(IPath directory) {
		this.directory = directory;
	}
	
	private final File getDirectoryFile() {
		if (directory == null) {
			return null;
		}
		else {
			return directory.toFile();
		}
	}
	
	protected ProcessBuilder createProcessBuilder() {
		
		ProcessBuilder builder = new ProcessBuilder(getSegments());		
		builder.directory(getDirectoryFile());
		return builder;
	}
			
}

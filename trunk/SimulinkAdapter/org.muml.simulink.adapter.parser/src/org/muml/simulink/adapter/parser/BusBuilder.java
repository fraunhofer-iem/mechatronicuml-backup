package org.muml.simulink.adapter.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.muml.simulink.Bus;
import org.muml.simulink.BusElement;
import org.muml.simulink.DataType;
import org.muml.simulink.SimulinkFactory;

public class BusBuilder 
{
	private SimulinkFactory factory = SimulinkFactory.eINSTANCE;
	
	private final Pattern elementPattern = Pattern.compile("%?BusElement\\(('([^']+)')?,('([^']+)')?,([0-9]+)?,('([^']+)')?\\)");
	
	private final int ELEMENT_NAME = 2;
	private final int ELEMENT_TYPE = 4;
	private final int ELEMENT_DIMENSION = 5;
	private final int ELEMENT_BUS = 7;
	
	private final Pattern busPattern = Pattern.compile("%?Bus\\(('([^']+)')\\)");
	private final int BUS_NAME = 2;
	
	private HashMap<String,Bus> loadedBuses = null;
	
	private String cwd = null;
	
	public BusBuilder()
	{
		this.loadedBuses = new HashMap<String,Bus>();
		this.cwd = System.getProperty("user.dir");
	}

	public BusElement parseElement(String string) throws BusBuilderException
	{	Matcher elementMatcher = this.elementPattern.matcher(string);
		
		if(!elementMatcher.matches())
			throw new BusBuilderException("Not a valid BusElement: " + string);
		
		BusElement element = this.factory.createBusElement();
		
		if(elementMatcher.group(ELEMENT_NAME) != null)
			element.setName(elementMatcher.group(ELEMENT_NAME));

		if(elementMatcher.group(ELEMENT_TYPE) != null)
		{
			DataType type = DataType.get(elementMatcher.group(ELEMENT_TYPE));
			element.setType(type);
		}

		if(elementMatcher.group(ELEMENT_DIMENSION) != null)
			element.setDimensions(elementMatcher.group(ELEMENT_DIMENSION));		
		
		if(elementMatcher.group(ELEMENT_BUS) != null)
		{
			Bus bus = this.getBus(elementMatcher.group(ELEMENT_BUS));				
			element.setBus(bus);
		}		
		
		return element;
	}
	
	public Bus parseBus(String string) throws BusBuilderException
	{
		Matcher busMatcher = this.busPattern.matcher(string);
		
		if(!busMatcher.matches())
			throw new BusBuilderException("Not a valid Bus: " + string);
		
		Bus bus = this.factory.createBus();
		
		if(busMatcher.group(BUS_NAME) != null)
			bus.setName(busMatcher.group(BUS_NAME));
		
		this.loadedBuses.put(bus.getName(), bus);
		
		return bus;		
	}
	
	public Bus loadBus(String fileName) throws BusBuilderException, FileNotFoundException
	{
		File file = new File(fileName);
		this.cwd = file.getParent();
		Scanner scanner = new Scanner(file);
		Bus bus = null;
		List<BusElement> elements = new LinkedList<BusElement>();
		String line = null;
		
		while(scanner.hasNext())
		{
			line = scanner.nextLine();
			if(line.startsWith("%"))
			{
				if(line.contains("BusElement"))
					elements.add(this.parseElement(line));
				else if(line.contains("Bus"))
					bus = this.parseBus(line);
			}
			
		}
		
		if(bus == null)
			throw new BusBuilderException("No Bus Defintion found in file " + fileName);
		
		bus.getElements().addAll(elements);
		
		return bus;
	}

	private Bus getBus(String name) throws BusBuilderException {
		
		if(this.loadedBuses.containsKey(name))
			return this.loadedBuses.get(name);
		try {
			return this.loadBus(this.cwd + File.separator + name + "Generator.m");
		} catch (FileNotFoundException e) {
			throw new BusBuilderException("Could not find Bus " + name, e);
		}
	}
	
	public Collection<Bus> getLoadedBuses()
	{
		return this.loadedBuses.values();
	}
}

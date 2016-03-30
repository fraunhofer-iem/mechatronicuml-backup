package org.muml.uppaal.adapter.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.widgets.Composite;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.uppaal.adapter.results.PropertyResult;
import org.muml.uppaal.adapter.results.PropertyResultRepository;

public class PropertiesResultWizardPage extends PropertiesWizardPage {
	Set<Property> fulfilledProperties;
	public PropertiesResultWizardPage(String title, List<Property> properties, Map<Property, List<Property>> subProperties, Set<Property> fulfilledProperties) {
		super(title, properties, subProperties);
		this.fulfilledProperties = fulfilledProperties == null ? new HashSet<Property>() : fulfilledProperties;
	}
	
	public PropertiesResultWizardPage(String title, PropertyResultRepository resultRepo) {
		this(title, getTopLevelProperties(resultRepo), getSubProperties(resultRepo), getFulfilledProperties(resultRepo));
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		selectAllButton.setVisible(false);
		deselectAllButton.setVisible(false);
		setTitle("Verification Results");
		setDescription("These are the results of the verification.");
		
		//Check exactly the fulfilled properties
		for (Property property : properties)
			setupPropertyAndChildren(property);
		ctv.collapseAll();
		ctv.refresh(true);
	}
	
	private void setupPropertyAndChildren(Property property) {
		setChecked(property, fulfilledProperties.contains(property));
		setSatisfied(property, fulfilledProperties.contains(property));
		
		for (Property subProperty : subProperties.get(property))
			setupPropertyAndChildren(subProperty);
	}
	
	private static List<Property> getTopLevelProperties(PropertyResultRepository repo) {
		ArrayList<Property> output = new ArrayList<Property>();
		for (PropertyResult result : repo.getResults())
			output.add(result.getProperty());
		return output;
	}
	
	private static Map<Property, List<Property>> getSubProperties(PropertyResultRepository repo) {
		Map<Property, List<Property>> output = new HashMap<Property, List<Property>>();
		for (PropertyResult result : repo.getResults())
			putSubProperties(result, output);
		return output;
	}
	
	/**
	 * Adds result.getProperty() as a key to map (with corresponding list of subproperties)
	 */
	private static void putSubProperties(PropertyResult result, Map<Property, List<Property>> map) {
		List<Property> image = new ArrayList<Property>();
		for (PropertyResult subResult : result.getSubPropertyResults()) {
			image.add(subResult.getProperty());
			putSubProperties(subResult, map);
		}
		
		map.put(result.getProperty(), image);
	}
	
	private static Set<Property> getFulfilledProperties(PropertyResultRepository repo) {
		HashSet<Property> output = new HashSet<Property>();
		for (PropertyResult result : repo.getResults())
			putFulfilledProperties(result, output);
		return output;
	}
	
	/**
	 * Puts itself and its subproperties' into fulfilledProperties if applicable 
	 */
	private static void putFulfilledProperties(PropertyResult result, Set<Property> fulfilledProperties) {
		if (result.isFulfilled())
			fulfilledProperties.add(result.getProperty());
		for (PropertyResult subResult : result.getSubPropertyResults())
			putFulfilledProperties(subResult, fulfilledProperties);
	}
}

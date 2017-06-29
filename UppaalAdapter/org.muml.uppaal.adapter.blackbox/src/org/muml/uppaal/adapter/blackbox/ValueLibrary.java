package org.muml.uppaal.adapter.blackbox;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.muml.uppaal.trace.VariableValue;
import org.muml.verification.core.runtime.VariableBinding;

public class ValueLibrary {

	public ValueLibrary() {}
	
	//use lists to save the array values, because it is more convenient
	/**Sets the value attribute of {@link VariableBinding}s to a list representing an array, which is constructed by translating a {@link LinkedHashSet} of {@link VariableValue}s.
	 * @param varBinding
	 * 		The {@link VariableBinding} the value attribute is to be set for.
	 * @param variableValues
	 * 		The {@link LinkedHashSet} containing the {@link VariableValue}s.
	 */
	public void setArrayValue(VariableBinding varBinding, LinkedHashSet<VariableValue> variableValues){
		//Start with dimension 1, because 0 is used to encode the portOrRoleInstanceID.
		//Therefore, the 0 dimension is irrelevant for the values and is evaluated in the calling QVT transformation.
		varBinding.setValue(createArrayValue(variableValues, 1));
	}
	
	
	private List<Object> createArrayValue(LinkedHashSet<VariableValue> variableValues, int curDimension) {

		BasicEList<Object> returnList = new BasicEList<Object>();
		
		LinkedHashSet<VariableValue> curValues = new LinkedHashSet<VariableValue>();
		curValues.addAll(variableValues);
		
		while(!curValues.isEmpty()){
			
			Iterator<VariableValue> iterator = curValues.iterator();
			VariableValue variableValue = iterator.next();
			int index = variableValue.getFirstNamedElementReference().getSingleNamedElementReference().getIndexes().get(curDimension);
			
			if(variableValue.getFirstNamedElementReference().getSingleNamedElementReference().getIndexes().size() > curDimension+1){
				//create new list, because there are dimensions left
				LinkedHashSet<VariableValue> variableValuesOfSameList = getVariableValuesOfSameList(variableValues, curDimension, variableValue.getFirstNamedElementReference().getSingleNamedElementReference().getIndexes().get(curDimension));
				curValues.removeAll(variableValuesOfSameList);
				
				returnList.add(index, createArrayValue(variableValuesOfSameList, curDimension+1));
			}
			
			
			//set values at correct position of list
			else{
				returnList.add(index, variableValue.getValue());
				curValues.remove(variableValue);
			}
		}
		
		return returnList;
	}	
		
	private LinkedHashSet<VariableValue> getVariableValuesOfSameList(LinkedHashSet<VariableValue> variableValues,  int dimension, int value){
		LinkedHashSet<VariableValue> returnSet = new LinkedHashSet<VariableValue>();
		for(VariableValue variableValue : variableValues){
			if(variableValue.getFirstNamedElementReference().getSingleNamedElementReference().getIndexes().get(dimension) == value)
				returnSet.add(variableValue);
		}
		return returnSet;
	}
	
}

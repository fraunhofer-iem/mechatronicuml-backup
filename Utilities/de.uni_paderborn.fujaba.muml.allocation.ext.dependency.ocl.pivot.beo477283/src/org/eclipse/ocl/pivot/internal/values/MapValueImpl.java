/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.values;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.MapTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.MapEntry;
import org.eclipse.ocl.pivot.values.MapValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.ValuesPackage;

/**
 * @generated NOT
 */
public class MapValueImpl extends ValueImpl implements MapValue //, Iterable<Object>
{	
	private <K,V> boolean checkElementsAreValues(Iterable<Map.Entry<K, V>> elements) {
		for (Map.Entry<K, V> element : elements) {
			assert ValueUtil.isBoxed(element.getKey());
			assert ValueUtil.isBoxed(element.getValue());
//			if (element instanceof Collection<?>) {
//				assert isNormalized((Iterable<?>)element);
//				assert checkElementsAreValues((Iterable<?>)element);
//			}
		}
		return true;
	}

	public static @NonNull MapValue createMapValueOfEach(@NonNull MapTypeId typeId, MapEntry[] mapEntries) {
		Map<Object, Object> boxedValues = new HashMap<Object, Object>();
		if (mapEntries != null) {
			for (MapEntry mapEntry : mapEntries) {
				boxedValues.put(mapEntry.getKey(), mapEntry.getValue());		// FIXME boxed
			}
		}
		return new MapValueImpl(typeId, boxedValues);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.MAP_VALUE;
	}

	protected @NonNull MapTypeId typeId;
	protected @NonNull Map<Object, Object> boxedValues;
	private int hashCode = 0;
	
	public MapValueImpl(@NonNull MapTypeId typeId, @NonNull Map<Object, Object> boxedValues) {
		this.typeId = typeId;
		this.boxedValues = boxedValues;
		assert checkElementsAreValues(boxedValues.entrySet());
	}

	@Override
	public @Nullable List<?> asEcoreObject(@NonNull IdResolver idResolver, @Nullable Class<?> instanceClass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public @Nullable <T> List<T> asEcoreObjects(@NonNull IdResolver idResolver, @Nullable Class<T> instanceClass) {
//		EMap<Object, Object> eMap = new BasicEMap<Object, Object>();
//		return eMap;
		throw new UnsupportedOperationException();
	}

	@Override
	public @NonNull Map<? extends Object, ? extends Object> asMap() {
		return boxedValues;
	}

	@Override
	public @NonNull MapValue asMapValue() {
		return this;
	}

	@Override
	public @NonNull Object asObject() {
		return boxedValues;
	}

	@Override
	public Object at(Object value) {
		if (value instanceof InvalidValueException) {
			throw (InvalidValueException)value;
		}
		Object object = boxedValues.get(value);
		if ((object == null) && !boxedValues.containsKey(value)) {
        	throw new InvalidValueException(PivotMessages.IndexNotInUse, value);
		}
		return object;
	}

	@SuppressWarnings("null")
	@Override
	public @NonNull Set<Map.Entry<Object, Object>> entrySet() {
		return boxedValues.entrySet();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MapValue)) {
			return false;
		}
		MapValue that = (MapValue)obj;
		int thisSize = this.intSize();
		int thatSize = that.intSize();
		if (thisSize != thatSize) {
			return false;
		}
		Set<Object> theseKeys = this.keySet();
		Set<Object> thoseKeys = that.keySet();
		if (!theseKeys.equals(thoseKeys)) {
			return false;
		}
		for (Object key : theseKeys){
			Object thisValue = this.at(key);
			Object thatValue = that.at(key);
			if (!ClassUtil.safeEquals(thisValue, thatValue)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public @NonNull Boolean excludes(@Nullable Object key) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		return boxedValues.containsKey(key) == false;			// FIXME redundant test to suppress warning
	}

	@Override
	public @NonNull Boolean excludes(@Nullable Object key, @Nullable Object value) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		if (value instanceof InvalidValueException) {
			throw (InvalidValueException)value;
		}
		Object keyValue = boxedValues.get(key);
		if (keyValue == null) {
			if (!boxedValues.containsKey(value)) {
	        	return true;
			}
			return value != null;
		}
		else {
			return keyValue.equals(value) == false;
		}
	}

	@Override
	public @NonNull Boolean excludesAll(@NonNull CollectionValue c) {
    	Set<Object> keySet = boxedValues.keySet();
        for (Object e1 : c.iterable()) {
			if (e1 == null) {
		        for (Object e2 : keySet) {
		            if (e2 == null) {
		            	return false;
		            }
		        }
        	}
        	else {
		        for (Object e2 : keySet) {
		            if (e1.equals(e2)) {
		            	return false;
		            }
		        }
        	}
        } 
        return true;
	}

	@Override
	public @NonNull Boolean excludesMap(@NonNull MapValue m) {
    	Set<Object> keySet = boxedValues.keySet();
        for (Object e1 : m.getKeys()) {
			if (e1 == null) {
		        for (Object e2 : keySet) {
		            if (e2 == null) {
		            	Object thisValue = at(e2);
		            	Object thatValue = m.at(e2);
		            	if (ClassUtil.safeEquals(thisValue,  thatValue)) {
			            	return false;
		            	}
		            }
		        }
        	}
        	else {
		        for (Object e2 : keySet) {
		            if (e1.equals(e2)) {
		            	Object thisValue = at(e2);
		            	Object thatValue = m.at(e2);
		            	if (ClassUtil.safeEquals(thisValue,  thatValue)) {
			            	return false;
		            	}
		            }
		        }
        	}
        } 
        return true;
	}

	@Override
	public @NonNull Boolean excludesValue(@Nullable Object thatValue) {
		if (thatValue instanceof InvalidValueException) {
			throw (InvalidValueException)thatValue;
		}
        for (Object thisValue : boxedValues.values()) {
			if (ClassUtil.safeEquals(thisValue, thatValue)) {
				return false;
        	}
        } 
        return true;
	}

	@Override
	public @NonNull MapValue excluding(@Nullable Object key) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		Map<Object, Object> newBoxedValues = new HashMap<Object, Object>(boxedValues);
		newBoxedValues.remove(key);
		return new MapValueImpl(typeId, newBoxedValues);
	}
	
	@Override
	public @NonNull MapValue excluding(@Nullable Object key, @Nullable Object value) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		if (value instanceof InvalidValueException) {
			throw (InvalidValueException)value;
		}
		Map<Object, Object> newBoxedValues = new HashMap<Object, Object>(boxedValues);
		Object actualValue = newBoxedValues.get(key);
		if (ClassUtil.safeEquals(actualValue, value)) {
			newBoxedValues.remove(key);
		}
		return new MapValueImpl(typeId, newBoxedValues);
	}
	
	@Override
	public @NonNull MapValue excludingAll(@NonNull CollectionValue c) {
		Map<Object, Object> newBoxedValues = new HashMap<Object, Object>(boxedValues);
		for (Object key : c) {
			newBoxedValues.remove(key);
		}
		return new MapValueImpl(typeId, newBoxedValues);
	}

	@Override
	public @NonNull MapValue excludingMap(@NonNull MapValue map) {
		Map<Object, Object> newBoxedValues = new HashMap<Object, Object>(boxedValues);
		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			Object key = entry.getKey();
			Object actualValue = newBoxedValues.get(key);
			if (ClassUtil.safeEquals(actualValue, entry.getValue())) {
				newBoxedValues.remove(key);
			}
		}
		return new MapValueImpl(typeId, newBoxedValues);
	}

	@SuppressWarnings("null")
	@Override
	public @NonNull Set<Entry<Object, Object>> getElements() {
		return boxedValues.entrySet();
	}

	@Override
	public @NonNull SetValue getKeys() {
		CollectionTypeId setId = TypeId.SET.getSpecializedId(typeId.getValueTypeId());
		return ValueUtil.createSetValue(setId, keySet());
	}

	@Override
	public @NonNull MapTypeId getTypeId() {
		return typeId;
	}

	@Override
	public @NonNull BagValue getValues() {
		CollectionTypeId bagId = TypeId.BAG.getSpecializedId(typeId.getValueTypeId());
		return ValueUtil.createBagValue(bagId, new BagImpl<Object>(boxedValues.values()));
	}

	@Override
	public final int hashCode() {
		if (hashCode == 0) {
			synchronized (this) {
				if (hashCode == 0) {
					long hash = 0x3333333333333333L;
					for (Map.Entry<Object,Object> entry : boxedValues.entrySet()) {
						if (entry != null) {
							Object key = entry.getKey();
							if (key != null) {
								hash += 3 * key.hashCode();
							}
							Object value = entry.getValue();
							if (value != null) {
								hash += 5 * value.hashCode();
							}
						}
					}
					hashCode = (int) hash;
					if (hashCode == 0) {
						hashCode = (int) (hash >> 32);
						if (hashCode == 0) {
							hashCode = 0x87654321;
						}
					}
				}
			}
		}
		return hashCode;
	}

	@Override
	public @NonNull Boolean includes(@Nullable Object key) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		return boxedValues.containsKey(key) != false;			// FIXME redundant test to suppress warning
	}

	@Override
	public @NonNull Boolean includes(@Nullable Object key, @Nullable Object value) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		if (value instanceof InvalidValueException) {
			throw (InvalidValueException)value;
		}
		Object keyValue = boxedValues.get(key);
		if (keyValue == null) {
			if (!boxedValues.containsKey(value)) {
	        	return false;
			}
			return value == null;
		}
		else {
			return keyValue.equals(value) != false;
		}
	}

	@Override
	public @NonNull Boolean includesAll(@NonNull CollectionValue c) {
    	Set<Object> keySet = boxedValues.keySet();
        for (Object e1 : c.iterable()) {
        	boolean gotIt = false;
			if (e1 == null) {
		        for (Object e2 : keySet) {
		            if (e2 == null) {
		            	gotIt = true;
		            	break;
		            }
		        }
        	}
        	else {
		        for (Object e2 : keySet) {
		            if (e1.equals(e2)) {
		            	gotIt = true;
		            	break;
		            }
		        }
        	}
        	if (!gotIt) {
        		return false;
        	}
        } 
        return true;
	}

	@Override
	public @NonNull Boolean includesMap(@NonNull MapValue m) {
    	Set<Object> keySet = boxedValues.keySet();
        for (Object e1 : m.getKeys()) {
        	boolean gotIt = false;
			if (e1 == null) {
		        for (Object e2 : keySet) {
		            if (e2 == null) {
		            	Object thisValue = at(e2);
		            	Object thatValue = m.at(e2);
		            	if (ClassUtil.safeEquals(thisValue,  thatValue)) {
			            	gotIt = true;
			            	break;
		            	}
		            }
		        }
        	}
        	else {
		        for (Object e2 : keySet) {
		            if (e1.equals(e2)) {
		            	Object thisValue = at(e2);
		            	Object thatValue = m.at(e2);
		            	if (ClassUtil.safeEquals(thisValue,  thatValue)) {
			            	gotIt = true;
			            	break;
		            	}
		            }
		        }
        	}
        	if (!gotIt) {
        		return false;
        	}
        } 
        return true;
	}

	@Override
	public @NonNull Boolean includesValue(@Nullable Object thatValue) {
		if (thatValue instanceof InvalidValueException) {
			throw (InvalidValueException)thatValue;
		}
        for (Object thisValue : boxedValues.values()) {
			if (ClassUtil.safeEquals(thisValue, thatValue)) {
				return true;
        	}
        } 
        return false;
	}

	@Override
	public @NonNull MapValue including(@NonNull MapTypeId returnTypeId, @Nullable Object key, @Nullable Object value) {
		if (key instanceof InvalidValueException) {
			throw (InvalidValueException)key;
		}
		if (value instanceof InvalidValueException) {
			throw (InvalidValueException)value;
		}
		Map<Object, Object> newBoxedValues = new HashMap<Object, Object>(boxedValues);
		newBoxedValues.put(key, value);
		return new MapValueImpl(returnTypeId, newBoxedValues);
	}

	@Override
	public @NonNull MapValue includingMap(@NonNull MapTypeId returnTypeId, @NonNull MapValue map) {
		Map<Object, Object> newBoxedValues = new HashMap<Object, Object>(boxedValues);
		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			newBoxedValues.put(entry.getKey(), entry.getValue());
		}
		return new MapValueImpl(returnTypeId, newBoxedValues);
	}

	@Override
	public int intSize() {
		return boxedValues.size();
	}

	@Override
	public @NonNull Boolean isEmpty() {
		return intSize() == 0;
	}

	@SuppressWarnings("null")
	@Override
	public @NonNull Set<Object> keySet() {
		return boxedValues.keySet();
	}

	@Override
	public @NonNull Boolean notEmpty() {
		return intSize() != 0;
	}

	@Override
	@NonNull
	public IntegerValue size() {
		return ValueUtil.integerValueOf(intSize());
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		toString(s, 100);
		return s.toString();
	}

	@Override
	public void toString(@NonNull StringBuilder s, int lengthLimit) {
		s.append(TypeId.MAP_NAME);
		s.append("{");
		boolean isFirst = true;
		for (Map.Entry<Object, Object> entry : boxedValues.entrySet()) {
			if (!isFirst) {
				s.append(",");
			}
			if (s.length() < lengthLimit) {
				ValueUtil.toString(entry.getKey(), s, lengthLimit-1);
				s.append(" <- ");
				ValueUtil.toString(entry.getValue(), s, lengthLimit-1);
			}
			else {
				s.append("...");
				break;
			}
			isFirst = false;
		}
		s.append("}");		
	}
}

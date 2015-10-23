package de.uni_paderborn.fujaba.muml.types.blackbox;

import de.uni_paderborn.fujaba.muml.types.PredefinedTypesResourceFactory;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;

public class TypesBlackbox {
	public static PrimitiveDataType getVoid() {
		return getTypeByName("void");
	}
	public static PrimitiveDataType getInt8() {
		return getTypeByName("int8");
	}
	public static PrimitiveDataType getInt16() {
		return getTypeByName("int16");
	}
	public static PrimitiveDataType getInt32() {
		return getTypeByName("int32");
	}
	public static PrimitiveDataType getInt64() {
		return getTypeByName("int64");
	}
	public static PrimitiveDataType getDouble() {
		return getTypeByName("double");
	}
	public static PrimitiveDataType getBoolean() {
		return getTypeByName("boolean");
	}
	public static PrimitiveDataType getUint8() {
		return getTypeByName("uint8");
	}
	public static PrimitiveDataType getUint16() {
		return getTypeByName("uint16");
	}
	public static PrimitiveDataType getUint32() {
		return getTypeByName("uint32");
	}
	public static PrimitiveDataType getUint64() {
		return getTypeByName("uint64");
	}
	
	public static PrimitiveDataType getTypeByName(String name) {
		// This relies on the fact that the unique identifier is equal to the name.
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject(name);
	}
}

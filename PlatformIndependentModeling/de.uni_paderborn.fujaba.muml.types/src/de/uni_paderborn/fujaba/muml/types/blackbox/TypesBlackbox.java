package de.uni_paderborn.fujaba.muml.types.blackbox;

import de.uni_paderborn.fujaba.muml.types.PredefinedTypesResourceFactory;
import de.uni_paderborn.fujaba.muml.types.PrimitiveDataType;

public class TypesBlackbox {
	public static PrimitiveDataType getVoid() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("void");
	}
	public static PrimitiveDataType getInt8() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("int8");
	}
	public static PrimitiveDataType getInt16() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("int16");
	}
	public static PrimitiveDataType getInt32() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("int32");
	}
	public static PrimitiveDataType getInt64() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("int64");
	}
	public static PrimitiveDataType getDouble() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("double");
	}
	public static PrimitiveDataType getUint8() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("uint8");
	}
	public static PrimitiveDataType getUint16() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("uint16");
	}
	public static PrimitiveDataType getUint32() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("uint32");
	}
	public static PrimitiveDataType getUint64() {
		return (PrimitiveDataType) PredefinedTypesResourceFactory.getResource().getEObject("uint64");
	}
}

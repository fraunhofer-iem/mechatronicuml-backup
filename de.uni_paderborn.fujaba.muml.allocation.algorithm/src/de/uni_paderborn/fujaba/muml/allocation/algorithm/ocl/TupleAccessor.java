package de.uni_paderborn.fujaba.muml.allocation.algorithm.ocl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.examples.domain.ids.TuplePartId;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.pivot.TupleType;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil;

public class TupleAccessor {
	private static final String invalidPart = "Type %s has no part named %s";
	private static final String unexpectedObject = "unexpected object %s";
	private static final String noTupleValue = "object %s is not a TupleValue instance";
	
	private static Object getPart(TupleValue tupleValue, String namedPart, EvaluatableElementCS elementCS,
			TupleType tupleType, boolean unboxValue) {
		//TupleType tupleType = TypesUtil.createLocationConstraintTupleType(locationConstraintCS);
		TuplePartId partId = tupleType.getTupleTypeId().getPartId(namedPart);
		if (partId == null) {
			throw new IllegalArgumentException(
					String.format(invalidPart, tupleType, namedPart));
		}
		Object partValue = tupleValue.getValue(partId);
		if (!unboxValue) {
			return partValue;
		}
		IdResolver idResolver = TypesUtil.getMetaModelManager(elementCS)
				.getIdResolver();
		Object unboxedValue = idResolver.unboxedValueOf(partValue);
		System.out.println("accessed: " + unboxedValue);
		// this is type safe as long as the locationConstraintCS is valid
		//return (NamedElement) unboxedValue;
		if (unboxedValue instanceof BigDecimal) {
			// XXX: qvto cannot convert a java.math.BigDecimal to "Real"
			// thus, we have to convert it to a double (maybe its somehow
			// possible to handle this conversion in the qvto transformation itself?)
			return ((BigDecimal) unboxedValue).doubleValue();
		}
		return unboxedValue;
	}	
	
	@Operation(kind=Kind.QUERY)
	public static Object getPart(TupleValue tupleValue, String namedPart, Object object) {
		return getPart(tupleValue, namedPart, object, true);
	}
	
	private static Object getPart(TupleValue tupleValue, String namedPart, Object object, boolean unboxValue) {
		TupleType tupleType = null;
		if (object instanceof LocationConstraintCS) {
			tupleType = TypesUtil.createLocationConstraintTupleType((LocationConstraintCS) object);
		} else if (object instanceof RequiredHardwareResourceInstanceConstraintCS) {
			tupleType = TypesUtil.createReqHWResInstanceConstraintTupleType((RequiredHardwareResourceInstanceConstraintCS) object);
		} else if (object instanceof ResourceConstraintCS) {
			// outer tuple type has exactly 2 parts
			if (tupleValue.getTypeId().getPartIds().length == 2) {
				tupleType = TypesUtil.createResourceConstraintOuterTupleType((ResourceConstraintCS) object);
			} else {
				tupleType = TypesUtil.createResourceConstraintInnerTupleType((ResourceConstraintCS) object);
			}
		} else if (object instanceof QoSDimensionCS) {
			tupleType = TypesUtil.createQoSDimensionTupleType((QoSDimensionCS) object);
		} else {
			throw new IllegalArgumentException(
					String.format(unexpectedObject, object));
		}
		return getPart(tupleValue, namedPart, (EvaluatableElementCS) object, tupleType, unboxValue);
	}
	
	@Operation(kind=Kind.QUERY)
	public static List<TupleValue> getSequencePart(TupleValue tupleValue, String namedPart, Object object) {
		CollectionValue result = (CollectionValue) getPart(tupleValue, namedPart, object, false);
		return createTupleValueList(result);
	}
	
	public static List<TupleValue> createTupleValueList(CollectionValue collection) {
		List<TupleValue> tupleValueList = new ArrayList<TupleValue>(collection.size().signum());
		for (Object elm : collection.getElements()) {
			// do a sanity check (better safe than sorry...)
			if (!(elm instanceof TupleValue)) {
				throw new IllegalArgumentException(String.format(noTupleValue, elm));
			}
			tupleValueList.add((TupleValue) elm);
		}
		return tupleValueList;
	}
	
	
}

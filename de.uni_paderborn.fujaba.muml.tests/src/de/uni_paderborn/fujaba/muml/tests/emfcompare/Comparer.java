package de.uni_paderborn.fujaba.muml.tests.emfcompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("unchecked")
public class Comparer {
	public class ComparationResult {

		private EObject a;
		private EObject b;
		private EStructuralFeature feature;
		private Boolean value;

		public ComparationResult(EObject a, EObject b,
				EStructuralFeature feature, Boolean value) {
			super();
			this.a = a;
			this.b = b;
			this.feature = feature;
			this.value = value;
		}

		public EObject getA() {
			return a;
		}

		public EObject getB() {
			return b;
		}

		public EStructuralFeature getFeature() {
			return feature;
		}

		public Boolean getValue() {
			return value;
		}

		public void setValue(Boolean value) {
			this.value = value;
		}
	}

	private Map<EObject, Collection<ComparationResult>> storedResults = new HashMap<EObject, Collection<ComparationResult>>();
	private Object differenceA, differenceB;
	private EStructuralFeature differenceFeature;
	private Collection<EStructuralFeature> unrequiredFeatures = new ArrayList<EStructuralFeature>();
	private boolean alwaysUnordered = false;

	public Comparer() {
		this(false);
	}

	public Comparer(boolean alwaysUnordered) {
		this.alwaysUnordered = alwaysUnordered;
	}

	public ComparationResult getStoredResult(EObject a, EObject b,
			EStructuralFeature feature) {
		Collection<ComparationResult> results = storedResults.get(a);
		if (results == null) {
			return null;
		}
		for (ComparationResult result : results) {
			if (result.getA() == a && result.getB() == b
					&& result.getFeature() == feature) {
				return result;
			}
		}
		return null;
	}

	public void storeResult(ComparationResult result) {
		Collection<ComparationResult> results = storedResults
				.get(result.getA());
		if (results == null) {
			results = new ArrayList<ComparationResult>();
			storedResults.put(result.getA(), results);
		}
		results.add(result);
	}

	public boolean compare(Resource a, Resource b) {
		return compare((EList<Object>) (EList<?>) a.getContents(),
				(EList<Object>) (EList<?>) b.getContents(), true);
	}

	protected boolean compare(EObject a, EObject b, EStructuralFeature feature) {
		// Check if already visited in this call stack or stored
		ComparationResult result = getStoredResult(a, b, feature);
		if (result != null) {
			Boolean value = result.getValue();
			if (value == null) {
				return true;
			} else {
				return value.booleanValue();
			}
		}

		// Mark as last visited feature
		// TODO: Seems to be the wrong position for this
//		differenceFeature = feature;
//		differenceA = a;
//		differenceB = b;

		// Mark as visited in this call stack
		result = new ComparationResult(a, b, feature, null);
		storeResult(result);

		boolean equals = false;
		if (feature.isMany()) {
			Collection<Object> elementsA = (Collection<Object>) a.eGet(feature);
			Collection<Object> elementsB = (Collection<Object>) b.eGet(feature);
			equals = compare(elementsA, elementsB, isOrdered(feature));

		} else {
			equals = compare(a.eGet(feature), b.eGet(feature));
		}

		// Store value
		result.setValue(Boolean.valueOf(equals));

		return equals;

	}

	protected boolean isOrdered(EStructuralFeature feature) {
		if (alwaysUnordered) {
			return false;
		}
		return feature.isOrdered();
	}

	public boolean compare(Collection<Object> elementsA,
			Collection<Object> elementsB, boolean ordered) {
		if (ordered) {
			Iterator<Object> itA = elementsA.iterator();
			Iterator<Object> itB = elementsB.iterator();
			while (itA.hasNext() && itB.hasNext()) {
				Object elementA = itA.next();
				Object elementB = itB.next();
				if (!compare(elementA, elementB)) {
					return false;
				}
			}
			if (itA.hasNext() != itB.hasNext()) {
				return false;
			}
			return true;
		} else {
			Collection<Object> unmatchedA = new ArrayList<Object>(elementsA);
			Collection<Object> unmatchedB = new ArrayList<Object>(elementsB);

			for (Object elementA : elementsA) {
				Iterator<Object> itB = unmatchedB.iterator();
				while (itB.hasNext()) {
					Object elementB = itB.next();
					if (compare(elementA, elementB)) {
						itB.remove();
						break;
					}
				}
			}

			for (Object elementB : elementsB) {
				Iterator<Object> itA = unmatchedA.iterator();
				while (itA.hasNext()) {
					Object elementA = itA.next();
					if (compare(elementA, elementB)) {
						itA.remove();
						break;
					}
				}

			}
			return unmatchedA.isEmpty() && unmatchedB.isEmpty();
		}
	}

	public boolean compare(Object elementA, Object elementB) {
		if (elementA == elementB) {
			return true;
		}
		if (elementA == null || elementB == null) {
			return false;
		}

		if (elementA instanceof EObject && elementB instanceof EObject) {
			return compareEObject((EObject) elementA, (EObject) elementB);
		}

		if (elementA instanceof Enumerator && elementB instanceof Enumerator) {
			return compareEnumerator((Enumerator) elementA,
					(Enumerator) elementB);
		}

		if (elementA.getClass() != elementB.getClass()) {
			return false;
		}

		return elementA.equals(elementB) && elementB.equals(elementA);
	}

	public boolean compareEObject(EObject elementA, EObject elementB) {
		// Compare classes
		if (elementA.eClass() != elementB.eClass()) {
			return false;
		}

		// Compare all features
		EClass eClass = elementA.eClass();
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {

			if (isRequiredFeature(elementA, elementB, feature)
					&& !compare(elementA, elementB, feature)) {
				return false;
			}
		}
		return true;
	}

	public boolean compareEnumerator(Enumerator elementA, Enumerator elementB) {
		if (!compare(elementA.getLiteral(), elementA.getLiteral())) {
			return false;
		}
		if (!compare(elementA.getName(), elementA.getName())) {
			return false;
		}
		if (!compare(elementA.getValue(), elementA.getValue())) {
			return false;
		}
		return true;
	}

	protected boolean isRequiredFeature(EObject elementA, EObject elementB,
			EStructuralFeature feature) {
		return !unrequiredFeatures.contains(feature);
	}

	public void addUnrequiredFeature(EStructuralFeature feature) {
		unrequiredFeatures.add(feature);
	}

	public void removeUnrequiredFeature(EStructuralFeature feature) {
		unrequiredFeatures.remove(feature);
	}

	public Object getDifferenceA() {
		return differenceA;
	}

	public Object getDifferenceB() {
		return differenceB;
	}

	public EStructuralFeature getDifferenceFeature() {
		return differenceFeature;
	}

}
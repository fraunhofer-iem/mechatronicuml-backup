package org.muml.verification.core.reachanalysis.rtsc;


/**
 * Defines the semantics for the timed reachability analyses. Either the transition 
 * relation defined by Alur will be used or the relation defined by Uppaal. In case 
 * of Uppaal, an explicit distinction between delay and action transition is made.
 * In case of Alur, a delay is part of an action transition.
 */
public enum TimeSemantics {

	ALUR(0, "Alur"),
	UPPAAL(1, "Uppaal");

	/**
	 * The '<em><b>Alur</b></em>' literal value.
	 */
	public static final int ALUR_VALUE = 0;

	/**
	 * The '<em><b>Uppaal</b></em>' literal value.
	 */
	public static final int UPPAAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Time Semantics</b></em>' enumerators.
	 */
	private static final TimeSemantics[] VALUES_ARRAY =
		new TimeSemantics[] {
		ALUR,
		UPPAAL,
	};

	
	/**
	 * Returns the '<em><b>Time Semantics</b></em>' literal with the specified name.
	 */
	public static TimeSemantics getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeSemantics result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Semantics</b></em>' literal with the specified integer value.
	 */
	public static TimeSemantics get(int value) {
		switch (value) {
		case ALUR_VALUE: return ALUR;
		case UPPAAL_VALUE: return UPPAAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeSemantics(int value, String name) {
		this.value = value;
		this.name = name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}


	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return name;
	}

} //TimeSemantics

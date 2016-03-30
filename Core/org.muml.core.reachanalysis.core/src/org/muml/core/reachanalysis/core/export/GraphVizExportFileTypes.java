package org.muml.core.reachanalysis.core.export;

public enum GraphVizExportFileTypes {
	PDF(0, "pdf"),
	SVG(1, "svg"),
	PNG(2, "png");

	/**
	 * The '<em><b>PDF</b></em>' literal value.
	 */
	public static final int PDF_VALUE = 0;

	/**
	 * The '<em><b>SVG</b></em>' literal value.
	 */
	public static final int SVG_VALUE = 1;

	/**
	 * The '<em><b>PNG</b></em>' literal value.
	 */
	public static final int PNG_VALUE = 2;
	
	/**
	 * An array of all the '<em><b>Time Semantics</b></em>' enumerators.
	 */
	private static final GraphVizExportFileTypes[] VALUES_ARRAY =
		new GraphVizExportFileTypes[] {
		PDF,
		SVG,
		PNG,
	};

	
	/**
	 * Returns the '<em><b>Time Semantics</b></em>' literal with the specified name.
	 */
	public static GraphVizExportFileTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphVizExportFileTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Semantics</b></em>' literal with the specified integer value.
	 */
	public static GraphVizExportFileTypes get(int value) {
		switch (value) {
		case PDF_VALUE: return PDF;
		case SVG_VALUE: return SVG;
		case PNG_VALUE: return PNG;
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
	private GraphVizExportFileTypes(int value, String name) {
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
}

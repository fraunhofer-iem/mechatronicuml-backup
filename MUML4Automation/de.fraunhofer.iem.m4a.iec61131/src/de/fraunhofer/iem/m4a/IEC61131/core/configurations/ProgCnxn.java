/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Cnxn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceVar <em>Prog Data Source Var</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceValue <em>Prog Data Source Value</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkVar <em>Data Sink Var</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkValue <em>Data Sink Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgCnxn()
 * @model
 * @generated
 */
public interface ProgCnxn extends ProgConfElement {
	/**
	 * Returns the value of the '<em><b>Prog Data Source Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prog Data Source Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prog Data Source Var</em>' containment reference.
	 * @see #setProgDataSourceVar(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgCnxn_ProgDataSourceVar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymbolicVariable getProgDataSourceVar();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceVar <em>Prog Data Source Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prog Data Source Var</em>' containment reference.
	 * @see #getProgDataSourceVar()
	 * @generated
	 */
	void setProgDataSourceVar(SymbolicVariable value);

	/**
	 * Returns the value of the '<em><b>Prog Data Source Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prog Data Source Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prog Data Source Value</em>' containment reference.
	 * @see #setProgDataSourceValue(ProgDataSource)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgCnxn_ProgDataSourceValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProgDataSource getProgDataSourceValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getProgDataSourceValue <em>Prog Data Source Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prog Data Source Value</em>' containment reference.
	 * @see #getProgDataSourceValue()
	 * @generated
	 */
	void setProgDataSourceValue(ProgDataSource value);

	/**
	 * Returns the value of the '<em><b>Data Sink Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sink Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sink Var</em>' containment reference.
	 * @see #setDataSinkVar(SymbolicVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgCnxn_DataSinkVar()
	 * @model containment="true"
	 * @generated
	 */
	SymbolicVariable getDataSinkVar();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkVar <em>Data Sink Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sink Var</em>' containment reference.
	 * @see #getDataSinkVar()
	 * @generated
	 */
	void setDataSinkVar(SymbolicVariable value);

	/**
	 * Returns the value of the '<em><b>Data Sink Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sink Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sink Value</em>' containment reference.
	 * @see #setDataSinkValue(DataSink)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgCnxn_DataSinkValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSink getDataSinkValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn#getDataSinkValue <em>Data Sink Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sink Value</em>' containment reference.
	 * @see #getDataSinkValue()
	 * @generated
	 */
	void setDataSinkValue(DataSink value);

} // ProgCnxn

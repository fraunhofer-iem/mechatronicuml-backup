/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwvaluetype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package defines the basic data types needed to characterize resources
 * (i.e. DataSize, Frequency).
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface HwvaluetypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hwvaluetype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/hardware/hwvaluetype/1.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hwvaluetype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwvaluetypePackage eINSTANCE = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataSizeImpl <em>Data Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataSizeImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataSize()
	 * @generated
	 */
	int DATA_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.FrequencyImpl <em>Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.FrequencyImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataRateImpl <em>Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataRateImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataRate()
	 * @generated
	 */
	int DATA_RATE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.TimeIntervalImpl
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__LOWER_BOUND = ValuetypePackage.RANGE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__UPPER_BOUND = ValuetypePackage.RANGE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__UNIT = ValuetypePackage.RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = ValuetypePackage.RANGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit <em>Data Size Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataSizeUnit()
	 * @generated
	 */
	int DATA_SIZE_UNIT = 4;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit <em>Frequency Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getFrequencyUnit()
	 * @generated
	 */
	int FREQUENCY_UNIT = 5;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit <em>Data Rate Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataRateUnit()
	 * @generated
	 */
	int DATA_RATE_UNIT = 6;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Size</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize
	 * @generated
	 */
	EClass getDataSize();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize#getValue()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize#getUnit()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Unit();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency
	 * @generated
	 */
	EClass getFrequency();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency#getValue()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.Frequency#getUnit()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Unit();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Rate</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate
	 * @generated
	 */
	EClass getDataRate();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate#getValue()
	 * @see #getDataRate()
	 * @generated
	 */
	EAttribute getDataRate_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRate#getUnit()
	 * @see #getDataRate()
	 * @generated
	 */
	EAttribute getDataRate_Unit();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval#getUnit()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_Unit();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Size Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit
	 * @generated
	 */
	EEnum getDataSizeUnit();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit
	 * @generated
	 */
	EEnum getFrequencyUnit();

	/**
	 * Returns the meta object for enum '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit <em>Data Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Rate Unit</em>'.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit
	 * @generated
	 */
	EEnum getDataRateUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwvaluetypeFactory getHwvaluetypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataSizeImpl <em>Data Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataSizeImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataSize()
		 * @generated
		 */
		EClass DATA_SIZE = eINSTANCE.getDataSize();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE__VALUE = eINSTANCE.getDataSize_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE__UNIT = eINSTANCE.getDataSize_Unit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.FrequencyImpl <em>Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.FrequencyImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getFrequency()
		 * @generated
		 */
		EClass FREQUENCY = eINSTANCE.getFrequency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY__VALUE = eINSTANCE.getFrequency_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY__UNIT = eINSTANCE.getFrequency_Unit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataRateImpl <em>Data Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.DataRateImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataRate()
		 * @generated
		 */
		EClass DATA_RATE = eINSTANCE.getDataRate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RATE__VALUE = eINSTANCE.getDataRate_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RATE__UNIT = eINSTANCE.getDataRate_Unit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.TimeIntervalImpl
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__UNIT = eINSTANCE.getTimeInterval_Unit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit <em>Data Size Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSizeUnit
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataSizeUnit()
		 * @generated
		 */
		EEnum DATA_SIZE_UNIT = eINSTANCE.getDataSizeUnit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit <em>Frequency Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.FrequencyUnit
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getFrequencyUnit()
		 * @generated
		 */
		EEnum FREQUENCY_UNIT = eINSTANCE.getFrequencyUnit();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit <em>Data Rate Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataRateUnit
		 * @see de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.impl.HwvaluetypePackageImpl#getDataRateUnit()
		 * @generated
		 */
		EEnum DATA_RATE_UNIT = eINSTANCE.getDataRateUnit();

	}

} //HwvaluetypePackage

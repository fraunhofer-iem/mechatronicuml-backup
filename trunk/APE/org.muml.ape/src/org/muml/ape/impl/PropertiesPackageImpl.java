/**
 */
package org.muml.ape.impl;

import static org.muml.ape.PropertiesPackage.CLASS;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.ape.BaseInsertPoint;
import org.muml.ape.CheckboxPropertyEditor;
import org.muml.ape.ComboBoxPropertyEditor;
import org.muml.ape.CreationConstraint;
import org.muml.ape.CustomPropertyEditor;
import org.muml.ape.CustomTransformation;
import org.muml.ape.Filter;
import org.muml.ape.FlattenedListPropertyEditor;
import org.muml.ape.ListPropertyEditor;
import org.muml.ape.OCLFilter;
import org.muml.ape.OCLPropertyEditor;
import org.muml.ape.ObjectPropertyEditor;
import org.muml.ape.OrderedElement;
import org.muml.ape.Plugin;
import org.muml.ape.PropertiesFactory;
import org.muml.ape.PropertiesPackage;
import org.muml.ape.Property;
import org.muml.ape.PropertyCategory;
import org.muml.ape.PropertyEditor;
import org.muml.ape.PropertyGenerator;
import org.muml.ape.PropertyTab;
import org.muml.ape.RadioPropertyEditor;
import org.muml.ape.Reconciler;
import org.muml.ape.SpinnerPropertyEditor;
import org.muml.ape.TextPropertyEditor;
import org.muml.ape.TransformationPosition;
import org.muml.ape.util.PropertiesValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesPackageImpl extends EPackageImpl implements PropertiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconcilerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseInsertPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinnerPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flattenedListPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPropertyEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformationPositionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.ape.PropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PropertiesPackageImpl() {
		super(eNS_URI, PropertiesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PropertiesPackage init() {
		if (isInited) return (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

		// Obtain or create and register package
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePropertiesPackage.createPackageContents();

		// Initialize created meta-data
		thePropertiesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePropertiesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PropertiesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PropertiesPackage.eNS_URI, thePropertiesPackage);
		return thePropertiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyGenerator() {
		return propertyGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Reconciler() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_GenModel() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_ReferencedGenerators() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Plugin() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_DefaultTab() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Tabs() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGenerator_Packages() {
		return (EReference)propertyGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGenerator_ContributorId() {
		return (EAttribute)propertyGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGenerator_SourceFolder() {
		return (EAttribute)propertyGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconciler() {
		return reconcilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconciler_Enabled() {
		return (EAttribute)reconcilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconciler_ReconcilePackages() {
		return (EAttribute)reconcilerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconciler_ReconcileClasses() {
		return (EAttribute)reconcilerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReconciler_ReconcileProperties() {
		return (EAttribute)reconcilerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReconciler_CustomTransformations() {
		return (EReference)reconcilerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTransformation() {
		return customTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransformation_Uri() {
		return (EAttribute)customTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransformation_Enabled() {
		return (EAttribute)customTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransformation_Position() {
		return (EAttribute)customTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Id() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Name() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Vendor() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Version() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_RequiredBundles() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_RequiredExecutionEnvironment() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyTab() {
		return propertyTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTab_Id() {
		return (EAttribute)propertyTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTab_Name() {
		return (EAttribute)propertyTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyTab_AfterTab() {
		return (EAttribute)propertyTabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_GenPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Classes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Generator() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_GenClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Package() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OrderedElements() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClasses() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_AllSuperClasses() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Properties() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_BaseInsertPoints() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_PropertyCategories() {
		return (EReference)classEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedElement() {
		return orderedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderedElement_Clazz() {
		return (EReference)orderedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseInsertPoint() {
		return baseInsertPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseInsertPoint_BaseClass() {
		return (EReference)baseInsertPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCategory() {
		return propertyCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCategory_Title() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCategory_Vertical() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCategory_Open() {
		return (EAttribute)propertyCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCategory_Properties() {
		return (EReference)propertyCategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_GenFeature() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_VisibilityFilters() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_ReadOnlyFilters() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Tab() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Editor() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Tooltip() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Reconcile() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_CreationConstraint() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_CreationOppositeConstraint() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_InitializeOCLExpression() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyEditor() {
		return propertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyEditor_Property() {
		return (EReference)propertyEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPropertyEditor() {
		return textPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextPropertyEditor_MultiLine() {
		return (EAttribute)textPropertyEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpinnerPropertyEditor() {
		return spinnerPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpinnerPropertyEditor_Digits() {
		return (EAttribute)spinnerPropertyEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBoxPropertyEditor() {
		return comboBoxPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckboxPropertyEditor() {
		return checkboxPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioPropertyEditor() {
		return radioPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListPropertyEditor() {
		return listPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlattenedListPropertyEditor() {
		return flattenedListPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyEditor() {
		return objectPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPropertyEditor() {
		return oclPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomPropertyEditor() {
		return customPropertyEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomPropertyEditor_FullyQualifiedClassName() {
		return (EAttribute)customPropertyEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLFilter() {
		return oclFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLFilter_Expression() {
		return (EAttribute)oclFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationConstraint() {
		return creationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreationConstraint_Filters() {
		return (EReference)creationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransformationPosition() {
		return transformationPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFactory getPropertiesFactory() {
		return (PropertiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		propertyGeneratorEClass = createEClass(PROPERTY_GENERATOR);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__RECONCILER);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__GEN_MODEL);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__REFERENCED_GENERATORS);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__PLUGIN);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__DEFAULT_TAB);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__TABS);
		createEReference(propertyGeneratorEClass, PROPERTY_GENERATOR__PACKAGES);
		createEAttribute(propertyGeneratorEClass, PROPERTY_GENERATOR__CONTRIBUTOR_ID);
		createEAttribute(propertyGeneratorEClass, PROPERTY_GENERATOR__SOURCE_FOLDER);

		reconcilerEClass = createEClass(RECONCILER);
		createEAttribute(reconcilerEClass, RECONCILER__ENABLED);
		createEAttribute(reconcilerEClass, RECONCILER__RECONCILE_PACKAGES);
		createEAttribute(reconcilerEClass, RECONCILER__RECONCILE_CLASSES);
		createEAttribute(reconcilerEClass, RECONCILER__RECONCILE_PROPERTIES);
		createEReference(reconcilerEClass, RECONCILER__CUSTOM_TRANSFORMATIONS);

		customTransformationEClass = createEClass(CUSTOM_TRANSFORMATION);
		createEAttribute(customTransformationEClass, CUSTOM_TRANSFORMATION__URI);
		createEAttribute(customTransformationEClass, CUSTOM_TRANSFORMATION__ENABLED);
		createEAttribute(customTransformationEClass, CUSTOM_TRANSFORMATION__POSITION);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__ID);
		createEAttribute(pluginEClass, PLUGIN__NAME);
		createEAttribute(pluginEClass, PLUGIN__VENDOR);
		createEAttribute(pluginEClass, PLUGIN__VERSION);
		createEAttribute(pluginEClass, PLUGIN__REQUIRED_BUNDLES);
		createEAttribute(pluginEClass, PLUGIN__REQUIRED_EXECUTION_ENVIRONMENT);

		propertyTabEClass = createEClass(PROPERTY_TAB);
		createEAttribute(propertyTabEClass, PROPERTY_TAB__ID);
		createEAttribute(propertyTabEClass, PROPERTY_TAB__NAME);
		createEAttribute(propertyTabEClass, PROPERTY_TAB__AFTER_TAB);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__GEN_PACKAGE);
		createEReference(packageEClass, PACKAGE__CLASSES);
		createEReference(packageEClass, PACKAGE__GENERATOR);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__GEN_CLASS);
		createEReference(classEClass, CLASS__PACKAGE);
		createEReference(classEClass, CLASS__ORDERED_ELEMENTS);
		createEReference(classEClass, CLASS__SUPER_CLASSES);
		createEReference(classEClass, CLASS__ALL_SUPER_CLASSES);
		createEReference(classEClass, CLASS__PROPERTIES);
		createEReference(classEClass, CLASS__BASE_INSERT_POINTS);
		createEReference(classEClass, CLASS__PROPERTY_CATEGORIES);

		orderedElementEClass = createEClass(ORDERED_ELEMENT);
		createEReference(orderedElementEClass, ORDERED_ELEMENT__CLAZZ);

		baseInsertPointEClass = createEClass(BASE_INSERT_POINT);
		createEReference(baseInsertPointEClass, BASE_INSERT_POINT__BASE_CLASS);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__GEN_FEATURE);
		createEReference(propertyEClass, PROPERTY__VISIBILITY_FILTERS);
		createEReference(propertyEClass, PROPERTY__READ_ONLY_FILTERS);
		createEReference(propertyEClass, PROPERTY__TAB);
		createEReference(propertyEClass, PROPERTY__EDITOR);
		createEAttribute(propertyEClass, PROPERTY__TOOLTIP);
		createEAttribute(propertyEClass, PROPERTY__RECONCILE);
		createEReference(propertyEClass, PROPERTY__CREATION_CONSTRAINT);
		createEReference(propertyEClass, PROPERTY__CREATION_OPPOSITE_CONSTRAINT);
		createEAttribute(propertyEClass, PROPERTY__INITIALIZE_OCL_EXPRESSION);

		propertyEditorEClass = createEClass(PROPERTY_EDITOR);
		createEReference(propertyEditorEClass, PROPERTY_EDITOR__PROPERTY);

		textPropertyEditorEClass = createEClass(TEXT_PROPERTY_EDITOR);
		createEAttribute(textPropertyEditorEClass, TEXT_PROPERTY_EDITOR__MULTI_LINE);

		spinnerPropertyEditorEClass = createEClass(SPINNER_PROPERTY_EDITOR);
		createEAttribute(spinnerPropertyEditorEClass, SPINNER_PROPERTY_EDITOR__DIGITS);

		comboBoxPropertyEditorEClass = createEClass(COMBO_BOX_PROPERTY_EDITOR);

		checkboxPropertyEditorEClass = createEClass(CHECKBOX_PROPERTY_EDITOR);

		radioPropertyEditorEClass = createEClass(RADIO_PROPERTY_EDITOR);

		listPropertyEditorEClass = createEClass(LIST_PROPERTY_EDITOR);

		flattenedListPropertyEditorEClass = createEClass(FLATTENED_LIST_PROPERTY_EDITOR);

		objectPropertyEditorEClass = createEClass(OBJECT_PROPERTY_EDITOR);

		oclPropertyEditorEClass = createEClass(OCL_PROPERTY_EDITOR);

		customPropertyEditorEClass = createEClass(CUSTOM_PROPERTY_EDITOR);
		createEAttribute(customPropertyEditorEClass, CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME);

		propertyCategoryEClass = createEClass(PROPERTY_CATEGORY);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__TITLE);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__VERTICAL);
		createEAttribute(propertyCategoryEClass, PROPERTY_CATEGORY__OPEN);
		createEReference(propertyCategoryEClass, PROPERTY_CATEGORY__PROPERTIES);

		filterEClass = createEClass(FILTER);

		oclFilterEClass = createEClass(OCL_FILTER);
		createEAttribute(oclFilterEClass, OCL_FILTER__EXPRESSION);

		creationConstraintEClass = createEClass(CREATION_CONSTRAINT);
		createEReference(creationConstraintEClass, CREATION_CONSTRAINT__FILTERS);

		// Create enums
		transformationPositionEEnum = createEEnum(TRANSFORMATION_POSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		baseInsertPointEClass.getESuperTypes().add(this.getOrderedElement());
		propertyEClass.getESuperTypes().add(this.getOrderedElement());
		textPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		spinnerPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		comboBoxPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		checkboxPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		radioPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		listPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		flattenedListPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		objectPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		oclPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		customPropertyEditorEClass.getESuperTypes().add(this.getPropertyEditor());
		propertyCategoryEClass.getESuperTypes().add(this.getOrderedElement());
		oclFilterEClass.getESuperTypes().add(this.getFilter());

		// Initialize classes and features; add operations and parameters
		initEClass(propertyGeneratorEClass, PropertyGenerator.class, "PropertyGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyGenerator_Reconciler(), this.getReconciler(), null, "reconciler", null, 0, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_GenModel(), theGenModelPackage.getGenModel(), null, "genModel", null, 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_ReferencedGenerators(), this.getPropertyGenerator(), null, "referencedGenerators", null, 0, -1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_Plugin(), this.getPlugin(), null, "plugin", null, 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_DefaultTab(), this.getPropertyTab(), null, "defaultTab", null, 0, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_Tabs(), this.getPropertyTab(), null, "tabs", null, 0, -1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyGenerator_Packages(), this.getPackage(), this.getPackage_Generator(), "packages", null, 0, -1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGenerator_ContributorId(), ecorePackage.getEString(), "contributorId", null, 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGenerator_SourceFolder(), ecorePackage.getEString(), "sourceFolder", "src-gen", 1, 1, PropertyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reconcilerEClass, Reconciler.class, "Reconciler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconciler_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 1, 1, Reconciler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconciler_ReconcilePackages(), theEcorePackage.getEBoolean(), "reconcilePackages", "true", 0, 1, Reconciler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconciler_ReconcileClasses(), theEcorePackage.getEBoolean(), "reconcileClasses", "true", 0, 1, Reconciler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReconciler_ReconcileProperties(), theEcorePackage.getEBoolean(), "reconcileProperties", "true", 0, 1, Reconciler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReconciler_CustomTransformations(), this.getCustomTransformation(), null, "customTransformations", null, 0, -1, Reconciler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTransformationEClass, CustomTransformation.class, "CustomTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomTransformation_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, CustomTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomTransformation_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 1, 1, CustomTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomTransformation_Position(), this.getTransformationPosition(), "position", "POST_RECONCILE", 1, 1, CustomTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_Id(), theEcorePackage.getEString(), "id", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Vendor(), theEcorePackage.getEString(), "vendor", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Version(), theEcorePackage.getEString(), "version", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_RequiredBundles(), theEcorePackage.getEString(), "requiredBundles", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_RequiredExecutionEnvironment(), theEcorePackage.getEString(), "requiredExecutionEnvironment", "JavaSE-1.6", 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTabEClass, PropertyTab.class, "PropertyTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyTab_Id(), theEcorePackage.getEString(), "id", null, 1, 1, PropertyTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyTab_Name(), theEcorePackage.getEString(), "name", null, 1, 1, PropertyTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyTab_AfterTab(), theEcorePackage.getEString(), "afterTab", null, 0, 1, PropertyTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(propertyTabEClass, theEcorePackage.getEString(), "getQualifiedId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageEClass, org.muml.ape.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_GenPackage(), theGenModelPackage.getGenPackage(), null, "genPackage", null, 1, 1, org.muml.ape.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Classes(), this.getClass_(), this.getClass_Package(), "classes", null, 0, -1, org.muml.ape.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Generator(), this.getPropertyGenerator(), this.getPropertyGenerator_Packages(), "generator", null, 1, 1, org.muml.ape.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.muml.ape.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_GenClass(), theGenModelPackage.getGenClass(), null, "genClass", null, 1, 1, org.muml.ape.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Package(), this.getPackage(), this.getPackage_Classes(), "package", null, 1, 1, org.muml.ape.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OrderedElements(), this.getOrderedElement(), this.getOrderedElement_Clazz(), "orderedElements", null, 0, -1, org.muml.ape.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClasses(), this.getClass_(), null, "superClasses", null, 0, -1, org.muml.ape.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_AllSuperClasses(), this.getClass_(), null, "allSuperClasses", null, 0, -1, org.muml.ape.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Properties(), this.getProperty(), null, "properties", null, 0, -1, org.muml.ape.Class.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_BaseInsertPoints(), this.getBaseInsertPoint(), null, "baseInsertPoints", null, 0, -1, org.muml.ape.Class.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_PropertyCategories(), this.getPropertyCategory(), null, "propertyCategories", null, 0, -1, org.muml.ape.Class.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderedElementEClass, OrderedElement.class, "OrderedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderedElement_Clazz(), this.getClass_(), this.getClass_OrderedElements(), "clazz", null, 1, 1, OrderedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseInsertPointEClass, BaseInsertPoint.class, "BaseInsertPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseInsertPoint_BaseClass(), this.getClass_(), null, "baseClass", null, 1, 1, BaseInsertPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_GenFeature(), theGenModelPackage.getGenFeature(), null, "genFeature", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_VisibilityFilters(), this.getFilter(), null, "visibilityFilters", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_ReadOnlyFilters(), this.getFilter(), null, "readOnlyFilters", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Tab(), this.getPropertyTab(), null, "tab", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Editor(), this.getPropertyEditor(), this.getPropertyEditor_Property(), "editor", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Reconcile(), theEcorePackage.getEBoolean(), "reconcile", "true", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_CreationConstraint(), this.getCreationConstraint(), null, "creationConstraint", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_CreationOppositeConstraint(), this.getCreationConstraint(), null, "creationOppositeConstraint", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_InitializeOCLExpression(), theEcorePackage.getEString(), "initializeOCLExpression", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEditorEClass, PropertyEditor.class, "PropertyEditor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyEditor_Property(), this.getProperty(), this.getProperty_Editor(), "property", null, 1, 1, PropertyEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPropertyEditorEClass, TextPropertyEditor.class, "TextPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextPropertyEditor_MultiLine(), theEcorePackage.getEBoolean(), "multiLine", null, 1, 1, TextPropertyEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinnerPropertyEditorEClass, SpinnerPropertyEditor.class, "SpinnerPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpinnerPropertyEditor_Digits(), theEcorePackage.getEInt(), "digits", "0", 1, 1, SpinnerPropertyEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboBoxPropertyEditorEClass, ComboBoxPropertyEditor.class, "ComboBoxPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkboxPropertyEditorEClass, CheckboxPropertyEditor.class, "CheckboxPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioPropertyEditorEClass, RadioPropertyEditor.class, "RadioPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listPropertyEditorEClass, ListPropertyEditor.class, "ListPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flattenedListPropertyEditorEClass, FlattenedListPropertyEditor.class, "FlattenedListPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyEditorEClass, ObjectPropertyEditor.class, "ObjectPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclPropertyEditorEClass, OCLPropertyEditor.class, "OCLPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customPropertyEditorEClass, CustomPropertyEditor.class, "CustomPropertyEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomPropertyEditor_FullyQualifiedClassName(), ecorePackage.getEString(), "fullyQualifiedClassName", null, 1, 1, CustomPropertyEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCategoryEClass, PropertyCategory.class, "PropertyCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyCategory_Title(), theEcorePackage.getEString(), "title", null, 0, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyCategory_Vertical(), theEcorePackage.getEBoolean(), "vertical", "false", 1, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyCategory_Open(), theEcorePackage.getEBoolean(), "open", "true", 1, 1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyCategory_Properties(), this.getProperty(), null, "properties", null, 0, -1, PropertyCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(filterEClass, ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclFilterEClass, OCLFilter.class, "OCLFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLFilter_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, OCLFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationConstraintEClass, CreationConstraint.class, "CreationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreationConstraint_Filters(), this.getFilter(), null, "filters", null, 0, -1, CreationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transformationPositionEEnum, TransformationPosition.class, "TransformationPosition");
		addEEnumLiteral(transformationPositionEEnum, TransformationPosition.PRE_RECONCILE);
		addEEnumLiteral(transformationPositionEEnum, TransformationPosition.POST_RECONCILE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (propertyGeneratorEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniquePackages NoSelfReference"
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueClasses"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueFeatures UniqueCategoryTitles PropertiesFromSelfOrSuperclasses"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "CreationConstraintForContainments CreationOppositeConstraintForContainers"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (propertyGeneratorEClass, 
		   source, 
		   new String[] {
			 "UniquePackages", "packages->isUnique(genPackage)",
			 "NoSelfReference", "not referencedGenerators->includes(self)"
		   });	
		addAnnotation
		  (propertyTabEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "derivation", "generator.genModel.modelPluginId.concat(\'.\').concat(id)"
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "UniqueClasses", "classes->isUnique(genClass)"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "UniqueFeatures", "true -- properties->isUnique(genFeature)",
			 "UniqueCategoryTitles", "propertyCategories->isUnique(title)",
			 "PropertiesFromSelfOrSuperclasses", "properties->forAll(p | Set { self }->union(allSuperClasses).genClass.ecoreClass->includes(p.genFeature.ecoreFeature.eContainingClass))"
		   });	
		addAnnotation
		  (getClass_AllSuperClasses(), 
		   source, 
		   new String[] {
			 "derivation", "self->closure(superClasses)"
		   });	
		addAnnotation
		  (getClass_Properties(), 
		   source, 
		   new String[] {
			 "derivation", "orderedElements->select(p | p.oclIsKindOf(Property)).oclAsType(Property)->asOrderedSet()"
		   });	
		addAnnotation
		  (getClass_BaseInsertPoints(), 
		   source, 
		   new String[] {
			 "derivation", "orderedElements->select(p | p.oclIsKindOf(BaseInsertPoint)).oclAsType(BaseInsertPoint)->asOrderedSet()"
		   });	
		addAnnotation
		  (getClass_PropertyCategories(), 
		   source, 
		   new String[] {
			 "derivation", "orderedElements->select(p | p.oclIsKindOf(PropertyCategory)).oclAsType(PropertyCategory)->asOrderedSet()"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "CreationConstraintForContainments", "-- Creation Constraint must only be defined for Properties of containment references.\n(not creationConstraint.oclIsUndefined()) implies (genFeature.ecoreFeature.oclIsKindOf(ecore::EReference) and genFeature.ecoreFeature.oclAsType(ecore::EReference).containment)",
			 "CreationOppositeConstraintForContainers", "-- Creation Opposite Constraint must only be defined for Properties with an EOpposite of type containment reference.\n(not creationOppositeConstraint.oclIsUndefined()) implies (genFeature.ecoreFeature.oclIsKindOf(ecore::EReference) and genFeature.ecoreFeature.oclAsType(ecore::EReference).container)"
		   });
	}

} //PropertiesPackageImpl

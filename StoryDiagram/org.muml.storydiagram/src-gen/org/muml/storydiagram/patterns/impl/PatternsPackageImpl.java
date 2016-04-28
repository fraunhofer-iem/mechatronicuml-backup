/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.ExpressionsPackage;
import org.muml.storydiagram.StorydiagramPackage;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.expressions.ActivitiesExpressionsPackage;
import org.muml.storydiagram.activities.expressions.impl.ActivitiesExpressionsPackageImpl;
import org.muml.storydiagram.activities.impl.ActivitiesPackageImpl;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.expressions.CallsExpressionsPackage;
import org.muml.storydiagram.calls.expressions.impl.CallsExpressionsPackageImpl;
import org.muml.storydiagram.calls.impl.CallsPackageImpl;
import org.muml.storydiagram.impl.StorydiagramPackageImpl;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.AttributeAssignment;
import org.muml.storydiagram.patterns.BindingOperator;
import org.muml.storydiagram.patterns.BindingSemantics;
import org.muml.storydiagram.patterns.BindingState;
import org.muml.storydiagram.patterns.CollectionVariable;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.InclusionLink;
import org.muml.storydiagram.patterns.LinkConstraint;
import org.muml.storydiagram.patterns.LinkConstraintType;
import org.muml.storydiagram.patterns.LinkVariable;
import org.muml.storydiagram.patterns.MatchingPattern;
import org.muml.storydiagram.patterns.MaybeLink;
import org.muml.storydiagram.patterns.ObjectVariable;
import org.muml.storydiagram.patterns.Path;
import org.muml.storydiagram.patterns.PatternsFactory;
import org.muml.storydiagram.patterns.PatternsPackage;
import org.muml.storydiagram.patterns.PrimitiveVariable;
import org.muml.storydiagram.patterns.StoryPattern;
import org.muml.storydiagram.patterns.expressions.PatternsExpressionsPackage;
import org.muml.storydiagram.patterns.expressions.impl.PatternsExpressionsPackageImpl;
import org.muml.storydiagram.patterns.util.PatternsValidator;
import org.muml.storydiagram.templates.TemplatesPackage;
import org.muml.storydiagram.templates.impl.TemplatesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements
		PatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLinkVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maybeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingSemanticsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkConstraintTypeEEnum = null;

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
	 * @see org.muml.storydiagram.patterns.PatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternsPackageImpl() {
		super(eNS_URI, PatternsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternsPackage init() {
		if (isInited) return (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Obtain or create and register package
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StorydiagramPackageImpl theStorydiagramPackage = (StorydiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI) instanceof StorydiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI) : StorydiagramPackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		ActivitiesExpressionsPackageImpl theActivitiesExpressionsPackage = (ActivitiesExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) instanceof ActivitiesExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesExpressionsPackage.eNS_URI) : ActivitiesExpressionsPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI) : CallsPackage.eINSTANCE);
		CallsExpressionsPackageImpl theCallsExpressionsPackage = (CallsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) instanceof CallsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CallsExpressionsPackage.eNS_URI) : CallsExpressionsPackage.eINSTANCE);
		PatternsExpressionsPackageImpl thePatternsExpressionsPackage = (PatternsExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) instanceof PatternsExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI) : PatternsExpressionsPackage.eINSTANCE);
		TemplatesPackageImpl theTemplatesPackage = (TemplatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) instanceof TemplatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI) : TemplatesPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternsPackage.createPackageContents();
		theStorydiagramPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theActivitiesExpressionsPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallsExpressionsPackage.createPackageContents();
		thePatternsExpressionsPackage.createPackageContents();
		theTemplatesPackage.createPackageContents();

		// Initialize created meta-data
		thePatternsPackage.initializePackageContents();
		theStorydiagramPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theActivitiesExpressionsPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallsExpressionsPackage.initializePackageContents();
		thePatternsExpressionsPackage.initializePackageContents();
		theTemplatesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePatternsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PatternsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePatternsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
		return thePatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectVariable() {
		return objectVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_OutgoingLinks() {
		return (EReference)objectVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_LinkOrderConstraints() {
		return (EReference)objectVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectVariable_BindingSemantics() {
		return (EAttribute)objectVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectVariable_BindingOperator() {
		return (EAttribute)objectVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_AttributeAssignments() {
		return (EReference)objectVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractVariable() {
		return abstractVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVariable_Pattern() {
		return (EReference)abstractVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractVariable_BindingState() {
		return (EAttribute)abstractVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVariable_BindingExpression() {
		return (EReference)abstractVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVariable_Constraints() {
		return (EReference)abstractVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVariable_IncomingLinks() {
		return (EReference)abstractVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstraintExpression() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Pattern() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ObjectVariable() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLinkVariable() {
		return abstractLinkVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLinkVariable_BindingSemantics() {
		return (EAttribute)abstractLinkVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLinkVariable_BindingOperator() {
		return (EAttribute)abstractLinkVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLinkVariable_Source() {
		return (EReference)abstractLinkVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLinkVariable_SecondLinkConstraints() {
		return (EReference)abstractLinkVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLinkVariable_FirstLinkConstraints() {
		return (EReference)abstractLinkVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLinkVariable_Pattern() {
		return (EReference)abstractLinkVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLinkVariable_Target() {
		return (EReference)abstractLinkVariableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkConstraint() {
		return linkConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkConstraint_Index() {
		return (EAttribute)linkConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkConstraint_ConstraintType() {
		return (EAttribute)linkConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkConstraint_Negative() {
		return (EAttribute)linkConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConstraint_FirstLink() {
		return (EReference)linkConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConstraint_ReferencingObject() {
		return (EReference)linkConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkConstraint_SecondLink() {
		return (EReference)linkConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignment() {
		return attributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_Attribute() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_ValueExpression() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_ObjectVariable() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionVariable() {
		return collectionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionVariable_AtLeastOne() {
		return (EAttribute)collectionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionVariable_Unique() {
		return (EAttribute)collectionVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveVariable() {
		return primitiveVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveVariable_DataType() {
		return (EReference)primitiveVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_PathExpression() {
		return (EReference)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkVariable() {
		return linkVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_SourceEnd() {
		return (EReference)linkVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_TargetEnd() {
		return (EReference)linkVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_QualifierExpression() {
		return (EReference)linkVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusionLink() {
		return inclusionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingPattern() {
		return matchingPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map() {
		return matchingPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPattern() {
		return storyPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_Variables() {
		return (EReference)storyPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_Constraints() {
		return (EReference)storyPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_LinkVariables() {
		return (EReference)storyPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_ParentPattern() {
		return (EReference)storyPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_ContainedPatterns() {
		return (EReference)storyPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryPattern_BindingSemantics() {
		return (EAttribute)storyPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_TemplateSignature() {
		return (EReference)storyPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaybeLink() {
		return maybeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingState() {
		return bindingStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingSemantics() {
		return bindingSemanticsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingOperator() {
		return bindingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkConstraintType() {
		return linkConstraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactory getPatternsFactory() {
		return (PatternsFactory)getEFactoryInstance();
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
		objectVariableEClass = createEClass(OBJECT_VARIABLE);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__OUTGOING_LINKS);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__LINK_ORDER_CONSTRAINTS);
		createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_SEMANTICS);
		createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_OPERATOR);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENTS);

		abstractVariableEClass = createEClass(ABSTRACT_VARIABLE);
		createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__PATTERN);
		createEAttribute(abstractVariableEClass, ABSTRACT_VARIABLE__BINDING_STATE);
		createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__BINDING_EXPRESSION);
		createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__CONSTRAINTS);
		createEReference(abstractVariableEClass, ABSTRACT_VARIABLE__INCOMING_LINKS);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINT_EXPRESSION);
		createEReference(constraintEClass, CONSTRAINT__PATTERN);
		createEReference(constraintEClass, CONSTRAINT__OBJECT_VARIABLE);

		abstractLinkVariableEClass = createEClass(ABSTRACT_LINK_VARIABLE);
		createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_SEMANTICS);
		createEAttribute(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__BINDING_OPERATOR);
		createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SOURCE);
		createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__SECOND_LINK_CONSTRAINTS);
		createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__FIRST_LINK_CONSTRAINTS);
		createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__PATTERN);
		createEReference(abstractLinkVariableEClass, ABSTRACT_LINK_VARIABLE__TARGET);

		linkConstraintEClass = createEClass(LINK_CONSTRAINT);
		createEAttribute(linkConstraintEClass, LINK_CONSTRAINT__INDEX);
		createEAttribute(linkConstraintEClass, LINK_CONSTRAINT__CONSTRAINT_TYPE);
		createEAttribute(linkConstraintEClass, LINK_CONSTRAINT__NEGATIVE);
		createEReference(linkConstraintEClass, LINK_CONSTRAINT__FIRST_LINK);
		createEReference(linkConstraintEClass, LINK_CONSTRAINT__REFERENCING_OBJECT);
		createEReference(linkConstraintEClass, LINK_CONSTRAINT__SECOND_LINK);

		attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);

		collectionVariableEClass = createEClass(COLLECTION_VARIABLE);
		createEAttribute(collectionVariableEClass, COLLECTION_VARIABLE__AT_LEAST_ONE);
		createEAttribute(collectionVariableEClass, COLLECTION_VARIABLE__UNIQUE);

		primitiveVariableEClass = createEClass(PRIMITIVE_VARIABLE);
		createEReference(primitiveVariableEClass, PRIMITIVE_VARIABLE__DATA_TYPE);

		pathEClass = createEClass(PATH);
		createEReference(pathEClass, PATH__PATH_EXPRESSION);

		linkVariableEClass = createEClass(LINK_VARIABLE);
		createEReference(linkVariableEClass, LINK_VARIABLE__SOURCE_END);
		createEReference(linkVariableEClass, LINK_VARIABLE__TARGET_END);
		createEReference(linkVariableEClass, LINK_VARIABLE__QUALIFIER_EXPRESSION);

		inclusionLinkEClass = createEClass(INCLUSION_LINK);

		matchingPatternEClass = createEClass(MATCHING_PATTERN);
		createEOperation(matchingPatternEClass, MATCHING_PATTERN___NO_MODIFIER_IN_MATCHING_PATTERN__DIAGNOSTICCHAIN_MAP);

		maybeLinkEClass = createEClass(MAYBE_LINK);

		storyPatternEClass = createEClass(STORY_PATTERN);
		createEReference(storyPatternEClass, STORY_PATTERN__VARIABLES);
		createEReference(storyPatternEClass, STORY_PATTERN__CONSTRAINTS);
		createEReference(storyPatternEClass, STORY_PATTERN__LINK_VARIABLES);
		createEReference(storyPatternEClass, STORY_PATTERN__PARENT_PATTERN);
		createEReference(storyPatternEClass, STORY_PATTERN__CONTAINED_PATTERNS);
		createEAttribute(storyPatternEClass, STORY_PATTERN__BINDING_SEMANTICS);
		createEReference(storyPatternEClass, STORY_PATTERN__TEMPLATE_SIGNATURE);

		// Create enums
		bindingStateEEnum = createEEnum(BINDING_STATE);
		bindingSemanticsEEnum = createEEnum(BINDING_SEMANTICS);
		bindingOperatorEEnum = createEEnum(BINDING_OPERATOR);
		linkConstraintTypeEEnum = createEEnum(LINK_CONSTRAINT_TYPE);
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
		PatternsExpressionsPackage thePatternsExpressionsPackage = (PatternsExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsExpressionsPackage.eNS_URI);
		StorydiagramPackage theStorydiagramPackage = (StorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(StorydiagramPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TemplatesPackage theTemplatesPackage = (TemplatesPackage)EPackage.Registry.INSTANCE.getEPackage(TemplatesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePatternsExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objectVariableEClass.getESuperTypes().add(this.getAbstractVariable());
		abstractVariableEClass.getESuperTypes().add(theStorydiagramPackage.getVariable());
		abstractVariableEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		abstractLinkVariableEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		linkConstraintEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		collectionVariableEClass.getESuperTypes().add(this.getObjectVariable());
		primitiveVariableEClass.getESuperTypes().add(this.getAbstractVariable());
		pathEClass.getESuperTypes().add(this.getAbstractLinkVariable());
		linkVariableEClass.getESuperTypes().add(this.getAbstractLinkVariable());
		inclusionLinkEClass.getESuperTypes().add(this.getAbstractLinkVariable());
		matchingPatternEClass.getESuperTypes().add(this.getStoryPattern());
		maybeLinkEClass.getESuperTypes().add(this.getAbstractLinkVariable());
		storyPatternEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(objectVariableEClass, ObjectVariable.class, "ObjectVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectVariable_OutgoingLinks(), this.getAbstractLinkVariable(), this.getAbstractLinkVariable_Source(), "outgoingLinks", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectVariable_LinkOrderConstraints(), this.getLinkConstraint(), this.getLinkConstraint_ReferencingObject(), "linkOrderConstraints", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectVariable_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", "MANDATORY", 1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectVariable_BindingOperator(), this.getBindingOperator(), "bindingOperator", "CHECK_ONLY", 1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectVariable_AttributeAssignments(), this.getAttributeAssignment(), this.getAttributeAssignment_ObjectVariable(), "attributeAssignments", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractVariableEClass, AbstractVariable.class, "AbstractVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_Variables(), "pattern", null, 1, 1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractVariable_BindingState(), this.getBindingState(), "bindingState", "UNBOUND", 1, 1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractVariable_BindingExpression(), theExpressionsPackage.getExpression(), null, "bindingExpression", null, 0, 1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractVariable_Constraints(), this.getConstraint(), this.getConstraint_ObjectVariable(), "constraints", null, 0, -1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVariable_IncomingLinks(), this.getAbstractLinkVariable(), this.getAbstractLinkVariable_Target(), "incomingLinks", null, 0, -1, AbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_ConstraintExpression(), theExpressionsPackage.getExpression(), null, "constraintExpression", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Pattern(), this.getStoryPattern(), this.getStoryPattern_Constraints(), "pattern", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_ObjectVariable(), this.getAbstractVariable(), this.getAbstractVariable_Constraints(), "objectVariable", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractLinkVariableEClass, AbstractLinkVariable.class, "AbstractLinkVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractLinkVariable_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", "MANDATORY", 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractLinkVariable_BindingOperator(), this.getBindingOperator(), "bindingOperator", "CHECK_ONLY", 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractLinkVariable_Source(), this.getObjectVariable(), this.getObjectVariable_OutgoingLinks(), "source", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractLinkVariable_SecondLinkConstraints(), this.getLinkConstraint(), this.getLinkConstraint_SecondLink(), "secondLinkConstraints", null, 0, -1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractLinkVariable_FirstLinkConstraints(), this.getLinkConstraint(), this.getLinkConstraint_FirstLink(), "firstLinkConstraints", null, 0, -1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractLinkVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_LinkVariables(), "pattern", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractLinkVariable_Target(), this.getAbstractVariable(), this.getAbstractVariable_IncomingLinks(), "target", null, 1, 1, AbstractLinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkConstraintEClass, LinkConstraint.class, "LinkConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkConstraint_Index(), ecorePackage.getEInt(), "index", null, 1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkConstraint_ConstraintType(), this.getLinkConstraintType(), "constraintType", "NEXT", 1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkConstraint_Negative(), ecorePackage.getEBoolean(), "negative", null, 1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkConstraint_FirstLink(), this.getAbstractLinkVariable(), this.getAbstractLinkVariable_FirstLinkConstraints(), "firstLink", null, 1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkConstraint_ReferencingObject(), this.getObjectVariable(), this.getObjectVariable_LinkOrderConstraints(), "referencingObject", null, 1, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkConstraint_SecondLink(), this.getAbstractLinkVariable(), this.getAbstractLinkVariable_SecondLinkConstraints(), "secondLink", null, 0, 1, LinkConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAssignment_Attribute(), theEcorePackage.getEAttribute(), null, "attribute", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeAssignment_ValueExpression(), theExpressionsPackage.getExpression(), null, "valueExpression", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeAssignment_ObjectVariable(), this.getObjectVariable(), this.getObjectVariable_AttributeAssignments(), "objectVariable", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionVariableEClass, CollectionVariable.class, "CollectionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionVariable_AtLeastOne(), ecorePackage.getEBoolean(), "atLeastOne", null, 1, 1, CollectionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCollectionVariable_Unique(), theEcorePackage.getEBoolean(), "unique", "", 1, 1, CollectionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveVariableEClass, PrimitiveVariable.class, "PrimitiveVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveVariable_DataType(), theEcorePackage.getEDataType(), null, "dataType", null, 1, 1, PrimitiveVariable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPath_PathExpression(), theExpressionsPackage.getExpression(), null, "pathExpression", null, 1, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkVariableEClass, LinkVariable.class, "LinkVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkVariable_SourceEnd(), theEcorePackage.getEReference(), null, "sourceEnd", null, 0, 1, LinkVariable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkVariable_TargetEnd(), theEcorePackage.getEReference(), null, "targetEnd", null, 1, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkVariable_QualifierExpression(), theExpressionsPackage.getExpression(), null, "qualifierExpression", null, 0, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inclusionLinkEClass, InclusionLink.class, "InclusionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchingPatternEClass, MatchingPattern.class, "MatchingPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoModifierInMatchingPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(maybeLinkEClass, MaybeLink.class, "MaybeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storyPatternEClass, StoryPattern.class, "StoryPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoryPattern_Variables(), this.getAbstractVariable(), this.getAbstractVariable_Pattern(), "variables", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoryPattern_Constraints(), this.getConstraint(), this.getConstraint_Pattern(), "constraints", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoryPattern_LinkVariables(), this.getAbstractLinkVariable(), this.getAbstractLinkVariable_Pattern(), "linkVariables", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPattern_ParentPattern(), this.getStoryPattern(), this.getStoryPattern_ContainedPatterns(), "parentPattern", null, 0, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoryPattern_ContainedPatterns(), this.getStoryPattern(), this.getStoryPattern_ParentPattern(), "containedPatterns", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStoryPattern_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", "MANDATORY", 1, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStoryPattern_TemplateSignature(), theTemplatesPackage.getTemplateSignature(), theTemplatesPackage.getTemplateSignature_Pattern(), "templateSignature", null, 0, 1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingStateEEnum, BindingState.class, "BindingState");
		addEEnumLiteral(bindingStateEEnum, BindingState.UNBOUND);
		addEEnumLiteral(bindingStateEEnum, BindingState.BOUND);
		addEEnumLiteral(bindingStateEEnum, BindingState.MAYBE_BOUND);

		initEEnum(bindingSemanticsEEnum, BindingSemantics.class, "BindingSemantics");
		addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.MANDATORY);
		addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.NEGATIVE);
		addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.OPTIONAL);

		initEEnum(bindingOperatorEEnum, BindingOperator.class, "BindingOperator");
		addEEnumLiteral(bindingOperatorEEnum, BindingOperator.CHECK_ONLY);
		addEEnumLiteral(bindingOperatorEEnum, BindingOperator.CREATE);
		addEEnumLiteral(bindingOperatorEEnum, BindingOperator.DESTROY);

		initEEnum(linkConstraintTypeEEnum, LinkConstraintType.class, "LinkConstraintType");
		addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.FIRST);
		addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.LAST);
		addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.NEXT);
		addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.INDIRECT_SUCCESSOR);
		addEEnumLiteral(linkConstraintTypeEEnum, LinkConstraintType.INDEX);

		// Create annotations
		// subsets
		createSubsetsAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
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
		  (getPrimitiveVariable_DataType(), 
		   source, 
		   new String[] {
			 "derivation", "if (classifier <> null and classifier.oclIsKindOf(ecore::EDataType)) then classifier.oclAsType(ecore::EDataType) else null endif"
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";	
		addAnnotation
		  (getPrimitiveVariable_DataType(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getMatchingPattern__NoModifierInMatchingPattern__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.objectVariable->forAll(v:ObjectVariable | v.modifier = Modifier::NONE) and self.linkVariable->forAll(v:LinkVariable | v.modifier = Modifier::NONE)"
		   });
	}

} //PatternsPackageImpl

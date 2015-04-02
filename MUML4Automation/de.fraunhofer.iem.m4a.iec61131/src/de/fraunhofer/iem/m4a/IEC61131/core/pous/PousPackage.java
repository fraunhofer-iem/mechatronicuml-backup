/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous;

import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * contains so called program organisation units (pou's)
 * <!-- end-model-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousFactory
 * @model kind="package"
 * @generated
 */
public interface PousPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pous";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iem.fraunhofer.de/m4a/iec61131/1.0/core/pous";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pous";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PousPackage eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU <em>POU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.POU
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getPOU()
	 * @generated
	 */
	int POU = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU__IDENTIFIER = CorePackage.LIBRARY_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU__COMMENT = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU__LANGUAGE = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>POU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_FEATURE_COUNT = CorePackage.LIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>POU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_OPERATION_COUNT = CorePackage.LIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__IDENTIFIER = POU__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__COMMENT = POU__COMMENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__LANGUAGE = POU__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DECLARATIONS = POU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__RETURN_DOMAIN = POU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__BODY = POU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = POU_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_OPERATION_COUNT = POU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain <em>Function Return Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionReturnDomain()
	 * @generated
	 */
	int FUNCTION_RETURN_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Function Return Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function Return Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RETURN_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody <em>Function Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBody()
	 * @generated
	 */
	int FUNCTION_BODY = 2;

	/**
	 * The number of structural features of the '<em>Function Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.AbstractFunctionBlockDeclarationImpl <em>Abstract Function Block Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.AbstractFunctionBlockDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getAbstractFunctionBlockDeclaration()
	 * @generated
	 */
	int ABSTRACT_FUNCTION_BLOCK_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION_BLOCK_DECLARATION__IDENTIFIER = POU__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION_BLOCK_DECLARATION__COMMENT = POU__COMMENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION_BLOCK_DECLARATION__LANGUAGE = POU__LANGUAGE;

	/**
	 * The number of structural features of the '<em>Abstract Function Block Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT = POU_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Function Block Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FUNCTION_BLOCK_DECLARATION_OPERATION_COUNT = POU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockDeclarationImpl <em>Function Block Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBlockDeclaration()
	 * @generated
	 */
	int FUNCTION_BLOCK_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION__IDENTIFIER = ABSTRACT_FUNCTION_BLOCK_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION__COMMENT = ABSTRACT_FUNCTION_BLOCK_DECLARATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION__LANGUAGE = ABSTRACT_FUNCTION_BLOCK_DECLARATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION__DECLARATIONS = ABSTRACT_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION__BODY = ABSTRACT_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Block Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT = ABSTRACT_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Block Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_DECLARATION_OPERATION_COUNT = ABSTRACT_FUNCTION_BLOCK_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody <em>Function Block Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBlockBody()
	 * @generated
	 */
	int FUNCTION_BLOCK_BODY = 4;

	/**
	 * The number of structural features of the '<em>Function Block Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_BODY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function Block Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.ProgramDeclarationImpl <em>Program Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.ProgramDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getProgramDeclaration()
	 * @generated
	 */
	int PROGRAM_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION__IDENTIFIER = POU__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION__COMMENT = POU__COMMENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION__LANGUAGE = POU__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION__DECLARATIONS = POU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION__BODY = POU_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION_FEATURE_COUNT = POU_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Program Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DECLARATION_OPERATION_COUNT = POU_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.BlackboxFunctionBlockDeclarationImpl <em>Blackbox Function Block Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.BlackboxFunctionBlockDeclarationImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getBlackboxFunctionBlockDeclaration()
	 * @generated
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION__IDENTIFIER = ABSTRACT_FUNCTION_BLOCK_DECLARATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION__COMMENT = ABSTRACT_FUNCTION_BLOCK_DECLARATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION__LANGUAGE = ABSTRACT_FUNCTION_BLOCK_DECLARATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS = ABSTRACT_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blackbox Function Block Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT = ABSTRACT_FUNCTION_BLOCK_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blackbox Function Block Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOX_FUNCTION_BLOCK_DECLARATION_OPERATION_COUNT = ABSTRACT_FUNCTION_BLOCK_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockPointerImpl <em>Function Block Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockPointerImpl
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBlockPointer()
	 * @generated
	 */
	int FUNCTION_BLOCK_POINTER = 9;

	/**
	 * The feature id for the '<em><b>Function Block Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE = DeclarationsPackage.EXTERNAL_VAR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Block Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_POINTER_FEATURE_COUNT = DeclarationsPackage.EXTERNAL_VAR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Block Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_POINTER_OPERATION_COUNT = DeclarationsPackage.EXTERNAL_VAR_SPEC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getDeclarations()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_Declarations();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getReturnDomain <em>Return Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Domain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getReturnDomain()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_ReturnDomain();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration#getBody()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_Body();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain <em>Function Return Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Return Domain</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain
	 * @generated
	 */
	EClass getFunctionReturnDomain();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Body</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody
	 * @generated
	 */
	EClass getFunctionBody();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration <em>Function Block Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration
	 * @generated
	 */
	EClass getFunctionBlockDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getDeclarations()
	 * @see #getFunctionBlockDeclaration()
	 * @generated
	 */
	EReference getFunctionBlockDeclaration_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration#getBody()
	 * @see #getFunctionBlockDeclaration()
	 * @generated
	 */
	EReference getFunctionBlockDeclaration_Body();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody <em>Function Block Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Body</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody
	 * @generated
	 */
	EClass getFunctionBlockBody();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration <em>Program Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration
	 * @generated
	 */
	EClass getProgramDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration#getDeclarations()
	 * @see #getProgramDeclaration()
	 * @generated
	 */
	EReference getProgramDeclaration_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration#getBody()
	 * @see #getProgramDeclaration()
	 * @generated
	 */
	EReference getProgramDeclaration_Body();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU <em>POU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POU</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.POU
	 * @generated
	 */
	EClass getPOU();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.POU#getLanguage()
	 * @see #getPOU()
	 * @generated
	 */
	EAttribute getPOU_Language();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration <em>Abstract Function Block Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Function Block Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration
	 * @generated
	 */
	EClass getAbstractFunctionBlockDeclaration();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration <em>Blackbox Function Block Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackbox Function Block Declaration</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration
	 * @generated
	 */
	EClass getBlackboxFunctionBlockDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration#getDeclarations()
	 * @see #getBlackboxFunctionBlockDeclaration()
	 * @generated
	 */
	EReference getBlackboxFunctionBlockDeclaration_Declarations();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer <em>Function Block Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block Pointer</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer
	 * @generated
	 */
	EClass getFunctionBlockPointer();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer#getFunctionBlockType <em>Function Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Block Type</em>'.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer#getFunctionBlockType()
	 * @see #getFunctionBlockPointer()
	 * @generated
	 */
	EReference getFunctionBlockPointer_FunctionBlockType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PousFactory getPousFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECLARATION__DECLARATIONS = eINSTANCE.getFunctionDeclaration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Return Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECLARATION__RETURN_DOMAIN = eINSTANCE.getFunctionDeclaration_ReturnDomain();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getFunctionDeclaration_Body();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain <em>Function Return Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionReturnDomain()
		 * @generated
		 */
		EClass FUNCTION_RETURN_DOMAIN = eINSTANCE.getFunctionReturnDomain();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody <em>Function Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBody()
		 * @generated
		 */
		EClass FUNCTION_BODY = eINSTANCE.getFunctionBody();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockDeclarationImpl <em>Function Block Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBlockDeclaration()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_DECLARATION = eINSTANCE.getFunctionBlockDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_DECLARATION__DECLARATIONS = eINSTANCE.getFunctionBlockDeclaration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_DECLARATION__BODY = eINSTANCE.getFunctionBlockDeclaration_Body();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody <em>Function Block Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBlockBody()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_BODY = eINSTANCE.getFunctionBlockBody();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.ProgramDeclarationImpl <em>Program Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.ProgramDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getProgramDeclaration()
		 * @generated
		 */
		EClass PROGRAM_DECLARATION = eINSTANCE.getProgramDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_DECLARATION__DECLARATIONS = eINSTANCE.getProgramDeclaration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_DECLARATION__BODY = eINSTANCE.getProgramDeclaration_Body();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.POU <em>POU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.POU
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getPOU()
		 * @generated
		 */
		EClass POU = eINSTANCE.getPOU();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POU__LANGUAGE = eINSTANCE.getPOU_Language();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.AbstractFunctionBlockDeclarationImpl <em>Abstract Function Block Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.AbstractFunctionBlockDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getAbstractFunctionBlockDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_FUNCTION_BLOCK_DECLARATION = eINSTANCE.getAbstractFunctionBlockDeclaration();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.BlackboxFunctionBlockDeclarationImpl <em>Blackbox Function Block Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.BlackboxFunctionBlockDeclarationImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getBlackboxFunctionBlockDeclaration()
		 * @generated
		 */
		EClass BLACKBOX_FUNCTION_BLOCK_DECLARATION = eINSTANCE.getBlackboxFunctionBlockDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS = eINSTANCE.getBlackboxFunctionBlockDeclaration_Declarations();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockPointerImpl <em>Function Block Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockPointerImpl
		 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl#getFunctionBlockPointer()
		 * @generated
		 */
		EClass FUNCTION_BLOCK_POINTER = eINSTANCE.getFunctionBlockPointer();

		/**
		 * The meta object literal for the '<em><b>Function Block Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE = eINSTANCE.getFunctionBlockPointer_FunctionBlockType();

	}

} //PousPackage

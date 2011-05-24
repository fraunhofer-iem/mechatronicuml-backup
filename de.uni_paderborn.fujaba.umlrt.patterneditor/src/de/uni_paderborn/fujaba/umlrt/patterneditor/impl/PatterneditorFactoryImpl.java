/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.patterneditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.umlrt.patterneditor.PatternDiagram;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorFactory;
import de.uni_paderborn.fujaba.umlrt.patterneditor.PatterneditorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatterneditorFactoryImpl extends EFactoryImpl implements PatterneditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatterneditorFactory init() {
		try {
			PatterneditorFactory thePatterneditorFactory = (PatterneditorFactory)EPackage.Registry.INSTANCE.getEFactory("http:///de/uni_paderborn/fujaba/umlrt/patterneditor"); 
			if (thePatterneditorFactory != null) {
				return thePatterneditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatterneditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatterneditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatterneditorPackage.PATTERN_DIAGRAM: return createPatternDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternDiagram createPatternDiagram() {
		PatternDiagramImpl patternDiagram = new PatternDiagramImpl();
		return patternDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatterneditorPackage getPatterneditorPackage() {
		return (PatterneditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatterneditorPackage getPackage() {
		return PatterneditorPackage.eINSTANCE;
	}

} //PatterneditorFactoryImpl

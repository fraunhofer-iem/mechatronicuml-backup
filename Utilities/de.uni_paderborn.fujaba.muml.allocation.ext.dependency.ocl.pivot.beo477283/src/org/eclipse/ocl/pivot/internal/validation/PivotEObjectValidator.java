/*******************************************************************************
 * Copyright (c) 2012, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - initial API and implementation
 *   E.D.Willink (Obeo) - Bug 416287 - tuple-valued constraints
 *   E.D.Willink. M. Rostren (Obeo) - Bug 425830 - single constraint API
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.LanguageExpression;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.evaluation.AbstractConstraintEvaluator;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.utilities.LabelUtil;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.StringUtil;
import org.eclipse.ocl.pivot.validation.ComposedEValidator;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * A PivotEObjectValidator augments EValidator.Registry.INSTANCE validation by validation of
 * additional Pivot-defined invariants.
 * 
 * Since there is no per-ResourceSet EValidator.Registry it is necessary for the additional
 * functionality for a particular EPackage to be provided by displacing the global entry into
 * PivotEObjectValidator.eValidators and installing PivotEObjectValidator.INSTANCE in its stead.
 * 
 * When validation occurs, the static INSTANCE first invokes the displaced functionality and
 * then looks for a ValidationAdapter in the ResourceSet for the object to be validated.
 * This ValidationAdapter is only available if the ResourceSet is for an application for which
 * Pivot invariants were defined. Other applications see only a small overhead in their
 * processing time.
 */
public class PivotEObjectValidator implements EValidator
{
	/**
	 * A ValidationAdapter is installed in the ResourceSet of applications that register for additional
	 * PIvot-defined constraints. The standard validation is performed by PivotEObjectValidator.INSTANCE
	 * before additional functionality is provided by the ValidationAdapter.
	 * 
	 * For non-Pivot applications the ValidationAdapter adapts the ResourceSet containing the validatable
	 * (Ecore) instances. Validation is invoked for validatable (Ecore) instances.
	 * 
	 * For Pivot applications the ValidationAdapter adapts the ResourceSet containing the validatable
	 * metamodel elements. Validation is invoked for validatable (Pivot) elements so a redirection via
	 * the MetamodelManager is needed to find the ValidationAdapter on the externalResourceSet.
	 */
	public static class ValidationAdapter extends AdapterImpl
	{
		public static ValidationAdapter findAdapter(@NonNull ResourceSet resourceSet) {
			for (Adapter adapter : resourceSet.eAdapters()) {
				if (adapter instanceof ValidationAdapter) {
					return (ValidationAdapter)adapter;
				}
			}
			EnvironmentFactory environmentFactory = PivotUtilInternal.findEnvironmentFactory(resourceSet);
			if (environmentFactory != null) {
				ResourceSet externalResourceSet = environmentFactory.getResourceSet();
				for (Adapter adapter : externalResourceSet.eAdapters()) {
					if (adapter instanceof ValidationAdapter) {
						return (ValidationAdapter)adapter;
					}
				}
			}
			return null;
		}

		protected final @NonNull EnvironmentFactoryInternal environmentFactory;
		
		public ValidationAdapter(@NonNull EnvironmentFactoryInternal environmentFactory) {
			this.environmentFactory = environmentFactory;
		}

		public @NonNull EnvironmentFactoryInternal getEnvironmentFactory() {
			return environmentFactory;
		}

		/**
		 * Validate all of eClassifier's constraints for object, appending warnings and at most one error to diagnostics
		 * using context to elaborate the validation context.
		 */
		@Deprecated		// Temporary internal API preservation for Mars RC3 
		public boolean validate(@NonNull EClassifier eClassifier, @Nullable Object object, @Nullable DiagnosticChain diagnostics, @Nullable Map<Object, Object> context) {
			return validate(eClassifier, object, null, diagnostics, context);
		}
		public boolean validate(@NonNull EClassifier eClassifier, @Nullable Object object, @Nullable List<Model> complementingModels,
				@Nullable DiagnosticChain diagnostics, @Nullable Map<Object, Object> context) {
			boolean allOk = true;
			PivotMetamodelManager metamodelManager = environmentFactory.getMetamodelManager();
			Type type = metamodelManager.getASOfEcore(Type.class, eClassifier);
			if (type != null) {
				for (Constraint constraint : metamodelManager.getAllInvariants(type)) {
					if (constraint !=  null) {
						if (complementingModels != null) {
							Model containingModel = PivotUtil.getContainingModel(constraint);
							if (!complementingModels.contains(containingModel)) {
								continue;
							}
						}
						Diagnostic diagnostic = validate(constraint, object, context);
						if (diagnostic != null) {
							if (diagnostics != null) {
								diagnostics.add(diagnostic);
							}
							allOk = false;
							if (diagnostic.getSeverity() == Diagnostic.ERROR) {
								return allOk;		// Generate many warnings but only one error
							}
						}
					}
				}
			}
			return allOk;
		}

		/**
		 * Validate constraint for object using context to elaborate the validation context.
		 * Returns null for no problem or a warning/error severity diagnostic for a problem.
		 */
		public @Nullable Diagnostic validate(final @NonNull Constraint constraint, final @Nullable Object object, final @Nullable Map<Object, Object> context) {
			LanguageExpression specification = constraint.getOwnedSpecification();
			if (specification == null) {
				return null;
			}
			if (specification.getBody() == null) {	// May be null for declations of hand coded Java
				return null;
			}
//			if ((specification.getBodyExpression() == null) && (specification.getBody().size() <= 0)) {	// May be null for declations of hand coded Java
//				return null;
//			}
			final PivotMetamodelManager metamodelManager = environmentFactory.getMetamodelManager();
			ExpressionInOCL query;
			try {
				query = metamodelManager.parseSpecification(specification);
			} catch (ParserException e) {
				String message = e.getLocalizedMessage();
				return new BasicDiagnostic(Diagnostic.ERROR, EObjectValidator.DIAGNOSTIC_SOURCE, 0, message, new Object [] { object });
			}
			Variable contextVariable = query.getOwnedContext();
			if (contextVariable == null) {
				return null;
			}
//			OCLExpression bodyExpression = query.getBodyExpression();
//			if (bodyExpression == null) {	// May be null for declations of hand coded Java
//				return null;
//			}
			ModelManager oldModelManager = null;
			if (context != null) {
				oldModelManager = (ModelManager) context.get(ModelManager.class);
			}
			EvaluationVisitor evaluationVisitor = environmentFactory.createEvaluationVisitor(object, query, oldModelManager);
			if (context != null) {
				ModelManager newModelManager = evaluationVisitor.getModelManager();
				if (newModelManager != oldModelManager) {
					context.put(ModelManager.class, newModelManager);
				}
				Object monitor = context.get(Monitor.class);
				if (monitor instanceof Monitor) {
					evaluationVisitor.setMonitor((Monitor) monitor);
				}
			}
			AbstractConstraintEvaluator<Diagnostic> constraintEvaluator = new AbstractConstraintEvaluator<Diagnostic>(query)
			{
				@Override
				protected String getObjectLabel() {
					Type type = PivotUtil.getContainingType(constraint);
					Type primaryType = type != null ? metamodelManager.getPrimaryType(type) : null;
					EObject eTarget = primaryType != null ? primaryType.getESObject() : null;
					EClassifier eClassifier = eTarget instanceof EClassifier ?  (EClassifier)eTarget : null;
					return LabelUtil.getLabel(eClassifier, object, context);
				}

				@Override
				protected Diagnostic handleExceptionResult(@NonNull Throwable e) {
					String message = StringUtil.bind(PivotMessagesInternal.ValidationConstraintException_ERROR_,
						getConstraintTypeName(), getConstraintName(), getObjectLabel(), e);
					return new BasicDiagnostic(Diagnostic.ERROR, EObjectValidator.DIAGNOSTIC_SOURCE, 0, message, new Object [] { object });
				}

				@Override
				protected Diagnostic handleFailureResult(@Nullable Object result) {
					String message = getConstraintResultMessage(result);
					int severity = getConstraintResultSeverity(result);
					return new BasicDiagnostic(severity, EObjectValidator.DIAGNOSTIC_SOURCE, 0, message, new Object [] { object });
				}

				@Override
				protected Diagnostic handleInvalidExpression(@NonNull String message) {
					return new BasicDiagnostic(Diagnostic.ERROR, EObjectValidator.DIAGNOSTIC_SOURCE, 0, message, new Object [] { object });
				}

				@Override
				protected Diagnostic handleInvalidResult(@NonNull InvalidValueException e) {
					String message = StringUtil.bind(PivotMessagesInternal.ValidationResultIsInvalid_ERROR_,
						getConstraintTypeName(), getConstraintName(), getObjectLabel(), e.getLocalizedMessage());
					return new BasicDiagnostic(Diagnostic.ERROR, EObjectValidator.DIAGNOSTIC_SOURCE, 0, message, new Object [] { object });
				}

				@Override
				protected Diagnostic handleSuccessResult() {
					return null;
				}
			};
			Diagnostic diagnostic = constraintEvaluator.evaluate(evaluationVisitor);
//			if (diagnostic != null) {			// FIXME Debugging
//				constraintEvaluator.evaluate(evaluationVisitor);
//			}
			return diagnostic;
		}
	}

	/**
	 * The static instance that is installed in the EValidator.Registry.INSTANCE to compose
	 * Pivot validation with whatever other validation was installed. 
	 */
	private static final @NonNull PivotEObjectValidator INSTANCE = new PivotEObjectValidator();

	/**
	 * Install Complete OCL validation support in resourceSet for metamodelManager.
	 */
	public static @NonNull ValidationAdapter install(@NonNull ResourceSet resourceSet, @NonNull EnvironmentFactoryInternal environmentFactory) {
		ValidationAdapter validationAdapter = ValidationAdapter.findAdapter(resourceSet);
		if (validationAdapter != null) {
			if (validationAdapter.getEnvironmentFactory() != environmentFactory) {
				throw new IllegalArgumentException("Inconsistent EnvironmentFactory");
			}
		}
		else {
			validationAdapter = new ValidationAdapter(environmentFactory);
			resourceSet.eAdapters().add(validationAdapter);
		}
		return validationAdapter;
	}
	
	/**
	 * Install Pivot-defined validation support for ePackage.
	 */
	@Deprecated		// Temporary internal API preservation for Mars RC3 
	public static synchronized void install(@NonNull EPackage ePackage) {
		install(ePackage, null);
	}
	public static synchronized void install(@NonNull EPackage ePackage, @Nullable List<Model> complementingModels) {
		ComposedEValidator composedEValidator = ComposedEValidator.install(ePackage);
		if ((complementingModels == null) || complementingModels.isEmpty()) {
			composedEValidator.addChild(INSTANCE);
		}
		else {
			composedEValidator.addChild(new PivotEObjectValidator(complementingModels));
		}
	}

	/**
	 * Return the user's ResourceSet, preferably as a data element of the diagnostics, corresponding to
	 * the original validation context, else from the object else from the eClassifier.
	 */
	public static ResourceSet getResourceSet(@NonNull EClassifier eClassifier, @Nullable Object object, @Nullable DiagnosticChain diagnostics) {
		ResourceSet resourceSet = null;
		if (diagnostics instanceof BasicDiagnostic) {
			for (Object dataObject : ((BasicDiagnostic)diagnostics).getData()) {
				if (dataObject instanceof EObject) {
					Resource resource = EcoreUtil.getRootContainer((EObject) dataObject).eResource();
					if (resource != null) {
						resourceSet = resource.getResourceSet();
						if (resourceSet != null) {
							break;
						}
					}
				}
			}
		}
		if (resourceSet == null) {
			if (object instanceof EObject) {
				Resource resource = EcoreUtil.getRootContainer((EObject) object).eResource();
				if (resource != null) {
					resourceSet = resource.getResourceSet();
				}
			}
			if (resourceSet == null) {
				Resource resource = EcoreUtil.getRootContainer(eClassifier).eResource();
				if (resource != null) {
					resourceSet = resource.getResourceSet();
				}
			}
		}
		return resourceSet;
	}

	protected final @Nullable List<Model> complementingModels;
	
	@Deprecated		// Temporary internal API preservation for Mars RC3 
	protected PivotEObjectValidator() {
		this.complementingModels = null;
	}

	public PivotEObjectValidator(@Nullable List<Model> complementingModels) {
		this.complementingModels = complementingModels;
	}

	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	/**
	 * Overriden to intercept the validation of an EObject to add the additional Pivot-defined validation.
	 */
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean allOk = true;
		if ((eClass != null) && !eObject.eIsProxy()) {
			allOk &= validatePivot(eClass, eObject, diagnostics, context);
		}
		return allOk;
	}

	/**
	 * Overriden to intercept the validation of an EDataType value to add the additional Pivot-defined validation.
	 */
	@Override
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean allOk = true;
		if (eDataType != null) {
			allOk &= validatePivot(eDataType, value, diagnostics, context);
		}
		return allOk;
/*		assert value != null;
		boolean allOk = true;
		EPackage ePackage = eDataType.getEPackage();
		EValidator eValidator = eValidators.get(ePackage);
		if (eValidator != null) {
			allOk &= eValidator.validate(eDataType, value, diagnostics, context);
		}
		if ((allOk || (diagnostics != null)) && eDataType.isInstance(value)) {
			allOk &= validatePivot(eDataType, value, diagnostics, context);
		}
		return allOk; */
	}

	/**
	 * Perform the additional Pivot-defined validation.
	 */
	protected boolean validatePivot(@NonNull EClassifier eClassifier, @Nullable Object object, @Nullable DiagnosticChain diagnostics, Map<Object, Object> context) {
		ResourceSet resourceSet = getResourceSet(eClassifier, object, diagnostics);
		if (resourceSet != null) {
			ValidationAdapter validationAdapter = ValidationAdapter.findAdapter(resourceSet);
			if (validationAdapter != null) {
				boolean allOk = validationAdapter.validate(eClassifier, object, complementingModels, diagnostics, context);
				return allOk || (diagnostics != null);
			}
		}
		return true;
	}
}

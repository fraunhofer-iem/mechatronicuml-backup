package ocl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * This item property descriptor allows generating and filtering choices using an OCL annotation in the metamodel.
 * 
 * To use this:
 * <ol>
 * <li> Create an annotation with source <code>http://www.muml.org/emf/OCLFilter</code> in your .ecore file under your property.</li>
 * 
 * <li> Add a details entry with key <code>choices</code>.
 *     <ul>
 * 	   <li>The value will be parsed as OCL.</li>
 *     <li><code>self</code> refers to the object that values should be generated for.</li>
 *     <li>It should return a single or multiple possible feature values for this object and this feature.</li>
 *     <li>Make sure that values you return conform to the feature type!</li>
 *     </ul>
 * </li>
 *
 * <li> Add a details entry with key <code>filter</code>.
 *     <ul>
 *     <li>The value will be parsed as OCL and evaluated once for every possible choice generated before.</li>
 *     <li><code>self</code> refers to the value being filtered.</li>
 *     <li>It should return <code>true</code>, in order to mark the value as valid for this feature. Every other return value,
 *       including OclInvalid, marks the value as invalid and it will not appear in the list of choices.</li>
 *     </ul>
 * </li>
 * 
 * <li> Add a details entry with key <code>allowEmpty</code> and value <code>true</code> or <code>false</code>.
 *      When the value is set to <code>true</code>, the behavior of the <code>choices</code> key (see above) is changed in the following way:
 *      <ul>
 *      <li>In case the <code>choices</code> key generates an empty list of choices, a collection of all values conforming to the feature type will be generated.</li>
 *      <li>In case the <code>choices</code> key generates one or more choices, these choices will be used as normal.</li>
 *      </ul>
 *      <p>Note: Default value is <code>true</code>, in case this details entry is not specified or an invalid value was specified.</p>
 * </li>
 * 
 * </ol>
 * 
 * <p>Of course you can use either <code>choices</code> or <code>filter</code> independently.</p>
 * 
 * <p>If you don't use choices, but <code>filter</code> then a collection of all values conforming to the feature type will be
 * generated and filtered using <code>filter</code>.</p>
 * 
 * <p>If you don't use filter, but <code>choices</code>, all generated choices are directly used.</p>
 * 
 * <p>If you don't use any, a collection of all values conforming to the feature type will be generated.</p>
 * 
 * @author Ingo Budde
 *
 */
public class OCLItemPropertyDescriptor extends ItemPropertyDescriptor {

	/**
	 * The source value for the annotation to use.
	 */
	public static String FILTER_ANNOTATION = "http://www.muml.org/emf/OCLFilter";

	/**
	 * The key for the details entry to reference a feature by name.
	 */
	public static String FEATURE_KEY = "feature";
	
	/**
	 * The key for the details entry to use for choices.
	 */
	public static String CHOICES_KEY = "choices";

	/**
	 * The key for the details entry to use for filters.
	 */
	public static String FILTER_KEY = "filter";

	/**
	 * The key for the details entry to use for the allowEmpty switch.
	 */
	public static String ALLOW_EMPTY_KEY = "allowEmpty";

	/**
	 * OCL Environment to use; is created once, statically.
	 */
	public static org.eclipse.ocl.ecore.OCL OCL_ECORE = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

	/**
	 * Default constructor, calls super constructor.
	 */
	public OCLItemPropertyDescriptor(AdapterFactory adapterFactory,ResourceLocator resourceLocator,String displayName,String description,EStructuralFeature feature,boolean isSettable,Object staticImage,String category,String[] filterFlags) {
		super(adapterFactory,resourceLocator,displayName,description,feature,isSettable,false,false,staticImage,category,filterFlags);
	}
	
	/**
	 * Default constructor, calls super constructor.
	 */
	public OCLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage,String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName,description,feature,isSettable,multiLine,sortChoices, staticImage, category,filterFlags);
	}

	/**
	 * Return the choice of values for the given <code>object</code>.
	 * 
	 * @param object
	 *            The object to generate choices for.
	 *            
	 * @return The choices generated.
	 */
	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if (object instanceof EObject && feature != null) {
			EObject element = (EObject) object;
			
			// (1) Generate choices using the "choices" key:
			Collection<?> choices = null;
			String choicesOcl = findDetailValue(element.eClass(), CHOICES_KEY);
			if (!choicesOcl.isEmpty()) {
				Object result = null;
				try {
					Query<org.eclipse.emf.ecore.EClassifier, ?, ?> choicesQuery = createQuery(element.eClass(), choicesOcl);
					result = choicesQuery.evaluate(object);
				} catch (ParserException e) {
					e.printStackTrace();
				}

				if (result instanceof Collection) {
					choices = (Collection<?>) result;
				} else {
					choices = new ArrayList<Object>(Collections.singletonList(result));		
				}

				// Filter out oclInvalid
				Iterator<?> it = choices.iterator();
				while (it.hasNext()) {
					Object choice = it.next();
					if (choice == OCL_ECORE.getEnvironment().getOCLStandardLibrary().getInvalid()) {
						it.remove();
					}
				}

				try {
					checkResult(choices);
				} catch (RuntimeException e) {
					e.printStackTrace();
					choices = Collections.emptyList();
				}

				// At this point choices is never null.
			}
			
			// Generate all choices of correct type
			if (choices == null || (choices.isEmpty() && "true".equalsIgnoreCase(findDetailValue(element.eClass(), ALLOW_EMPTY_KEY)))) {
				choices = super.getChoiceOfValues(object);
			}

			// (2) Filter generated choices using the "filter" key:
			String filterOcl = findDetailValue(element.eClass(), FILTER_KEY);
			if (!filterOcl.isEmpty()) {
				try {
					Query<org.eclipse.emf.ecore.EClassifier, ?, ?> filterQuery = createQuery(element.eClass(), filterOcl);
					for (Object choice : new ArrayList<Object>(choices)) {
						if (!Boolean.TRUE.equals(filterQuery.evaluate(choice))) {
							choices.remove(choice);
						}
					}
				} catch (ParserException e) {
					e.printStackTrace();
				}
			}

			return choices;
		}
	
		return super.getChoiceOfValues(object);
	}

	protected String findDetailValue(EClass eClass, String key) {
		String value = getDetailValue(feature, key);
		if (value != null) {
			return value;
		}
		if (feature.getName().equals(getDetailValue(eClass, FEATURE_KEY))) {
			value = getDetailValue(eClass, key);
		}
		if (value != null) {
			return value;
		}
		for (EClass eSuperClass : eClass.getEAllSuperTypes()) {
			if (feature.getName().equals(getDetailValue(eSuperClass, FEATURE_KEY))) {
				value = getDetailValue(eSuperClass, key);
			}
			if (value != null) {
				return value;
			}
		}
		return "";
	}

	protected String getDetailValue(EModelElement modelElement, String key) {
		EAnnotation annotation = modelElement.getEAnnotation(FILTER_ANNOTATION);
		if (annotation != null && annotation.getDetails().containsKey(key)) {
			return annotation.getDetails().get(key);
		}
		return null;
	}

	/**
	 * Parse OCL expression and create Query.
	 * 
	 * @param context
	 *            Context classifier for <code>self</code>.
	 * @param ocl
	 *            OCL expression that will be parsed.
	 * @return Query that can be evaluated.
	 * 
	 * @throws ParserException
	 *             If the OCL expression contains errors.
	 */
	protected Query<org.eclipse.emf.ecore.EClassifier, ?, ?> createQuery(EClassifier context, String ocl) throws ParserException {
		Helper helper = OCL_ECORE.createOCLHelper();
		helper.setAttributeContext(context, feature);
		ParsingOptions.setOption(helper.getEnvironment(),
			    ParsingOptions.implicitRootClass(helper.getEnvironment()),
			    EcorePackage.Literals.EOBJECT);
		OCLExpression oclExpression = helper.createQuery(ocl);
		if (oclExpression != null) {
			return OCL_ECORE.createQuery(oclExpression);
		}
		return null;
	}

	/**
	 * Checks the results of the <code>choices</code> expression; makes sure it conforms with feature type.
	 * 
	 * @param choices Choices to check
	 */
	protected void checkResult(Collection<?> choices) {
		for (Object object : choices) {
			if (!feature.getEType().isInstance(object)) {
				throw new RuntimeException("[OCL Choices] Invalid choice returned for " + feature.getEContainingClass().getName() + "." + feature.getName() + " : " + feature.getEType().getName() + ". Element was: " + object.toString());
			}
		}
	}
	
}

package ocl;

import java.util.ArrayList;
import java.util.Collection;

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

 * <li> Add a details entry with key <code>filter</code>.
 *     <ul>
 *     <li>The value will be parsed as OCL.</li>
 *     <li><code>self</code> refers to the element for which the reference is being filtered.</li>
 *     </li>
 * </li>
 * 
 * Then generate model and edit code!
 * 
 * </ol>
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
	 * The key for the details entry to use for filters.
	 */
	public static String FILTER_KEY = "filter";

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
			
			String filterOcl = findDetailValue(element.eClass(), FILTER_KEY);
			if (!filterOcl.isEmpty()) {
				try {
					Query<org.eclipse.emf.ecore.EClassifier, ?, ?> filterQuery = createQuery(element.eClass(), filterOcl);
					Object choice = filterQuery.evaluate(object);
					Collection<Object> choices = new ArrayList<Object>();
					choices.add(null);
					if (choice instanceof Collection) {
						for (Object o : (Collection<?>) choice) {
							if (o != null) {
								choices.add(o);
							}
						}
					} else if (choice != null) {
						choices.add(choice);
					}
					checkResult(choices);
					return choices;
					
				} catch (ParserException e) {
					e.printStackTrace();
				}
			}
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
	protected Query<org.eclipse.emf.ecore.EClassifier, ?, ?> createQuery(EClassifier context, String oclText) throws ParserException {
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	
		Helper helper = ocl.createOCLHelper();
		helper.setAttributeContext(context, feature);
		ParsingOptions.setOption(helper.getEnvironment(),
			    ParsingOptions.implicitRootClass(helper.getEnvironment()),
			    EcorePackage.Literals.EOBJECT);

		OCLExpression oclExpression = helper.createQuery(oclText);
		if (oclExpression != null) {
			return ocl.createQuery(oclExpression);
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
			if (object != null && !feature.getEType().isInstance(object)) {
				throw new RuntimeException("[OCL Choices] Invalid choice returned for " + feature.getEContainingClass().getName() + "." + feature.getName() + " : " + feature.getEType().getName() + ". Element was: " + object.toString());
			}
		}
	}
	
}

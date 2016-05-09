package org.muml.core.modelinstance.categories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.ModelInstancePlugin;
import org.muml.core.modelinstance.ModelinstanceFactory;
import org.muml.core.modelinstance.RootNode;

public class ModelElementCategoryRegistry {

    private static final String EXTENSION_POINT_ID = "org.muml.core.modelelementcategory";

    // struct-like datatype that stores two Strings describing a class
    private class QualifiedClassName {
        public QualifiedClassName(String packageNsURI, String className) {
            this.packageNsURI = packageNsURI;
            this.className = className;
        }

        public String packageNsURI;
        public String className;
    }

    /**
     * Creates this ModelElementCategoryRegistry and initializes it, if initialize is <code>true</code>.
     *
     * @param initialize
     *            <code>true</code> indicates that the extension point should be read and fields should be initialized.
     */
    public ModelElementCategoryRegistry(boolean initialize) {
        if (initialize) {
            // call the getters that lazily create fields (and read the
            // extension point)
            getAllowedClasses();
            getCategoryNames();
        }
    }

    /**
     * The lazily created map that stores, which kind of objects are allowed in a certain ModelElementCategory
     * identified by its key-String.
     *
     * It is lazily created by getAllowedClasses().
     */
    private Map<String, Collection<QualifiedClassName>> allowedClasses;

    /**
     * A map that stores a name for each ModelElementCategory identified by its key.
     *
     * It is lazily created by getCategoryNames().
     */
    private Map<String, String> categoryNames;

    /**
     * Gets (and lazily creates) the map of allowed classes for a certain ModelElementCategory.
     *
     * @return The map.
     */
    private Map<String, Collection<QualifiedClassName>> getAllowedClasses() {
        if (allowedClasses == null) {
            allowedClasses = new HashMap<String, Collection<QualifiedClassName>>();
            IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
            for (IConfigurationElement configElement : config) {
                String key = configElement.getAttribute("key");
                IConfigurationElement[] children = configElement.getChildren("child");
                for (IConfigurationElement child : children) {
                    String extensionPackage = child.getAttribute("packageNsUri");
                    String extensionClass = child.getAttribute("class");
                    QualifiedClassName qualifiedClassName = new QualifiedClassName(extensionPackage, extensionClass);
                    addAllowedClass(key, qualifiedClassName);

                }
            }
        }
        return allowedClasses;
    }

    /**
     * Gets the set of valid category keys as copy.
     */
    public Set<String> getAllowedKeys() {
        return new HashSet<String>(getAllowedClasses().keySet());
    }

    /**
     * Auxiliary method that adds a QualifiedClassName to the list of allowed classes for a given key.
     *
     * This method assumes that "allowedClasses" is not null.
     *
     * @param key
     *            The key to add the class name to.
     * @param qualifiedClassName
     *            The class name to add.
     */
    private void addAllowedClass(String key, QualifiedClassName qualifiedClassName) {
        Collection<QualifiedClassName> qualifiedClassNames = allowedClasses.get(key);
        if (qualifiedClassNames == null) {
            qualifiedClassNames = new ArrayList<QualifiedClassName>();
            allowedClasses.put(key, qualifiedClassNames);
        }
        qualifiedClassNames.add(qualifiedClassName);
    }

    /**
     * Auxiliary method that checks, if the given type is the same type or a subtype or the one specified by packageName
     * and className.
     *
     * @param type
     *            The type which should be checked.
     * @param packageNsURI
     *            The package name to compare with.
     * @param className
     *            The className to compare with.
     * @return true, if object is of type "className".
     */
    private boolean hasType(EClass type, QualifiedClassName qualifiedClassName) {
        EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(qualifiedClassName.packageNsURI);
        EClassifier classifier = ePackage.getEClassifier(qualifiedClassName.className);
        if (classifier instanceof EClass) {
            return ((EClass) classifier).isSuperTypeOf(type);
        }
        return false;
    }

    /**
     * Finds out, if a ModelElementCategory specified by its categoryKey is allowed to contain the given modelElement.
     *
     * @param categoryKey
     *            The key that identifies the ModelElementCategory.
     * @param modelElement
     *            The modelElement to test.
     * @return <code>true</code>, if the modelElement is allowed to be placed into a ModelElementCategory identified by
     *         categoryKey.
     */
    public boolean isValidCategory(String categoryKey, EObject modelElement) {
        return isValidEClass(categoryKey, modelElement.eClass());
    }

    /**
     * Finds out, if a ModelElementCategory specified by its categoryKey is allowed to contain objects of the given
     * EClass type.
     *
     * @param categoryKey
     *            The key that identifies the ModelElementCategory.
     * @param type
     *            The EClass type to test.
     * @return <code>true</code>, if objects of the EClass is allowed to be placed into a ModelElementCategory
     *         identified by categoryKey.
     */
    public boolean isValidEClass(String categoryKey, EClass type) {
        if (categoryKey == null || type == null) {
            return false;
        }
        Collection<QualifiedClassName> qualifiedClassNames = getAllowedClasses().get(categoryKey);
        if (qualifiedClassNames != null) {
            for (QualifiedClassName qualifiedClassName : qualifiedClassNames) {
                if (hasType(type, qualifiedClassName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Gets (and lazily creates) the map that stores a name for each ModelElementCategory identified by its key.
     *
     * @return The map; never <code>null</code>.
     */
    private Map<String, String> getCategoryNames() {
        if (categoryNames == null) {
            categoryNames = new HashMap<String, String>();
            IConfigurationElement[] config = RegistryFactory.getRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID);
            for (IConfigurationElement configElement : config) {
                String categoryKey = configElement.getAttribute("key");
                String categoryName = configElement.getAttribute("name");
                categoryNames.put(categoryKey, categoryName);
            }
        }
        return categoryNames;
    }

    /**
     * Gets the ModelElementCategory within the given RootNode that has the given categoryKey, or creates one within the
     * RootNode, if none exists.
     *
     * @param rootNode
     *            The RootNode that contains the ModelElementCategory.
     * @param categoryKey
     *            The key of the ModelElementCategory.
     * @return The found or created ModelElementCategory, never null.
     */
    public ModelElementCategory getModelElementCategory(RootNode rootNode, String categoryKey) {
        return getModelElementCategory(rootNode, categoryKey, true);
    }

    /**
     * Gets the ModelElementCategory within the given RootNode that has the given categoryKey, or creates one within the
     * RootNode, if none exists and <code>safe</code> parameter is true.
     *
     * @param rootNode
     *            The RootNode that contains the ModelElementCategory.
     * @param categoryKey
     *            The key of the ModelElementCategory.
     * @param safe
     *            If it is <code>true</code>, then create ModelElementCategory if it was not found.
     * @return The ModelElementCategory if found or created (see @param safe), else <code>null</code>.
     */
    public ModelElementCategory getModelElementCategory(RootNode rootNode, String categoryKey, boolean safe) {
        ModelElementCategory result = null;
        if (categoryKey != null) {
            for (ModelElementCategory category : rootNode.getCategories()) {
                if (categoryKey.equals(category.getKey())) {
                    result = category;
                    break;
                }
            }
        }

        if (result == null && safe) {
            result = ModelinstanceFactory.eINSTANCE.createModelElementCategory();
            String categoryName = null;
            ModelElementCategoryRegistry registry = ModelInstancePlugin.getInstance().getModelElementCategoryRegistry();
            if (registry != null) {
                categoryName = registry.getCategoryNames().get(categoryKey);
            }
            result.setName(categoryName);
            result.setKey(categoryKey);
            rootNode.getCategories().add(result);
        }

        return result;
    }

    /**
     * Gets the category name for the ModelElementCategory identified by the given categoryKey.
     *
     * @param categoryKey
     *            The categoryKey to get the name for.
     * @return The name for the ModelElementCategory.
     */
    public String getCategoryName(String categoryKey) {
        return getCategoryNames().get(categoryKey);
    }

}

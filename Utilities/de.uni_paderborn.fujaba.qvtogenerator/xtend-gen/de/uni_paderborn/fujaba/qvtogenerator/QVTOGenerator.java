package de.uni_paderborn.fujaba.qvtogenerator;

import com.google.common.base.Objects;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class QVTOGenerator implements IGenerator {
  private HashSet<EPackage> packages = new HashSet<EPackage>();
  
  private HashSet<Resource> models = new HashSet<Resource>();
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    EObject curObject = _contents.get(0);
    Resource _loadModel = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/modelinstance.ecore");
    this.models.add(_loadModel);
    Resource _loadModel_1 = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/muml.ecore");
    this.models.add(_loadModel_1);
    Resource _loadModel_2 = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/core.ecore");
    this.models.add(_loadModel_2);
    Resource _loadModel_3 = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/Ecore.ecore");
    this.models.add(_loadModel_3);
    Resource _loadModel_4 = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/actionlanguage.ecore");
    this.models.add(_loadModel_4);
    Resource _loadModel_5 = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/verificationExtension.ecore");
    this.models.add(_loadModel_5);
    Resource _loadModel_6 = this.loadModel("/de.uni_paderborn.fujaba.qvtogenerator/model2/Mtctl.ecore");
    this.models.add(_loadModel_6);
    this.collectSubPackages(this.models);
    if ((curObject instanceof EPackage)) {
      boolean _matched = false;
      if (!_matched) {
        if (curObject instanceof EPackage) {
          String _name = ((EPackage)curObject).getName();
          boolean _equals = Objects.equal(_name, "muml");
          if (_equals) {
            _matched=true;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("MUML2MUML.qvto");
            StringConcatenation _builder_1 = new StringConcatenation();
            String _initialize = this.initialize(curObject);
            _builder_1.append(_initialize, "");
            fsa.generateFile(_builder.toString(), _builder_1);
          }
        }
      }
      if (!_matched) {
        return;
      }
    }
  }
  
  protected String _initialize(final EPackage modelInstancePackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("library MUML2MUML;");
    _builder.newLine();
    String _createPackageImport = this.createPackageImport();
    _builder.append(_createPackageImport, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final EPackage p : this.packages) {
        _builder.append("\t");
        String _createMappingsForEClasses = this.createMappingsForEClasses(p);
        _builder.append(_createMappingsForEClasses, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _initialize(final EObject dummy) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public void collectSubPackages(final HashSet<Resource> models) {
    HashSet<EPackage> packages = new HashSet<EPackage>();
    for (final Resource curModel : models) {
      EList<EObject> _contents = curModel.getContents();
      for (final EObject curContent : _contents) {
        boolean _matched = false;
        if (!_matched) {
          if (curContent instanceof EPackage) {
            if (Objects.equal(curContent, ((EPackage)curContent))) {
              _matched=true;
              this.addToPackages(curContent);
            }
          }
        }
        if (!_matched) {
          packages = packages;
        }
      }
    }
  }
  
  public String createPackageImport() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final EPackage p : this.packages) {
        _builder.append("modeltype ");
        String _nsPrefix = p.getNsPrefix();
        _builder.append(_nsPrefix, "");
        _builder.append(" uses \'");
        String _nsURI = p.getNsURI();
        _builder.append(_nsURI, "");
        _builder.append("\';");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected void _addToPackages(final EPackage p) {
    this.packages.add(p);
    EList<EPackage> _eSubpackages = p.getESubpackages();
    for (final EPackage subPackage : _eSubpackages) {
      this.addToPackages(subPackage);
    }
  }
  
  protected void _addToPackages(final EObject object) {
  }
  
  public String createMappingsForEClasses(final EPackage ePackage) {
    this.packages.add(ePackage);
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    for (final EClassifier i : _eClassifiers) {
      boolean _matched = false;
      if (!_matched) {
        if (i instanceof EClass) {
          if (Objects.equal(i, ((EClass)i))) {
            _matched=true;
            this.createMapping(i);
          }
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    {
      EList<EClassifier> _eClassifiers_1 = ePackage.getEClassifiers();
      for(final EClassifier i_1 : _eClassifiers_1) {
        _builder.newLineIfNotEmpty();
        CharSequence _createMapping = this.createMapping(i_1);
        _builder.append(_createMapping, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected CharSequence _createMapping(final EClass eClassi) {
    boolean _isAbstract = eClassi.isAbstract();
    boolean _not = (!_isAbstract);
    if (_not) {
      CharSequence _createDisjunct = this.createDisjunct(eClassi);
      boolean _notEquals = (!Objects.equal(_createDisjunct, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("mapping ");
        EPackage _ePackage = eClassi.getEPackage();
        CharSequence _packagePrefix = this.getPackagePrefix(_ePackage);
        _builder.append(_packagePrefix, "");
        String _name = eClassi.getName();
        _builder.append(_name, "");
        _builder.append(" :: ");
        String _name_1 = eClassi.getName();
        _builder.append(_name_1, "");
        _builder.append("2");
        String _name_2 = eClassi.getName();
        _builder.append(_name_2, "");
        _builder.append("() : ");
        EPackage _ePackage_1 = eClassi.getEPackage();
        CharSequence _packagePrefix_1 = this.getPackagePrefix(_ePackage_1);
        _builder.append(_packagePrefix_1, "");
        String _name_3 = eClassi.getName();
        _builder.append(_name_3, "");
        _builder.append(" ");
        CharSequence _createDisjunct_1 = this.createDisjunct(eClassi);
        _builder.append(_createDisjunct_1, "");
        _builder.append(", ");
        EPackage _ePackage_2 = eClassi.getEPackage();
        CharSequence _packagePrefix_2 = this.getPackagePrefix(_ePackage_2);
        _builder.append(_packagePrefix_2, "");
        String _name_4 = eClassi.getName();
        _builder.append(_name_4, "");
        _builder.append("::normal");
        String _name_5 = eClassi.getName();
        _builder.append(_name_5, "");
        _builder.append("2");
        String _name_6 = eClassi.getName();
        _builder.append(_name_6, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t \t\t\t");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("mapping ");
        EPackage _ePackage_3 = eClassi.getEPackage();
        CharSequence _packagePrefix_3 = this.getPackagePrefix(_ePackage_3);
        _builder.append(_packagePrefix_3, " ");
        String _name_7 = eClassi.getName();
        _builder.append(_name_7, " ");
        _builder.append(" :: normal");
        String _name_8 = eClassi.getName();
        _builder.append(_name_8, " ");
        _builder.append("2");
        String _name_9 = eClassi.getName();
        _builder.append(_name_9, " ");
        _builder.append("() : ");
        EPackage _ePackage_4 = eClassi.getEPackage();
        CharSequence _packagePrefix_4 = this.getPackagePrefix(_ePackage_4);
        _builder.append(_packagePrefix_4, " ");
        String _name_10 = eClassi.getName();
        _builder.append(_name_10, " ");
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        String _createReferences = this.createReferences(eClassi);
        _builder.append(_createReferences, " ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("}");
        _builder.newLine();
        _builder.append(" \t \t\t\t");
        _builder.newLine();
        return _builder.toString();
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("mapping ");
      EPackage _ePackage_5 = eClassi.getEPackage();
      CharSequence _packagePrefix_5 = this.getPackagePrefix(_ePackage_5);
      _builder_1.append(_packagePrefix_5, "");
      String _name_11 = eClassi.getName();
      _builder_1.append(_name_11, "");
      _builder_1.append(" :: ");
      String _name_12 = eClassi.getName();
      _builder_1.append(_name_12, "");
      _builder_1.append("2");
      String _name_13 = eClassi.getName();
      _builder_1.append(_name_13, "");
      _builder_1.append("() : ");
      EPackage _ePackage_6 = eClassi.getEPackage();
      CharSequence _packagePrefix_6 = this.getPackagePrefix(_ePackage_6);
      _builder_1.append(_packagePrefix_6, "");
      String _name_14 = eClassi.getName();
      _builder_1.append(_name_14, "");
      _builder_1.append("{");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    \t");
      String _createReferences_1 = this.createReferences(eClassi);
      _builder_1.append(_createReferences_1, "    \t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("   \t\t ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("   \t\t ");
      _builder_1.newLine();
      return _builder_1.toString();
    }
    CharSequence _createDisjunct_2 = this.createDisjunct(eClassi);
    boolean _notEquals_1 = (!Objects.equal(_createDisjunct_2, null));
    if (_notEquals_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("mapping ");
      EPackage _ePackage_7 = eClassi.getEPackage();
      CharSequence _packagePrefix_7 = this.getPackagePrefix(_ePackage_7);
      _builder_2.append(_packagePrefix_7, "");
      String _name_15 = eClassi.getName();
      _builder_2.append(_name_15, "");
      _builder_2.append(" :: ");
      String _name_16 = eClassi.getName();
      _builder_2.append(_name_16, "");
      _builder_2.append("2");
      String _name_17 = eClassi.getName();
      _builder_2.append(_name_17, "");
      _builder_2.append("() : ");
      EPackage _ePackage_8 = eClassi.getEPackage();
      CharSequence _packagePrefix_8 = this.getPackagePrefix(_ePackage_8);
      _builder_2.append(_packagePrefix_8, "");
      String _name_18 = eClassi.getName();
      _builder_2.append(_name_18, "");
      _builder_2.append(" ");
      CharSequence _createDisjunct_3 = this.createDisjunct(eClassi);
      _builder_2.append(_createDisjunct_3, "");
      _builder_2.append(";");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("      \t");
      _builder_2.newLine();
      return _builder_2.toString();
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      return _builder_3.toString();
    }
  }
  
  protected CharSequence _createMapping(final EClassifier eClassi) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected String _createDisjunct(final EClass abstractClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("disjuncts");
    _builder.newLine();
    {
      HashSet<EClassifier> _extendingTypes = this.getExtendingTypes(abstractClass);
      for(final EClassifier i : _extendingTypes) {
        {
          Boolean _hasNonAbstractExtendingClasses = this.hasNonAbstractExtendingClasses(i);
          if ((_hasNonAbstractExtendingClasses).booleanValue()) {
            _builder.append("\t\t");
            CharSequence _createSingleDisjunct = this.createSingleDisjunct(i);
            _builder.append(_createSingleDisjunct, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    String s = _builder.toString();
    int _lastIndexOf = s.lastIndexOf(",");
    boolean _notEquals = (_lastIndexOf != (-1));
    if (_notEquals) {
      int _lastIndexOf_1 = s.lastIndexOf(",");
      String s1 = s.substring(0, _lastIndexOf_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(s1, "");
      return _builder_1.toString();
    }
    return null;
  }
  
  protected CharSequence _createDisjunct(final Object dummy) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected String _createReferences(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EAttribute> _eAllAttributes = eClass.getEAllAttributes();
      for(final EAttribute i : _eAllAttributes) {
        {
          boolean _isDerived = i.isDerived();
          boolean _not = (!_isDerived);
          if (_not) {
            _builder.append("_");
            String _name = i.getName();
            _builder.append(_name, "");
            _builder.append(" := self._");
            String _name_1 = i.getName();
            _builder.append(_name_1, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<EReference> _eAllReferences = eClass.getEAllReferences();
      for(final EReference i_1 : _eAllReferences) {
        {
          boolean _and = false;
          boolean _and_1 = false;
          boolean _isDerived_1 = i_1.isDerived();
          boolean _not_1 = (!_isDerived_1);
          if (!_not_1) {
            _and_1 = false;
          } else {
            boolean _isChangeable = i_1.isChangeable();
            _and_1 = _isChangeable;
          }
          if (!_and_1) {
            _and = false;
          } else {
            EClassifier _eType = i_1.getEType();
            Boolean _hasNonAbstractExtendingClasses = this.hasNonAbstractExtendingClasses(_eType);
            _and = (_hasNonAbstractExtendingClasses).booleanValue();
          }
          if (_and) {
            _builder.append("_");
            String _name_2 = i_1.getName();
            _builder.append(_name_2, "");
            _builder.append(" := self._");
            String _name_3 = i_1.getName();
            _builder.append(_name_3, "");
            _builder.append(".map ");
            EClassifier _eType_1 = i_1.getEType();
            String _name_4 = _eType_1.getName();
            _builder.append(_name_4, "");
            _builder.append("2");
            EClassifier _eType_2 = i_1.getEType();
            String _name_5 = _eType_2.getName();
            _builder.append(_name_5, "");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _createReferences(final EClassifier eClassi) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _createSingleDisjunct(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = eClass.getEPackage();
    CharSequence _packagePrefix = this.getPackagePrefix(_ePackage);
    _builder.append(_packagePrefix, "");
    String _name = eClass.getName();
    _builder.append(_name, "");
    _builder.append("::");
    String _name_1 = eClass.getName();
    _builder.append(_name_1, "");
    _builder.append("2");
    String _name_2 = eClass.getName();
    _builder.append(_name_2, "");
    _builder.append(",");
    return _builder.toString();
  }
  
  protected CharSequence _createSingleDisjunct(final EClassifier eClass) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public HashSet<EClassifier> getExtendingTypes(final EClassifier superType) {
    boolean _matched = false;
    if (!_matched) {
      if (superType instanceof EClass) {
        if (Objects.equal(superType, ((EClass)superType))) {
          _matched=true;
          HashSet<EClassifier> extendingTypes = new HashSet<EClassifier>();
          for (final EPackage i : this.packages) {
            EList<EClassifier> _eClassifiers = i.getEClassifiers();
            for (final EClassifier k : _eClassifiers) {
              boolean _and = false;
              boolean _notEquals = (!Objects.equal(k, superType));
              if (!_notEquals) {
                _and = false;
              } else {
                Boolean _isSuperTypeOfClassifier = this.isSuperTypeOfClassifier(((EClass)superType), k);
                _and = (_isSuperTypeOfClassifier).booleanValue();
              }
              if (_and) {
                extendingTypes.add(k);
              }
            }
          }
          return extendingTypes;
        }
      }
    }
    return null;
  }
  
  public Boolean hasNonAbstractExtendingClasses(final EClassifier superType) {
    boolean _matched = false;
    if (!_matched) {
      if (superType instanceof EClass) {
        if (Objects.equal(superType, ((EClass)superType))) {
          _matched=true;
          boolean _isAbstract = ((EClass)superType).isAbstract();
          boolean _not = (!_isAbstract);
          if (_not) {
            return Boolean.valueOf(true);
          }
        }
      }
    }
    HashSet<EClassifier> _extendingTypes = this.getExtendingTypes(superType);
    for (final EClassifier curType : _extendingTypes) {
      boolean _matched_1 = false;
      if (!_matched_1) {
        if (curType instanceof EClass) {
          if (Objects.equal(curType, ((EClass)curType))) {
            _matched_1=true;
            boolean _isAbstract = ((EClass)curType).isAbstract();
            boolean _not = (!_isAbstract);
            if (_not) {
              return Boolean.valueOf(true);
            } else {
              HashSet<EClassifier> _extendingTypes_1 = this.getExtendingTypes(curType);
              for (final EClassifier nextType : _extendingTypes_1) {
                Boolean _hasNonAbstractExtendingClasses = this.hasNonAbstractExtendingClasses(nextType);
                if ((_hasNonAbstractExtendingClasses).booleanValue()) {
                  return Boolean.valueOf(true);
                }
              }
            }
            return Boolean.valueOf(false);
          }
        }
      }
    }
    return Boolean.valueOf(false);
  }
  
  protected Boolean _isSuperTypeOfClassifier(final EClass superType, final EClass type) {
    EList<EClass> _eSuperTypes = type.getESuperTypes();
    for (final EClass sT : _eSuperTypes) {
      boolean _and = false;
      String _name = sT.getName();
      String _name_1 = superType.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (!_equals) {
        _and = false;
      } else {
        EPackage _ePackage = sT.getEPackage();
        CharSequence _packagePrefix = this.getPackagePrefix(_ePackage);
        String _string = _packagePrefix.toString();
        EPackage _ePackage_1 = superType.getEPackage();
        CharSequence _packagePrefix_1 = this.getPackagePrefix(_ePackage_1);
        String _string_1 = _packagePrefix_1.toString();
        boolean _equals_1 = _string.equals(_string_1);
        _and = _equals_1;
      }
      if (_and) {
        return Boolean.valueOf(true);
      }
    }
    return Boolean.valueOf(false);
  }
  
  protected Boolean _isSuperTypeOfClassifier(final EClass superType, final EClassifier type) {
    return Boolean.valueOf(false);
  }
  
  public Resource loadModel(final String path) {
    final String projectPath = System.getProperty("user.dir");
    final String absoluteModelPath = projectPath.replace("\\de.uni_paderborn.fujaba.qvtogenerator", path);
    final URI modelURI = URI.createFileURI(absoluteModelPath);
    Class<? extends QVTOGenerator> _class = this.getClass();
    ProtectionDomain _protectionDomain = _class.getProtectionDomain();
    CodeSource _codeSource = _protectionDomain.getCodeSource();
    final URL uselocation = _codeSource.getLocation();
    final ResourceSetImpl resSet = new ResourceSetImpl();
    URI _trimFragment = modelURI.trimFragment();
    final Resource resource = resSet.getResource(_trimFragment, true);
    return resource;
  }
  
  public CharSequence getPackagePrefix(final EPackage ePackage) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EPackage _eSuperPackage = ePackage.getESuperPackage();
      boolean _notEquals = (!Objects.equal(_eSuperPackage, null));
      if (_notEquals) {
        EPackage _eSuperPackage_1 = ePackage.getESuperPackage();
        Object _packagePrefix = this.getPackagePrefix(_eSuperPackage_1);
        _builder.append(_packagePrefix, "");
      }
    }
    {
      String _name = ePackage.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, ""));
      if (_notEquals_1) {
        String _name_1 = ePackage.getName();
        _builder.append(_name_1, "");
        _builder.append("::");
      }
    }
    return _builder;
  }
  
  public String initialize(final EObject modelInstancePackage) {
    if (modelInstancePackage instanceof EPackage) {
      return _initialize((EPackage)modelInstancePackage);
    } else if (modelInstancePackage != null) {
      return _initialize(modelInstancePackage);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(modelInstancePackage).toString());
    }
  }
  
  public void addToPackages(final EObject p) {
    if (p instanceof EPackage) {
      _addToPackages((EPackage)p);
      return;
    } else if (p != null) {
      _addToPackages(p);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
  
  public CharSequence createMapping(final EClassifier eClassi) {
    if (eClassi instanceof EClass) {
      return _createMapping((EClass)eClassi);
    } else if (eClassi != null) {
      return _createMapping(eClassi);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eClassi).toString());
    }
  }
  
  public CharSequence createDisjunct(final Object abstractClass) {
    if (abstractClass instanceof EClass) {
      return _createDisjunct((EClass)abstractClass);
    } else if (abstractClass != null) {
      return _createDisjunct(abstractClass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(abstractClass).toString());
    }
  }
  
  public String createReferences(final EClassifier eClass) {
    if (eClass instanceof EClass) {
      return _createReferences((EClass)eClass);
    } else if (eClass != null) {
      return _createReferences(eClass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eClass).toString());
    }
  }
  
  public CharSequence createSingleDisjunct(final EClassifier eClass) {
    if (eClass instanceof EClass) {
      return _createSingleDisjunct((EClass)eClass);
    } else if (eClass != null) {
      return _createSingleDisjunct(eClass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eClass).toString());
    }
  }
  
  public Boolean isSuperTypeOfClassifier(final EClass superType, final EClassifier type) {
    if (type instanceof EClass) {
      return _isSuperTypeOfClassifier(superType, (EClass)type);
    } else if (type != null) {
      return _isSuperTypeOfClassifier(superType, type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(superType, type).toString());
    }
  }
}

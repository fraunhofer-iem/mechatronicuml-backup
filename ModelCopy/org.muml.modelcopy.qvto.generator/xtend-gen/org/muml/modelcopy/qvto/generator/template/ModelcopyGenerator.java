package org.muml.modelcopy.qvto.generator.template;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelcopyGenerator {
  public CharSequence fqn(final EClass it) {
    StringConcatenation _builder = new StringConcatenation();
    EPackage _ePackage = it.getEPackage();
    String _nsPrefix = _ePackage.getNsPrefix();
    _builder.append(_nsPrefix, "");
    _builder.append("::");
    String _name = it.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence mapping(final EClass it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("2");
    String _name_1 = it.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  public CharSequence packageImport(final EPackage it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("modeltype ");
    String _nsPrefix = it.getNsPrefix();
    _builder.append(_nsPrefix, "");
    _builder.append(" uses ");
    String _nsPrefix_1 = it.getNsPrefix();
    _builder.append(_nsPrefix_1, "");
    _builder.append("(\'");
    String _nsURI = it.getNsURI();
    _builder.append(_nsURI, "");
    _builder.append("\');");
    return _builder;
  }
  
  public CharSequence createGenerator(final EPackage it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("library ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("2");
    String _name_1 = it.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    EList<EPackage> _eSubpackages = it.getESubpackages();
    final Iterable<EPackage> directPackages = Iterables.<EPackage>concat(Collections.<EPackage>unmodifiableList(CollectionLiterals.<EPackage>newArrayList(it)), _eSubpackages);
    _builder.newLineIfNotEmpty();
    final Function1<EPackage, EList<EClassifier>> _function = new Function1<EPackage, EList<EClassifier>>() {
      @Override
      public EList<EClassifier> apply(final EPackage it) {
        return it.getEClassifiers();
      }
    };
    Iterable<EList<EClassifier>> _map = IterableExtensions.<EPackage, EList<EClassifier>>map(directPackages, _function);
    Iterable<EClassifier> _flatten = Iterables.<EClassifier>concat(_map);
    Iterable<EClass> _filter = Iterables.<EClass>filter(_flatten, EClass.class);
    final Function1<EClass, EList<EReference>> _function_1 = new Function1<EClass, EList<EReference>>() {
      @Override
      public EList<EReference> apply(final EClass it) {
        return it.getEReferences();
      }
    };
    Iterable<EList<EReference>> _map_1 = IterableExtensions.<EClass, EList<EReference>>map(_filter, _function_1);
    Iterable<EReference> _flatten_1 = Iterables.<EReference>concat(_map_1);
    final Function1<EReference, EClassifier> _function_2 = new Function1<EReference, EClassifier>() {
      @Override
      public EClassifier apply(final EReference it) {
        return it.getEType();
      }
    };
    Iterable<EClassifier> _map_2 = IterableExtensions.<EReference, EClassifier>map(_flatten_1, _function_2);
    final Function1<EClassifier, EPackage> _function_3 = new Function1<EClassifier, EPackage>() {
      @Override
      public EPackage apply(final EClassifier it) {
        return it.getEPackage();
      }
    };
    Iterable<EPackage> _map_3 = IterableExtensions.<EClassifier, EPackage>map(_map_2, _function_3);
    final Iterable<EPackage> additionalPackages = IterableExtensions.<EPackage>filterNull(_map_3);
    _builder.newLineIfNotEmpty();
    {
      Iterable<EPackage> _plus = Iterables.<EPackage>concat(directPackages, additionalPackages);
      Set<EPackage> _set = IterableExtensions.<EPackage>toSet(_plus);
      for(final EPackage it_1 : _set) {
        CharSequence _packageImport = this.packageImport(it_1);
        _builder.append(_packageImport, "");
        _builder.newLineIfNotEmpty();
      }
    }
    String _createMappings = this.createMappings(it);
    _builder.append(_createMappings, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String createMappings(final EPackage it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EClassifier> _eClassifiers = it.getEClassifiers();
      Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
      for(final EClass it_1 : _filter) {
        CharSequence _createMapping = this.createMapping(it_1);
        _builder.append(_createMapping, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EPackage> _eSubpackages = it.getESubpackages();
      for(final EPackage it_2 : _eSubpackages) {
        String _createMappings = this.createMappings(it_2);
        _builder.append(_createMappings, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public CharSequence createMapping(final EClass it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mapping ");
    CharSequence _fqn = this.fqn(it);
    _builder.append(_fqn, "");
    _builder.append("::");
    CharSequence _mapping = this.mapping(it);
    _builder.append(_mapping, "");
    _builder.append("() : ");
    CharSequence _fqn_1 = this.fqn(it);
    _builder.append(_fqn_1, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<EAttribute> _eAttributes = it.getEAttributes();
      for(final EAttribute it_1 : _eAttributes) {
        _builder.append("\t");
        _builder.append("_");
        String _name = it_1.getName();
        _builder.append(_name, "\t");
        _builder.append(" := self._");
        String _name_1 = it_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EReference> _eReferences = it.getEReferences();
      for(final EReference it_2 : _eReferences) {
        _builder.append("\t");
        _builder.append("_");
        String _name_2 = it_2.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" := self._");
        String _name_3 = it_2.getName();
        _builder.append(_name_3, "\t");
        _builder.append(".map ");
        EClassifier _eType = it_2.getEType();
        CharSequence _mapping_1 = this.mapping(((EClass) _eType));
        _builder.append(_mapping_1, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

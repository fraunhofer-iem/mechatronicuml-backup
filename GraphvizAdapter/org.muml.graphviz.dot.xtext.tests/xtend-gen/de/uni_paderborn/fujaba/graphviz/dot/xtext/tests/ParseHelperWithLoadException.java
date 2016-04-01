package de.uni_paderborn.fujaba.graphviz.dot.xtext.tests;

import com.google.inject.Inject;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ParseHelperWithLoadException<T extends EObject> extends ParseHelper<T> {
  @Inject
  private IResourceFactory resourceFactory;
  
  @SuppressWarnings("unchecked")
  @Override
  public T parse(final InputStream in, final URI uriToUse, final Map<?, ?> options, final ResourceSet resourceSet) {
    try {
      final Resource resource = this.resourceFactory.createResource(uriToUse);
      EList<Resource> _resources = resourceSet.getResources();
      _resources.add(resource);
      resource.load(in, options);
      EList<Resource.Diagnostic> _errors = resource.getErrors();
      boolean _isEmpty = _errors.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<Resource.Diagnostic> _errors_1 = resource.getErrors();
        String _plus = ("load error: " + _errors_1);
        throw new IllegalStateException(_plus);
      }
      EObject _xifexpression = null;
      EList<EObject> _contents = resource.getContents();
      boolean _isEmpty_1 = _contents.isEmpty();
      if (_isEmpty_1) {
        _xifexpression = null;
      } else {
        EList<EObject> _contents_1 = resource.getContents();
        _xifexpression = _contents_1.get(0);
      }
      final T root = ((T) _xifexpression);
      return root;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

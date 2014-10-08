package de.uni_paderborn.fujaba.graphviz.dot.xtext.conversion;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Collections;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DotIDValueConverter implements IValueConverter<String> {
  public String toValue(final String string, final INode node) throws ValueConverterException {
    String _xifexpression = null;
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    boolean _notEquals = (!Objects.equal(string, null));
    if (!_notEquals) {
      _and_2 = false;
    } else {
      int _length = string.length();
      boolean _greaterEqualsThan = (_length >= 2);
      _and_2 = (_notEquals && _greaterEqualsThan);
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      boolean _startsWith = string.startsWith("\"");
      _and_1 = (_and_2 && _startsWith);
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _endsWith = string.endsWith("\"");
      _and = (_and_1 && _endsWith);
    }
    if (_and) {
      int _length_1 = string.length();
      int _minus = (_length_1 - 1);
      String _substring = string.substring(1, _minus);
      _xifexpression = _substring;
    } else {
      _xifexpression = string;
    }
    return _xifexpression;
  }
  
  public String toString(final String value) {
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
      public Boolean apply(final String s) {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(value, null));
        if (!_notEquals) {
          _and = false;
        } else {
          int _indexOf = value.indexOf(s);
          boolean _greaterThan = (_indexOf > 0);
          _and = (_notEquals && _greaterThan);
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(Collections.<String>unmodifiableList(Lists.<String>newArrayList("!", " ")), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    final boolean quote = (!_isEmpty);
    String _xifexpression = null;
    if (quote) {
      String _plus = ("\"" + value);
      String _plus_1 = (_plus + "\"");
      _xifexpression = _plus_1;
    } else {
      _xifexpression = value;
    }
    return _xifexpression;
  }
}

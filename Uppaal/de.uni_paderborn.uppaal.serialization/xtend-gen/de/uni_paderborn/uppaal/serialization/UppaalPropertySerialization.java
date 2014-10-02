package de.uni_paderborn.uppaal.serialization;

import com.google.common.base.Objects;
import de.uni_paderborn.uppaal.expressions.ArithmeticExpression;
import de.uni_paderborn.uppaal.expressions.AssignmentExpression;
import de.uni_paderborn.uppaal.expressions.BitShiftExpression;
import de.uni_paderborn.uppaal.expressions.BitwiseExpression;
import de.uni_paderborn.uppaal.expressions.CompareExpression;
import de.uni_paderborn.uppaal.expressions.CompareOperator;
import de.uni_paderborn.uppaal.expressions.ConditionExpression;
import de.uni_paderborn.uppaal.expressions.Expression;
import de.uni_paderborn.uppaal.expressions.FunctionCallExpression;
import de.uni_paderborn.uppaal.expressions.IdentifierExpression;
import de.uni_paderborn.uppaal.expressions.IncrementDecrementExpression;
import de.uni_paderborn.uppaal.expressions.LiteralExpression;
import de.uni_paderborn.uppaal.expressions.LogicalExpression;
import de.uni_paderborn.uppaal.expressions.MinMaxExpression;
import de.uni_paderborn.uppaal.expressions.MinusExpression;
import de.uni_paderborn.uppaal.expressions.NegationExpression;
import de.uni_paderborn.uppaal.expressions.PlusExpression;
import de.uni_paderborn.uppaal.expressions.QuantificationExpression;
import de.uni_paderborn.uppaal.expressions.ScopedIdentifierExpression;
import de.uni_paderborn.uppaal.requirements.DeadlockExpression;
import de.uni_paderborn.uppaal.requirements.LeadsToProperty;
import de.uni_paderborn.uppaal.requirements.PathQuantifier;
import de.uni_paderborn.uppaal.requirements.Property;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;
import de.uni_paderborn.uppaal.requirements.TemporalOperator;
import de.uni_paderborn.uppaal.requirements.UnaryProperty;
import de.uni_paderborn.uppaal.serialization.UppaalSerialization;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class UppaalPropertySerialization extends UppaalSerialization {
  public CharSequence serializePropertyRepository(final PropertyRepository it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Property> _elvis = null;
      EList<Property> _properties = it.getProperties();
      if (_properties != null) {
        _elvis = _properties;
      } else {
        List<Property> _emptyList = CollectionLiterals.<Property>emptyList();
        _elvis = _emptyList;
      }
      for(final Property i : _elvis) {
        _builder.newLineIfNotEmpty();
        {
          String _comment = i.getComment();
          boolean _notEquals = (!Objects.equal(_comment, "\"no comment provided\""));
          if (_notEquals) {
            String _comment_1 = i.getComment();
            CharSequence _comment_2 = this.comment(_comment_1);
            _builder.append(_comment_2, "");
          }
        }
        _builder.newLineIfNotEmpty();
        CharSequence _property = this.property(i);
        _builder.append(_property, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence comment(final String s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    String _replace = s.replace("*/", "* /");
    _builder.append(_replace, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    return _builder;
  }
  
  protected CharSequence _property(final LeadsToProperty it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _leftExpression = it.getLeftExpression();
    CharSequence _expression = this.expression(_leftExpression);
    _builder.append(_expression, "");
    _builder.append(" --> ");
    Expression _rightExpression = it.getRightExpression();
    CharSequence _expression_1 = this.expression(_rightExpression);
    _builder.append(_expression_1, "");
    return _builder;
  }
  
  protected CharSequence _property(final UnaryProperty it) {
    StringConcatenation _builder = new StringConcatenation();
    PathQuantifier _quantifier = it.getQuantifier();
    String _pathQuantifier = this.pathQuantifier(_quantifier);
    _builder.append(_pathQuantifier, "");
    TemporalOperator _operator = it.getOperator();
    String _temporalOperator = this.temporalOperator(_operator);
    _builder.append(_temporalOperator, "");
    _builder.append(" ");
    Expression _expression = it.getExpression();
    CharSequence _expression_1 = this.expression(_expression);
    _builder.append(_expression_1, "");
    return _builder;
  }
  
  protected CharSequence _expression(final DeadlockExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("deadlock");
    return _builder;
  }
  
  public int precedence(final Expression it) {
    boolean _matched = false;
    if (!_matched) {
      if ((it instanceof DeadlockExpression)) {
        _matched=true;
        return 500;
      }
    }
    return super.precedence(it);
  }
  
  public String temporalOperator(final TemporalOperator op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case FUTURE:
          _switchResult = "<>";
          break;
        case GLOBAL:
          _switchResult = "[]";
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public String pathQuantifier(final PathQuantifier op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case EXISTS:
          _switchResult = "E";
          break;
        case FORALL:
          _switchResult = "A";
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public String comparison(final CompareOperator op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case EQUAL:
          _switchResult = "==";
          break;
        case UNEQUAL:
          _switchResult = "!=";
          break;
        case GREATER:
          _switchResult = ">";
          break;
        case GREATER_OR_EQUAL:
          _switchResult = ">=";
          break;
        case LESS:
          _switchResult = "<";
          break;
        case LESS_OR_EQUAL:
          _switchResult = "<=";
          break;
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence property(final Property it) {
    if (it instanceof LeadsToProperty) {
      return _property((LeadsToProperty)it);
    } else if (it instanceof UnaryProperty) {
      return _property((UnaryProperty)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence expression(final Expression it) {
    if (it instanceof ArithmeticExpression) {
      return _expression((ArithmeticExpression)it);
    } else if (it instanceof AssignmentExpression) {
      return _expression((AssignmentExpression)it);
    } else if (it instanceof BitShiftExpression) {
      return _expression((BitShiftExpression)it);
    } else if (it instanceof BitwiseExpression) {
      return _expression((BitwiseExpression)it);
    } else if (it instanceof CompareExpression) {
      return _expression((CompareExpression)it);
    } else if (it instanceof LogicalExpression) {
      return _expression((LogicalExpression)it);
    } else if (it instanceof MinMaxExpression) {
      return _expression((MinMaxExpression)it);
    } else if (it instanceof ConditionExpression) {
      return _expression((ConditionExpression)it);
    } else if (it instanceof FunctionCallExpression) {
      return _expression((FunctionCallExpression)it);
    } else if (it instanceof IdentifierExpression) {
      return _expression((IdentifierExpression)it);
    } else if (it instanceof IncrementDecrementExpression) {
      return _expression((IncrementDecrementExpression)it);
    } else if (it instanceof LiteralExpression) {
      return _expression((LiteralExpression)it);
    } else if (it instanceof MinusExpression) {
      return _expression((MinusExpression)it);
    } else if (it instanceof NegationExpression) {
      return _expression((NegationExpression)it);
    } else if (it instanceof PlusExpression) {
      return _expression((PlusExpression)it);
    } else if (it instanceof QuantificationExpression) {
      return _expression((QuantificationExpression)it);
    } else if (it instanceof ScopedIdentifierExpression) {
      return _expression((ScopedIdentifierExpression)it);
    } else if (it instanceof DeadlockExpression) {
      return _expression((DeadlockExpression)it);
    } else if (it == null) {
      return _expression((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

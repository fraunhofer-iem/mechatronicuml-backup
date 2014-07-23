package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.english;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.muml.common.naming.QualifiedName;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.AndExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.ImplyExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.NotExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.OrExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Expression;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.BufferOverflowExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateInStatechartExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Property;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.ExistenceQuantExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.UniversalQuantExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.BufferSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ClockSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.InstanceSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.IntervalSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.MessageSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.StateSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.TransitionSetExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.scoping.MtctlQualifiedNameProvider;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Mtctl2English {
  public CharSequence serializeProperty(final Property it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _expression = it.getExpression();
    CharSequence _expr = this.expr(_expression, true);
    String _string = _expr.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append(".");
    return _builder;
  }
  
  protected CharSequence _expr(final QuantifierExpr expr, final boolean positive) {
    CharSequence _xblockexpression = null;
    {
      boolean thereIs = ((expr instanceof ExistenceQuantExpr) == positive);
      CharSequence _specialCase = this.specialCase(expr, positive);
      boolean _notEquals = (!Objects.equal(_specialCase, null));
      if (_notEquals) {
        return this.specialCase(expr, positive);
      }
      CharSequence _xifexpression = null;
      if (thereIs) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("there is ");
        BoundVariable _var = expr.getVar();
        CharSequence _boundVariable = this.boundVariable(_var, true);
        _builder.append(_boundVariable, "");
        _builder.append(" so that ");
        Expression _formula = expr.getFormula();
        CharSequence _itHoldsThat = this.itHoldsThat(_formula, positive);
        _builder.append(_itHoldsThat, "");
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("for all ");
        BoundVariable _var_1 = expr.getVar();
        CharSequence _boundVariable_1 = this.boundVariable(_var_1, false);
        _builder_1.append(_boundVariable_1, "");
        _builder_1.append(" ");
        Expression _formula_1 = expr.getFormula();
        CharSequence _itHoldsThat_1 = this.itHoldsThat(_formula_1, positive);
        _builder_1.append(_itHoldsThat_1, "");
        _xifexpression = _builder_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _expr(final AGExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("it invariantly holds that ");
      Expression _expr = expr.getExpr();
      Object _expr_1 = this.expr(_expr, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("it can possibly happen that ");
      Expression _expr_2 = expr.getExpr();
      Object _expr_3 = this.expr(_expr_2, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final AFExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("eventually it holds that ");
      Expression _expr = expr.getExpr();
      Object _expr_1 = this.expr(_expr, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("it might always hold that ");
      Expression _expr_2 = expr.getExpr();
      Object _expr_3 = this.expr(_expr_2, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final EFExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("it can possibly happen that ");
      Expression _expr = expr.getExpr();
      Object _expr_1 = this.expr(_expr, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("it cannot possibly happen that ");
      Expression _expr_2 = expr.getExpr();
      Object _expr_3 = this.expr(_expr_2, true);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final EGExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("it might always hold that ");
      Expression _expr = expr.getExpr();
      Object _expr_1 = this.expr(_expr, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("eventually it holds that ");
      Expression _expr_2 = expr.getExpr();
      Object _expr_3 = this.expr(_expr_2, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final LeadsToExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("whenever ");
      Expression _leftOpd = expr.getLeftOpd();
      Object _expr = this.expr(_leftOpd, true);
      _builder.append(_expr, "");
      _builder.append(", then eventually ");
      Expression _rightOpd = expr.getRightOpd();
      Object _expr_1 = this.expr(_rightOpd, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("it can happen that ");
      Expression _leftOpd_1 = expr.getLeftOpd();
      Object _expr_2 = this.expr(_leftOpd_1, true);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" and afterwards possibly always ");
      Expression _rightOpd_1 = expr.getRightOpd();
      Object _expr_3 = this.expr(_rightOpd_1, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final DeadlockExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a deadlock occurs");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("no deadlock occurs");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final BufferOverflowExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a buffer overflow occurs");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("no buffer overflow occurs");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final ComparisonExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      MapExpr _lhs = expr.getLhs();
      Object _expr = this.expr(_lhs, true);
      _builder.append(_expr, "");
      _builder.append(" ");
      ComparisonOp _op = expr.getOp();
      String _comparisonOp = this.comparisonOp(_op);
      _builder.append(_comparisonOp, "");
      _builder.append(" ");
      MapExpr _rhs = expr.getRhs();
      Object _expr_1 = this.expr(_rhs, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xblockexpression = null;
      {
        ComparisonOp op = null;
        ComparisonOp _op_1 = expr.getOp();
        final ComparisonOp _switchValue = _op_1;
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_switchValue,ComparisonOp.EQUALS)) {
            _matched=true;
            op = ComparisonOp.NOT_EQUAL;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,ComparisonOp.NOT_EQUAL)) {
            _matched=true;
            op = ComparisonOp.EQUALS;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,ComparisonOp.GREATER)) {
            _matched=true;
            op = ComparisonOp.LESS_OR_EQUAL;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,ComparisonOp.GREATER_OR_EQUAL)) {
            _matched=true;
            op = ComparisonOp.LESS;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,ComparisonOp.LESS)) {
            _matched=true;
            op = ComparisonOp.GREATER_OR_EQUAL;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,ComparisonOp.LESS_OR_EQUAL)) {
            _matched=true;
            op = ComparisonOp.GREATER;
          }
        }
        if (!_matched) {
          op = null;
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        MapExpr _lhs_1 = expr.getLhs();
        Object _expr_2 = this.expr(_lhs_1, true);
        _builder_1.append(_expr_2, "");
        _builder_1.append(" ");
        String _comparisonOp_1 = this.comparisonOp(op);
        _builder_1.append(_comparisonOp_1, "");
        _builder_1.append(" ");
        MapExpr _rhs_1 = expr.getRhs();
        Object _expr_3 = this.expr(_rhs_1, true);
        _builder_1.append(_expr_3, "");
        _xblockexpression = (_builder_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final MessageInBufferExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("the message ");
      MapExpr _message = expr.getMessage();
      Object _expr = this.expr(_message, true);
      _builder.append(_expr, "");
      _builder.append(" is in the buffer ");
      MapExpr _buffer = expr.getBuffer();
      Object _expr_1 = this.expr(_buffer, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("the message ");
      MapExpr _message_1 = expr.getMessage();
      Object _expr_2 = this.expr(_message_1, true);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" is not in the buffer ");
      MapExpr _buffer_1 = expr.getBuffer();
      Object _expr_3 = this.expr(_buffer_1, true);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final MessageInTransitExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("the message ");
      MapExpr _message = expr.getMessage();
      Object _expr = this.expr(_message, true);
      _builder.append(_expr, "");
      _builder.append(" is in transit");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("the message ");
      MapExpr _message_1 = expr.getMessage();
      Object _expr_1 = this.expr(_message_1, true);
      _builder_1.append(_expr_1, "");
      _builder_1.append(" is not in transit");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final StateActiveExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      MapExpr _state = expr.getState();
      Object _expr = this.expr(_state, true);
      _builder.append(_expr, "");
      _builder.append(" is active");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      MapExpr _state_1 = expr.getState();
      Object _expr_1 = this.expr(_state_1, true);
      _builder_1.append(_expr_1, "");
      _builder_1.append(" is not active");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final SubstateOfExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      MapExpr _state = expr.getState();
      Object _expr = this.expr(_state, true);
      _builder.append(_expr, "");
      _builder.append(" is a substate of ");
      MapExpr _superstate = expr.getSuperstate();
      Object _expr_1 = this.expr(_superstate, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      MapExpr _state_1 = expr.getState();
      Object _expr_2 = this.expr(_state_1, true);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" is not a substate of ");
      MapExpr _superstate_1 = expr.getSuperstate();
      Object _expr_3 = this.expr(_superstate_1, true);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final TransitionFiringExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      MapExpr _transition = expr.getTransition();
      Object _expr = this.expr(_transition, true);
      _builder.append(_expr, "");
      _builder.append(" is firing");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      MapExpr _transition_1 = expr.getTransition();
      Object _expr_1 = this.expr(_transition_1, true);
      _builder_1.append(_expr_1, "");
      _builder_1.append(" is not firing");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final TrueExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("true");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("false");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final FalseExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("false");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("true");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final StateInStatechartExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      MapExpr _state = expr.getState();
      Object _expr = this.expr(_state, true);
      _builder.append(_expr, "");
      _builder.append(" is in statechart ");
      MapExpr _statechart = expr.getStatechart();
      Object _expr_1 = this.expr(_statechart, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      MapExpr _state_1 = expr.getState();
      Object _expr_2 = this.expr(_state_1, true);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" is not in statechart ");
      MapExpr _statechart_1 = expr.getStatechart();
      Object _expr_3 = this.expr(_statechart_1, true);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence boundVariable(final BoundVariable expr, final boolean singular) {
    CharSequence _switchResult = null;
    SetExpr _set = expr.getSet();
    final SetExpr _switchValue = _set;
    boolean _matched = false;
    if (!_matched) {
      if (_switchValue instanceof ClockSetExpr) {
        final ClockSetExpr _clockSetExpr = (ClockSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a clock ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof ClockSetExpr) {
        final ClockSetExpr _clockSetExpr = (ClockSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("clocks ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof IntervalSetExpr) {
        final IntervalSetExpr _intervalSetExpr = (IntervalSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a number ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _builder.append(" between ");
          SetExpr _set_1 = expr.getSet();
          int _lowerVal = ((IntervalSetExpr) _set_1).getLowerVal();
          _builder.append(_lowerVal, "");
          _builder.append(" and ");
          SetExpr _set_2 = expr.getSet();
          int _upperVal = ((IntervalSetExpr) _set_2).getUpperVal();
          _builder.append(_upperVal, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof IntervalSetExpr) {
        final IntervalSetExpr _intervalSetExpr = (IntervalSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("numbers ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _builder.append(" between ");
          SetExpr _set_1 = expr.getSet();
          int _lowerVal = ((IntervalSetExpr) _set_1).getLowerVal();
          _builder.append(_lowerVal, "");
          _builder.append(" and ");
          SetExpr _set_2 = expr.getSet();
          int _upperVal = ((IntervalSetExpr) _set_2).getUpperVal();
          _builder.append(_upperVal, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof MessageSetExpr) {
        final MessageSetExpr _messageSetExpr = (MessageSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a message ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof MessageSetExpr) {
        final MessageSetExpr _messageSetExpr = (MessageSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("messages ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof StateSetExpr) {
        final StateSetExpr _stateSetExpr = (StateSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a state ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof StateSetExpr) {
        final StateSetExpr _stateSetExpr = (StateSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("states ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof TransitionSetExpr) {
        final TransitionSetExpr _transitionSetExpr = (TransitionSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a transition ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof TransitionSetExpr) {
        final TransitionSetExpr _transitionSetExpr = (TransitionSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("transitions ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof BufferSetExpr) {
        final BufferSetExpr _bufferSetExpr = (BufferSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a buffer ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof BufferSetExpr) {
        final BufferSetExpr _bufferSetExpr = (BufferSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("buffers ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof InstanceSetExpr) {
        final InstanceSetExpr _instanceSetExpr = (InstanceSetExpr)_switchValue;
        if (singular) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("a instance ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _builder.append(" of type ");
          SetExpr _set_1 = expr.getSet();
          MumlElemExpr _type = ((InstanceSetExpr) _set_1).getType();
          _builder.append(_type, "");
          _switchResult = _builder;
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof InstanceSetExpr) {
        final InstanceSetExpr _instanceSetExpr = (InstanceSetExpr)_switchValue;
        boolean _not = (!singular);
        if (_not) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("instances ");
          String _name = expr.getName();
          _builder.append(_name, "");
          _builder.append(" of type ");
          SetExpr _set_1 = expr.getSet();
          MumlElemExpr _type = ((InstanceSetExpr) _set_1).getType();
          _builder.append(_type, "");
          _switchResult = _builder;
        }
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _expr(final AndExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      Expression _leftOpd = expr.getLeftOpd();
      Object _expr = this.expr(_leftOpd, true);
      _builder.append(_expr, "");
      _builder.append(" and ");
      Expression _rightOpd = expr.getRightOpd();
      Object _expr_1 = this.expr(_rightOpd, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      Expression _leftOpd_1 = expr.getLeftOpd();
      Object _expr_2 = this.expr(_leftOpd_1, false);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" or ");
      Expression _rightOpd_1 = expr.getRightOpd();
      Object _expr_3 = this.expr(_rightOpd_1, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final ImplyExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if ");
      Expression _leftOpd = expr.getLeftOpd();
      Object _expr = this.expr(_leftOpd, true);
      _builder.append(_expr, "");
      _builder.append(" then ");
      Expression _rightOpd = expr.getRightOpd();
      Object _expr_1 = this.expr(_rightOpd, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      Expression _leftOpd_1 = expr.getLeftOpd();
      Object _expr_2 = this.expr(_leftOpd_1, true);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" and ");
      Expression _rightOpd_1 = expr.getRightOpd();
      Object _expr_3 = this.expr(_rightOpd_1, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final NotExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      Expression _opd = expr.getOpd();
      Object _expr = this.expr(_opd, false);
      _builder.append(_expr, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      Expression _opd_1 = expr.getOpd();
      Object _expr_1 = this.expr(_opd_1, true);
      _builder_1.append(_expr_1, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final OrExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    if (positive) {
      StringConcatenation _builder = new StringConcatenation();
      Expression _leftOpd = expr.getLeftOpd();
      Object _expr = this.expr(_leftOpd, true);
      _builder.append(_expr, "");
      _builder.append(" or ");
      Expression _rightOpd = expr.getRightOpd();
      Object _expr_1 = this.expr(_rightOpd, true);
      _builder.append(_expr_1, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      Expression _leftOpd_1 = expr.getLeftOpd();
      Object _expr_2 = this.expr(_leftOpd_1, false);
      _builder_1.append(_expr_2, "");
      _builder_1.append(" and ");
      Expression _rightOpd_1 = expr.getRightOpd();
      Object _expr_3 = this.expr(_rightOpd_1, false);
      _builder_1.append(_expr_3, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _expr(final BufferMsgCountExpr expr, final boolean positive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("the number of messages in buffer ");
    MapExpr _buffer = expr.getBuffer();
    Object _expr = this.expr(_buffer, true);
    _builder.append(_expr, "");
    return _builder;
  }
  
  protected CharSequence _expr(final ConstExpr expr, final boolean positive) {
    StringConcatenation _builder = new StringConcatenation();
    int _val = expr.getVal();
    _builder.append(_val, "");
    String _xifexpression = null;
    TimeUnit _timeUnit = expr.getTimeUnit();
    boolean _notEquals = (!Objects.equal(_timeUnit, null));
    if (_notEquals) {
      TimeUnit _timeUnit_1 = expr.getTimeUnit();
      String _timeUnit_2 = this.timeUnit(_timeUnit_1);
      String _plus = (" " + _timeUnit_2);
      _xifexpression = _plus;
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  protected CharSequence _expr(final MumlElemExpr expr, final boolean positive) {
    CharSequence _xblockexpression = null;
    {
      MtctlQualifiedNameProvider _mtctlQualifiedNameProvider = new MtctlQualifiedNameProvider();
      MtctlQualifiedNameProvider provider = _mtctlQualifiedNameProvider;
      StringConcatenation _builder = new StringConcatenation();
      EObject _elem = expr.getElem();
      QualifiedName _qualifiedName = provider.getQualifiedName(_elem, null);
      _builder.append(_qualifiedName, "");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _expr(final SourceStateExpr expr, final boolean positive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("the source state of ");
    MapExpr _transition = expr.getTransition();
    Object _expr = this.expr(_transition, true);
    _builder.append(_expr, "");
    return _builder;
  }
  
  protected CharSequence _expr(final TargetStateExpr expr, final boolean positive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("the target state of ");
    MapExpr _transition = expr.getTransition();
    Object _expr = this.expr(_transition, true);
    _builder.append(_expr, "");
    return _builder;
  }
  
  public String comparisonOp(final ComparisonOp op) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(op,ComparisonOp.EQUALS)) {
        _matched=true;
        _switchResult = "is";
      }
    }
    if (!_matched) {
      if (Objects.equal(op,ComparisonOp.NOT_EQUAL)) {
        _matched=true;
        _switchResult = "is not";
      }
    }
    if (!_matched) {
      if (Objects.equal(op,ComparisonOp.GREATER)) {
        _matched=true;
        _switchResult = "is more than";
      }
    }
    if (!_matched) {
      if (Objects.equal(op,ComparisonOp.GREATER_OR_EQUAL)) {
        _matched=true;
        _switchResult = "is at least";
      }
    }
    if (!_matched) {
      if (Objects.equal(op,ComparisonOp.LESS)) {
        _matched=true;
        _switchResult = "is less than";
      }
    }
    if (!_matched) {
      if (Objects.equal(op,ComparisonOp.LESS_OR_EQUAL)) {
        _matched=true;
        _switchResult = "is at most";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public String timeUnit(final TimeUnit unit) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.DAYS)) {
        _matched=true;
        _switchResult = "days";
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.HOURS)) {
        _matched=true;
        _switchResult = "hours";
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.MINUTES)) {
        _matched=true;
        _switchResult = "minutes";
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.SECONDS)) {
        _matched=true;
        _switchResult = "seconds";
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.MILLISECONDS)) {
        _matched=true;
        _switchResult = "milliseconds";
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.MICROSECONDS)) {
        _matched=true;
        _switchResult = "microseconds";
      }
    }
    if (!_matched) {
      if (Objects.equal(unit,TimeUnit.NANOSECONDS)) {
        _matched=true;
        _switchResult = "nanoseconds";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  protected CharSequence _specialCase(final QuantifierExpr expr, final boolean positive) {
    CharSequence _xifexpression = null;
    boolean _or = false;
    boolean _and = false;
    Expression _formula = expr.getFormula();
    if (!(_formula instanceof ImplyExpr)) {
      _and = false;
    } else {
      _and = ((_formula instanceof ImplyExpr) && (expr instanceof UniversalQuantExpr));
    }
    if (_and) {
      _or = true;
    } else {
      boolean _and_1 = false;
      Expression _formula_1 = expr.getFormula();
      if (!(_formula_1 instanceof AndExpr)) {
        _and_1 = false;
      } else {
        _and_1 = ((_formula_1 instanceof AndExpr) && (expr instanceof ExistenceQuantExpr));
      }
      _or = (_and || _and_1);
    }
    if (_or) {
      CharSequence _xblockexpression = null;
      {
        boolean thereIs = (positive == (expr instanceof ExistenceQuantExpr));
        Expression _xifexpression_1 = null;
        Expression _formula_2 = expr.getFormula();
        if ((_formula_2 instanceof ImplyExpr)) {
          Expression _formula_3 = expr.getFormula();
          Expression _leftOpd = ((ImplyExpr) _formula_3).getLeftOpd();
          _xifexpression_1 = _leftOpd;
        } else {
          Expression _formula_4 = expr.getFormula();
          Expression _leftOpd_1 = ((AndExpr) _formula_4).getLeftOpd();
          _xifexpression_1 = _leftOpd_1;
        }
        Expression leftOpd = _xifexpression_1;
        Expression _xifexpression_2 = null;
        Expression _formula_5 = expr.getFormula();
        if ((_formula_5 instanceof ImplyExpr)) {
          Expression _formula_6 = expr.getFormula();
          Expression _rightOpd = ((ImplyExpr) _formula_6).getRightOpd();
          _xifexpression_2 = _rightOpd;
        } else {
          Expression _formula_7 = expr.getFormula();
          Expression _rightOpd_1 = ((AndExpr) _formula_7).getRightOpd();
          _xifexpression_2 = _rightOpd_1;
        }
        Expression rightOpd = _xifexpression_2;
        CharSequence _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (leftOpd instanceof SubstateOfExpr) {
            final SubstateOfExpr _substateOfExpr = (SubstateOfExpr)leftOpd;
            boolean _and_2 = false;
            MapExpr _state = _substateOfExpr.getState();
            if (!(_state instanceof MumlElemExpr)) {
              _and_2 = false;
            } else {
              MapExpr _state_1 = _substateOfExpr.getState();
              EObject _elem = ((MumlElemExpr) _state_1).getElem();
              BoundVariable _var = expr.getVar();
              boolean _equals = Objects.equal(_elem, _var);
              _and_2 = ((_state instanceof MumlElemExpr) && _equals);
            }
            if (_and_2) {
              _matched=true;
              StringConcatenation _builder = new StringConcatenation();
              {
                if (thereIs) {
                  _builder.append("there is a substate");
                } else {
                  _builder.append("for all substates");
                }
              }
              _builder.append(" ");
              BoundVariable _var_1 = expr.getVar();
              String _name = _var_1.getName();
              _builder.append(_name, "");
              _builder.append(" of ");
              MapExpr _superstate = _substateOfExpr.getSuperstate();
              Object _expr = this.expr(_superstate, true);
              _builder.append(_expr, "");
              {
                if (thereIs) {
                  _builder.append(" so that");
                }
              }
              _builder.append(" ");
              CharSequence _itHoldsThat = this.itHoldsThat(rightOpd, positive);
              _builder.append(_itHoldsThat, "");
              _switchResult = _builder;
            }
          }
        }
        if (!_matched) {
          if (leftOpd instanceof SubstateOfExpr) {
            final SubstateOfExpr _substateOfExpr = (SubstateOfExpr)leftOpd;
            boolean _and_2 = false;
            MapExpr _superstate = _substateOfExpr.getSuperstate();
            if (!(_superstate instanceof MumlElemExpr)) {
              _and_2 = false;
            } else {
              MapExpr _superstate_1 = _substateOfExpr.getSuperstate();
              EObject _elem = ((MumlElemExpr) _superstate_1).getElem();
              BoundVariable _var = expr.getVar();
              boolean _equals = Objects.equal(_elem, _var);
              _and_2 = ((_superstate instanceof MumlElemExpr) && _equals);
            }
            if (_and_2) {
              _matched=true;
              StringConcatenation _builder = new StringConcatenation();
              {
                if (thereIs) {
                  _builder.append("there is a superstate");
                } else {
                  _builder.append("for all superstates");
                }
              }
              _builder.append(" ");
              BoundVariable _var_1 = expr.getVar();
              String _name = _var_1.getName();
              _builder.append(_name, "");
              _builder.append(" of ");
              MapExpr _state = _substateOfExpr.getState();
              Object _expr = this.expr(_state, true);
              _builder.append(_expr, "");
              {
                if (thereIs) {
                  _builder.append(" so that");
                }
              }
              _builder.append(" ");
              CharSequence _itHoldsThat = this.itHoldsThat(rightOpd, positive);
              _builder.append(_itHoldsThat, "");
              _switchResult = _builder;
            }
          }
        }
        if (!_matched) {
          if (leftOpd instanceof StateInStatechartExpr) {
            final StateInStatechartExpr _stateInStatechartExpr = (StateInStatechartExpr)leftOpd;
            boolean _and_2 = false;
            MapExpr _state = _stateInStatechartExpr.getState();
            if (!(_state instanceof MumlElemExpr)) {
              _and_2 = false;
            } else {
              MapExpr _state_1 = _stateInStatechartExpr.getState();
              EObject _elem = ((MumlElemExpr) _state_1).getElem();
              BoundVariable _var = expr.getVar();
              boolean _equals = Objects.equal(_elem, _var);
              _and_2 = ((_state instanceof MumlElemExpr) && _equals);
            }
            if (_and_2) {
              _matched=true;
              StringConcatenation _builder = new StringConcatenation();
              {
                if (thereIs) {
                  _builder.append("there is a state");
                } else {
                  _builder.append("for all states");
                }
              }
              _builder.append(" ");
              BoundVariable _var_1 = expr.getVar();
              String _name = _var_1.getName();
              _builder.append(_name, "");
              _builder.append(" in ");
              MapExpr _statechart = _stateInStatechartExpr.getStatechart();
              Object _expr = this.expr(_statechart, true);
              _builder.append(_expr, "");
              {
                if (thereIs) {
                  _builder.append(" so that");
                }
              }
              _builder.append(" ");
              CharSequence _itHoldsThat = this.itHoldsThat(rightOpd, positive);
              _builder.append(_itHoldsThat, "");
              _switchResult = _builder;
            }
          }
        }
        if (!_matched) {
          return null;
        }
        _xblockexpression = (_switchResult);
      }
      _xifexpression = _xblockexpression;
    } else {
      return null;
    }
    return _xifexpression;
  }
  
  public CharSequence itHoldsThat(final Expression expr, final boolean positive) {
    CharSequence _xifexpression = null;
    boolean _or = false;
    if ((expr instanceof TemporalQuantifierExpr)) {
      _or = true;
    } else {
      EObject _eContainer = expr.eContainer();
      _or = ((expr instanceof TemporalQuantifierExpr) || (_eContainer instanceof TemporalQuantifierExpr));
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      Object _expr = this.expr(expr, positive);
      _builder.append(_expr, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("it holds that ");
      Object _expr_1 = this.expr(expr, positive);
      _builder_1.append(_expr_1, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence expr(final Expression expr, final boolean positive) {
    if (expr instanceof SourceStateExpr) {
      return _expr((SourceStateExpr)expr, positive);
    } else if (expr instanceof TargetStateExpr) {
      return _expr((TargetStateExpr)expr, positive);
    } else if (expr instanceof BufferOverflowExpr) {
      return _expr((BufferOverflowExpr)expr, positive);
    } else if (expr instanceof DeadlockExpr) {
      return _expr((DeadlockExpr)expr, positive);
    } else if (expr instanceof FalseExpr) {
      return _expr((FalseExpr)expr, positive);
    } else if (expr instanceof MessageInBufferExpr) {
      return _expr((MessageInBufferExpr)expr, positive);
    } else if (expr instanceof MessageInTransitExpr) {
      return _expr((MessageInTransitExpr)expr, positive);
    } else if (expr instanceof StateActiveExpr) {
      return _expr((StateActiveExpr)expr, positive);
    } else if (expr instanceof StateInStatechartExpr) {
      return _expr((StateInStatechartExpr)expr, positive);
    } else if (expr instanceof SubstateOfExpr) {
      return _expr((SubstateOfExpr)expr, positive);
    } else if (expr instanceof TransitionFiringExpr) {
      return _expr((TransitionFiringExpr)expr, positive);
    } else if (expr instanceof TrueExpr) {
      return _expr((TrueExpr)expr, positive);
    } else if (expr instanceof BufferMsgCountExpr) {
      return _expr((BufferMsgCountExpr)expr, positive);
    } else if (expr instanceof ConstExpr) {
      return _expr((ConstExpr)expr, positive);
    } else if (expr instanceof MumlElemExpr) {
      return _expr((MumlElemExpr)expr, positive);
    } else if (expr instanceof ComparisonExpr) {
      return _expr((ComparisonExpr)expr, positive);
    } else if (expr instanceof AFExpr) {
      return _expr((AFExpr)expr, positive);
    } else if (expr instanceof AGExpr) {
      return _expr((AGExpr)expr, positive);
    } else if (expr instanceof EFExpr) {
      return _expr((EFExpr)expr, positive);
    } else if (expr instanceof EGExpr) {
      return _expr((EGExpr)expr, positive);
    } else if (expr instanceof LeadsToExpr) {
      return _expr((LeadsToExpr)expr, positive);
    } else if (expr instanceof AndExpr) {
      return _expr((AndExpr)expr, positive);
    } else if (expr instanceof ImplyExpr) {
      return _expr((ImplyExpr)expr, positive);
    } else if (expr instanceof NotExpr) {
      return _expr((NotExpr)expr, positive);
    } else if (expr instanceof OrExpr) {
      return _expr((OrExpr)expr, positive);
    } else if (expr instanceof QuantifierExpr) {
      return _expr((QuantifierExpr)expr, positive);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, positive).toString());
    }
  }
  
  public CharSequence specialCase(final QuantifierExpr expr, final boolean positive) {
    {
      return _specialCase(expr, positive);
    }
  }
}

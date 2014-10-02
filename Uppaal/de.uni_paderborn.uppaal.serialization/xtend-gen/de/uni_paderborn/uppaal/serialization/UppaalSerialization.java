package de.uni_paderborn.uppaal.serialization;

import com.google.common.base.Objects;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.core.NamedElement;
import de.uni_paderborn.uppaal.declarations.ArrayInitializer;
import de.uni_paderborn.uppaal.declarations.CallType;
import de.uni_paderborn.uppaal.declarations.ChannelVariableDeclaration;
import de.uni_paderborn.uppaal.declarations.ClockVariableDeclaration;
import de.uni_paderborn.uppaal.declarations.DataVariableDeclaration;
import de.uni_paderborn.uppaal.declarations.DataVariablePrefix;
import de.uni_paderborn.uppaal.declarations.Declaration;
import de.uni_paderborn.uppaal.declarations.Declarations;
import de.uni_paderborn.uppaal.declarations.ExpressionInitializer;
import de.uni_paderborn.uppaal.declarations.Function;
import de.uni_paderborn.uppaal.declarations.FunctionDeclaration;
import de.uni_paderborn.uppaal.declarations.GlobalDeclarations;
import de.uni_paderborn.uppaal.declarations.Index;
import de.uni_paderborn.uppaal.declarations.Initializer;
import de.uni_paderborn.uppaal.declarations.LocalDeclarations;
import de.uni_paderborn.uppaal.declarations.Parameter;
import de.uni_paderborn.uppaal.declarations.SystemDeclarations;
import de.uni_paderborn.uppaal.declarations.TypeDeclaration;
import de.uni_paderborn.uppaal.declarations.TypeIndex;
import de.uni_paderborn.uppaal.declarations.ValueIndex;
import de.uni_paderborn.uppaal.declarations.Variable;
import de.uni_paderborn.uppaal.declarations.VariableDeclaration;
import de.uni_paderborn.uppaal.declarations.global.ChannelList;
import de.uni_paderborn.uppaal.declarations.global.ChannelPriority;
import de.uni_paderborn.uppaal.declarations.global.ChannelPriorityItem;
import de.uni_paderborn.uppaal.declarations.global.DefaultChannelPriority;
import de.uni_paderborn.uppaal.declarations.system.InstantiationList;
import de.uni_paderborn.uppaal.declarations.system.ProgressMeasure;
import de.uni_paderborn.uppaal.declarations.system.TemplateDeclaration;
import de.uni_paderborn.uppaal.expressions.ArithmeticExpression;
import de.uni_paderborn.uppaal.expressions.ArithmeticOperator;
import de.uni_paderborn.uppaal.expressions.AssignmentExpression;
import de.uni_paderborn.uppaal.expressions.AssignmentOperator;
import de.uni_paderborn.uppaal.expressions.BitShiftExpression;
import de.uni_paderborn.uppaal.expressions.BitShiftOperator;
import de.uni_paderborn.uppaal.expressions.BitwiseExpression;
import de.uni_paderborn.uppaal.expressions.BitwiseOperator;
import de.uni_paderborn.uppaal.expressions.CompareExpression;
import de.uni_paderborn.uppaal.expressions.CompareOperator;
import de.uni_paderborn.uppaal.expressions.ConditionExpression;
import de.uni_paderborn.uppaal.expressions.Expression;
import de.uni_paderborn.uppaal.expressions.FunctionCallExpression;
import de.uni_paderborn.uppaal.expressions.IdentifierExpression;
import de.uni_paderborn.uppaal.expressions.IncrementDecrementExpression;
import de.uni_paderborn.uppaal.expressions.IncrementDecrementOperator;
import de.uni_paderborn.uppaal.expressions.IncrementDecrementPosition;
import de.uni_paderborn.uppaal.expressions.LiteralExpression;
import de.uni_paderborn.uppaal.expressions.LogicalExpression;
import de.uni_paderborn.uppaal.expressions.LogicalOperator;
import de.uni_paderborn.uppaal.expressions.MinMaxExpression;
import de.uni_paderborn.uppaal.expressions.MinMaxOperator;
import de.uni_paderborn.uppaal.expressions.MinusExpression;
import de.uni_paderborn.uppaal.expressions.NegationExpression;
import de.uni_paderborn.uppaal.expressions.PlusExpression;
import de.uni_paderborn.uppaal.expressions.QuantificationExpression;
import de.uni_paderborn.uppaal.expressions.Quantifier;
import de.uni_paderborn.uppaal.expressions.ScopedIdentifierExpression;
import de.uni_paderborn.uppaal.statements.Block;
import de.uni_paderborn.uppaal.statements.DoWhileLoop;
import de.uni_paderborn.uppaal.statements.EmptyStatement;
import de.uni_paderborn.uppaal.statements.ExpressionStatement;
import de.uni_paderborn.uppaal.statements.ForLoop;
import de.uni_paderborn.uppaal.statements.IfStatement;
import de.uni_paderborn.uppaal.statements.Iteration;
import de.uni_paderborn.uppaal.statements.ReturnStatement;
import de.uni_paderborn.uppaal.statements.Statement;
import de.uni_paderborn.uppaal.statements.WhileLoop;
import de.uni_paderborn.uppaal.templates.AbstractTemplate;
import de.uni_paderborn.uppaal.templates.Edge;
import de.uni_paderborn.uppaal.templates.Location;
import de.uni_paderborn.uppaal.templates.LocationKind;
import de.uni_paderborn.uppaal.templates.RedefinedTemplate;
import de.uni_paderborn.uppaal.templates.Selection;
import de.uni_paderborn.uppaal.templates.Synchronization;
import de.uni_paderborn.uppaal.templates.SynchronizationKind;
import de.uni_paderborn.uppaal.templates.Template;
import de.uni_paderborn.uppaal.types.BuiltInType;
import de.uni_paderborn.uppaal.types.DeclaredType;
import de.uni_paderborn.uppaal.types.IntegerBounds;
import de.uni_paderborn.uppaal.types.RangeTypeSpecification;
import de.uni_paderborn.uppaal.types.ScalarTypeSpecification;
import de.uni_paderborn.uppaal.types.StructTypeSpecification;
import de.uni_paderborn.uppaal.types.Type;
import de.uni_paderborn.uppaal.types.TypeDefinition;
import de.uni_paderborn.uppaal.types.TypeReference;
import de.uni_paderborn.uppaal.visuals.ColorKind;
import de.uni_paderborn.uppaal.visuals.Point;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class UppaalSerialization {
  private boolean moveEdgeLabelsAway = false;
  
  public boolean setMoveEdgeLabelsAway(final boolean state) {
    return this.moveEdgeLabelsAway = state;
  }
  
  public CharSequence main(final NTA it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE nta PUBLIC \'-//Uppaal Team//DTD Flat System 1.1//EN\' \'http://www.it.uu.se/research/group/darts/uppaal/flat-1_1.dtd\'>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<nta>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<declaration>");
    _builder.newLine();
    GlobalDeclarations _globalDeclarations = it.getGlobalDeclarations();
    CharSequence _declarations = this.declarations(_globalDeclarations);
    _builder.append(_declarations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</declaration>");
    _builder.newLine();
    {
      List<Template> _elvis = null;
      EList<Template> _template = it.getTemplate();
      if (_template != null) {
        _elvis = _template;
      } else {
        List<Template> _emptyList = CollectionLiterals.<Template>emptyList();
        _elvis = _emptyList;
      }
      for(final Template i : _elvis) {
        CharSequence _template_1 = this.template(i);
        _builder.append(_template_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<system>");
    _builder.newLine();
    SystemDeclarations _systemDeclarations = it.getSystemDeclarations();
    CharSequence _declarations_1 = this.declarations(_systemDeclarations);
    _builder.append(_declarations_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</system>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</nta>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * generate declarations
   */
  protected CharSequence _declarations(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _declarations(final GlobalDeclarations it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Declaration> _elvis = null;
      EList<Declaration> _declaration = it.getDeclaration();
      if (_declaration != null) {
        _elvis = _declaration;
      } else {
        List<Declaration> _emptyList = CollectionLiterals.<Declaration>emptyList();
        _elvis = _emptyList;
      }
      for(final Declaration i : _elvis) {
        CharSequence _declaration_1 = this.declaration(i);
        _builder.append(_declaration_1, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    ChannelPriority _channelPriority = it.getChannelPriority();
    CharSequence _channelPriority_1 = this.channelPriority(_channelPriority);
    _builder.append(_channelPriority_1, "");
    return _builder;
  }
  
  protected CharSequence _declarations(final LocalDeclarations it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Declaration> _elvis = null;
      EList<Declaration> _declaration = it.getDeclaration();
      if (_declaration != null) {
        _elvis = _declaration;
      } else {
        List<Declaration> _emptyList = CollectionLiterals.<Declaration>emptyList();
        _elvis = _emptyList;
      }
      for(final Declaration i : _elvis) {
        _builder.newLineIfNotEmpty();
        CharSequence _declaration_1 = this.declaration(i);
        _builder.append(_declaration_1, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _declarations(final SystemDeclarations it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Declaration> _elvis = null;
      EList<Declaration> _declaration = it.getDeclaration();
      if (_declaration != null) {
        _elvis = _declaration;
      } else {
        List<Declaration> _emptyList = CollectionLiterals.<Declaration>emptyList();
        _elvis = _emptyList;
      }
      for(final Declaration i : _elvis) {
        _builder.newLineIfNotEmpty();
        CharSequence _declaration_1 = this.declaration(i);
        _builder.append(_declaration_1, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("\t");
    de.uni_paderborn.uppaal.declarations.system.System _system = it.getSystem();
    CharSequence _system_1 = this.system(_system);
    _builder.append(_system_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      ProgressMeasure _progressMeasure = it.getProgressMeasure();
      boolean _notEquals = (!Objects.equal(_progressMeasure, null));
      if (_notEquals) {
        ProgressMeasure _progressMeasure_1 = it.getProgressMeasure();
        CharSequence _progressMeasure_2 = this.progressMeasure(_progressMeasure_1);
        _builder.append(_progressMeasure_2, "\t");
      }
    }
    return _builder;
  }
  
  protected CharSequence _declaration(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _declaration(final FunctionDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    Function _function = it.getFunction();
    CharSequence _function_1 = this.function(_function);
    _builder.append(_function_1, "");
    return _builder;
  }
  
  public CharSequence function(final Function it) {
    StringConcatenation _builder = new StringConcatenation();
    TypeDefinition _returnType = it.getReturnType();
    CharSequence _typedefinition = this.typedefinition(_returnType);
    _builder.append(_typedefinition, "");
    _builder.append(" ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      List<Parameter> _elvis = null;
      EList<Parameter> _parameter = it.getParameter();
      if (_parameter != null) {
        _elvis = _parameter;
      } else {
        List<Parameter> _emptyList = CollectionLiterals.<Parameter>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final Parameter i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _parameter_1 = this.parameter(i);
        _builder.append(_parameter_1, "");
      }
    }
    _builder.append(") ");
    Block _block = it.getBlock();
    CharSequence _block_1 = this.block(_block);
    _builder.append(_block_1, "");
    return _builder;
  }
  
  protected CharSequence _block(final Block it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      List<Declaration> _xifexpression = null;
      LocalDeclarations _declarations = it.getDeclarations();
      boolean _equals = Objects.equal(_declarations, null);
      if (_equals) {
        _xifexpression = CollectionLiterals.<Declaration>emptyList();
      } else {
        List<Declaration> _elvis = null;
        LocalDeclarations _declarations_1 = it.getDeclarations();
        EList<Declaration> _declaration = _declarations_1.getDeclaration();
        if (_declaration != null) {
          _elvis = _declaration;
        } else {
          List<Declaration> _emptyList = CollectionLiterals.<Declaration>emptyList();
          _elvis = _emptyList;
        }
        _xifexpression = _elvis;
      }
      for(final Declaration i : _xifexpression) {
        _builder.append("\t");
        Object _declaration_1 = this.declaration(i);
        _builder.append(_declaration_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<Statement> _elvis_1 = null;
      EList<Statement> _statement = it.getStatement();
      if (_statement != null) {
        _elvis_1 = _statement;
      } else {
        List<Statement> _emptyList_1 = CollectionLiterals.<Statement>emptyList();
        _elvis_1 = _emptyList_1;
      }
      for(final Statement i_1 : _elvis_1) {
        _builder.append("\t");
        CharSequence _statement_1 = this.statement(i_1);
        _builder.append(_statement_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _declaration(final TypeDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef ");
    TypeDefinition _typeDefinition = it.getTypeDefinition();
    CharSequence _typedefinition = this.typedefinition(_typeDefinition);
    _builder.append(_typedefinition, "");
    _builder.append(" ");
    {
      List<DeclaredType> _elvis = null;
      EList<DeclaredType> _type = it.getType();
      if (_type != null) {
        _elvis = _type;
      } else {
        List<DeclaredType> _emptyList = CollectionLiterals.<DeclaredType>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final DeclaredType i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _typedeclaration = this.typedeclaration(i);
        _builder.append(_typedeclaration, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  public CharSequence typedeclaration(final Type it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _typename = this.typename(it);
    _builder.append(_typename, "");
    {
      List<Index> _elvis = null;
      EList<Index> _index = it.getIndex();
      if (_index != null) {
        _elvis = _index;
      } else {
        List<Index> _emptyList = CollectionLiterals.<Index>emptyList();
        _elvis = _emptyList;
      }
      for(final Index i : _elvis) {
        CharSequence _index_1 = this.index(i);
        _builder.append(_index_1, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _declaration(final VariableDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declaration = this.declaration(it, Boolean.valueOf(false));
    _builder.append(_declaration, "");
    _builder.append(";");
    return _builder;
  }
  
  public CharSequence declaration(final VariableDeclaration it, final Boolean callByReference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _prefix = this.prefix(it);
    _builder.append(_prefix, "");
    TypeDefinition _typeDefinition = it.getTypeDefinition();
    CharSequence _typedefinition = this.typedefinition(_typeDefinition);
    _builder.append(_typedefinition, "");
    _builder.append(" ");
    {
      if ((callByReference).booleanValue()) {
        _builder.append("&amp;");
      }
    }
    {
      List<Variable> _elvis = null;
      EList<Variable> _variable = it.getVariable();
      if (_variable != null) {
        _elvis = _variable;
      } else {
        List<Variable> _emptyList = CollectionLiterals.<Variable>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final Variable i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _variable_1 = this.variable(i);
        _builder.append(_variable_1, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _prefix(final ClockVariableDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _prefix(final DataVariableDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      DataVariablePrefix _prefix = it.getPrefix();
      boolean _notEquals = (!Objects.equal(_prefix, DataVariablePrefix.NONE));
      if (_notEquals) {
        DataVariablePrefix _prefix_1 = it.getPrefix();
        String _string = _prefix_1.toString();
        _builder.append(_string, "");
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  protected CharSequence _prefix(final ChannelVariableDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isBroadcast = it.isBroadcast();
      if (_isBroadcast) {
        _builder.append("broadcast ");
      }
    }
    {
      boolean _isUrgent = it.isUrgent();
      if (_isUrgent) {
        _builder.append("urgent ");
      }
    }
    return _builder;
  }
  
  protected CharSequence _declaration(final TemplateDeclaration it) {
    StringConcatenation _builder = new StringConcatenation();
    RedefinedTemplate _declaredTemplate = it.getDeclaredTemplate();
    CharSequence _name = this.name(_declaredTemplate);
    _builder.append(_name, "");
    {
      RedefinedTemplate _declaredTemplate_1 = it.getDeclaredTemplate();
      EList<Parameter> _parameter = _declaredTemplate_1.getParameter();
      int _size = _parameter.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("(");
        {
          List<Parameter> _elvis = null;
          RedefinedTemplate _declaredTemplate_2 = it.getDeclaredTemplate();
          EList<Parameter> _parameter_1 = _declaredTemplate_2.getParameter();
          if (_parameter_1 != null) {
            _elvis = _parameter_1;
          } else {
            List<Parameter> _emptyList = CollectionLiterals.<Parameter>emptyList();
            _elvis = _emptyList;
          }
          boolean _hasElements = false;
          for(final Parameter i : _elvis) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            CharSequence _parameter_2 = this.parameter(i);
            _builder.append(_parameter_2, "");
          }
        }
        _builder.append(")");
      }
    }
    _builder.append(" = ");
    RedefinedTemplate _declaredTemplate_3 = it.getDeclaredTemplate();
    AbstractTemplate _referredTemplate = _declaredTemplate_3.getReferredTemplate();
    CharSequence _name_1 = this.name(_referredTemplate);
    _builder.append(_name_1, "");
    _builder.append("(");
    {
      List<Expression> _elvis_1 = null;
      EList<Expression> _argument = it.getArgument();
      if (_argument != null) {
        _elvis_1 = _argument;
      } else {
        List<Expression> _emptyList_1 = CollectionLiterals.<Expression>emptyList();
        _elvis_1 = _emptyList_1;
      }
      boolean _hasElements_1 = false;
      for(final Expression i_1 : _elvis_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _expression = this.expression(i_1);
        _builder.append(_expression, "");
      }
    }
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence _channelPriority(final ChannelPriority it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("chan priority ");
    {
      List<ChannelPriorityItem> _elvis = null;
      EList<ChannelPriorityItem> _item = it.getItem();
      if (_item != null) {
        _elvis = _item;
      } else {
        List<ChannelPriorityItem> _emptyList = CollectionLiterals.<ChannelPriorityItem>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final ChannelPriorityItem i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" < ", "");
        }
        CharSequence _item_1 = this.item(i);
        _builder.append(_item_1, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _channelPriority(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _item(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _item(final ChannelList it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<IdentifierExpression> _elvis = null;
      EList<IdentifierExpression> _channelExpression = it.getChannelExpression();
      if (_channelExpression != null) {
        _elvis = _channelExpression;
      } else {
        List<IdentifierExpression> _emptyList = CollectionLiterals.<IdentifierExpression>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final IdentifierExpression i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _expression = this.expression(i);
        _builder.append(_expression, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _item(final DefaultChannelPriority it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("default");
    return _builder;
  }
  
  protected CharSequence _typedefinition(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _typedefinition(final TypeReference it) {
    StringConcatenation _builder = new StringConcatenation();
    Type _referredType = it.getReferredType();
    CharSequence _typename = this.typename(_referredType);
    _builder.append(_typename, "");
    return _builder;
  }
  
  protected CharSequence _typedefinition(final RangeTypeSpecification it) {
    StringConcatenation _builder = new StringConcatenation();
    BuiltInType _baseType = it.getBaseType();
    String _string = _baseType.toString();
    _builder.append(_string, "");
    _builder.append("[");
    IntegerBounds _bounds = it.getBounds();
    Expression _lowerBound = _bounds.getLowerBound();
    CharSequence _expression = this.expression(_lowerBound);
    _builder.append(_expression, "");
    _builder.append(",");
    IntegerBounds _bounds_1 = it.getBounds();
    Expression _upperBound = _bounds_1.getUpperBound();
    CharSequence _expression_1 = this.expression(_upperBound);
    _builder.append(_expression_1, "");
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _typedefinition(final ScalarTypeSpecification it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("scalar [");
    Expression _sizeExpression = it.getSizeExpression();
    CharSequence _expression = this.expression(_sizeExpression);
    _builder.append(_expression, "");
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _typedefinition(final StructTypeSpecification it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("struct {");
    _builder.newLine();
    {
      List<DataVariableDeclaration> _elvis = null;
      EList<DataVariableDeclaration> _declaration = it.getDeclaration();
      if (_declaration != null) {
        _elvis = _declaration;
      } else {
        List<DataVariableDeclaration> _emptyList = CollectionLiterals.<DataVariableDeclaration>emptyList();
        _elvis = _emptyList;
      }
      for(final DataVariableDeclaration i : _elvis) {
        _builder.append("\t");
        Object _declaration_1 = this.declaration(i);
        _builder.append(_declaration_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence typename(final Type it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence variable(final Variable it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _name = this.name(it);
    _builder.append(_name, "");
    {
      List<Index> _elvis = null;
      EList<Index> _index = it.getIndex();
      if (_index != null) {
        _elvis = _index;
      } else {
        List<Index> _emptyList = CollectionLiterals.<Index>emptyList();
        _elvis = _emptyList;
      }
      for(final Index i : _elvis) {
        CharSequence _index_1 = this.index(i);
        _builder.append(_index_1, "");
      }
    }
    {
      Initializer _initializer = it.getInitializer();
      boolean _notEquals = (!Objects.equal(_initializer, null));
      if (_notEquals) {
        _builder.append(" = ");
        Initializer _initializer_1 = it.getInitializer();
        CharSequence _initializer_2 = this.initializer(_initializer_1);
        _builder.append(_initializer_2, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _index(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _index(final ValueIndex it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    Expression _sizeExpression = it.getSizeExpression();
    Object _expression = this.expression(_sizeExpression);
    _builder.append(_expression, "");
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _index(final TypeIndex it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    TypeDefinition _typeDefinition = it.getTypeDefinition();
    Object _typedefinition = this.typedefinition(_typeDefinition);
    _builder.append(_typedefinition, "");
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _initializer(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _initializer(final ExpressionInitializer it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _expression = it.getExpression();
    Object _expression_1 = this.expression(_expression);
    _builder.append(_expression_1, "");
    return _builder;
  }
  
  protected CharSequence _initializer(final ArrayInitializer it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      List<Initializer> _elvis = null;
      EList<Initializer> _initializer = it.getInitializer();
      if (_initializer != null) {
        _elvis = _initializer;
      } else {
        List<Initializer> _emptyList = CollectionLiterals.<Initializer>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final Initializer i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        Object _initializer_1 = this.initializer(i);
        _builder.append(_initializer_1, "");
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  /**
   * define templates
   */
  public CharSequence template(final Template it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<template>");
    _builder.newLine();
    _builder.append("<name>");
    CharSequence _name = this.name(it);
    _builder.append(_name, "");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    {
      EList<Parameter> _parameter = it.getParameter();
      int _size = _parameter.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("<parameter>");
        _builder.newLine();
        {
          List<Parameter> _elvis = null;
          EList<Parameter> _parameter_1 = it.getParameter();
          if (_parameter_1 != null) {
            _elvis = _parameter_1;
          } else {
            List<Parameter> _emptyList = CollectionLiterals.<Parameter>emptyList();
            _elvis = _emptyList;
          }
          boolean _hasElements = false;
          for(final Parameter i : _elvis) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            CharSequence _parameter_2 = this.parameter(i);
            _builder.append(_parameter_2, "");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("</parameter>");
        _builder.newLine();
      }
    }
    _builder.append("<declaration>");
    _builder.newLine();
    LocalDeclarations _declarations = it.getDeclarations();
    CharSequence _declarations_1 = this.declarations(_declarations);
    _builder.append(_declarations_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</declaration>\t");
    _builder.newLine();
    {
      List<Location> _elvis_1 = null;
      EList<Location> _location = it.getLocation();
      if (_location != null) {
        _elvis_1 = _location;
      } else {
        List<Location> _emptyList_1 = CollectionLiterals.<Location>emptyList();
        _elvis_1 = _emptyList_1;
      }
      for(final Location i_1 : _elvis_1) {
        CharSequence _location_1 = this.location(i_1);
        _builder.append(_location_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<init ref=\"");
    Location _init = it.getInit();
    String _name_1 = _init.getName();
    String _plus = (_name_1 + "_");
    String _name_2 = it.getName();
    String _plus_1 = (_plus + _name_2);
    _builder.append(_plus_1, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    {
      List<Edge> _elvis_2 = null;
      EList<Edge> _edge = it.getEdge();
      if (_edge != null) {
        _elvis_2 = _edge;
      } else {
        List<Edge> _emptyList_2 = CollectionLiterals.<Edge>emptyList();
        _elvis_2 = _emptyList_2;
      }
      for(final Edge i_2 : _elvis_2) {
        CharSequence _edge_1 = this.edge(i_2);
        _builder.append(_edge_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</template>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence parameter(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    VariableDeclaration _variableDeclaration = it.getVariableDeclaration();
    CallType _callType = it.getCallType();
    boolean _equals = Objects.equal(_callType, CallType.CALL_BY_REFERENCE);
    CharSequence _declaration = this.declaration(_variableDeclaration, Boolean.valueOf(_equals));
    _builder.append(_declaration, "");
    return _builder;
  }
  
  public CharSequence id(final Location it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("_");
    Template _parentTemplate = it.getParentTemplate();
    String _name_1 = _parentTemplate.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  public CharSequence name(final NamedElement it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getName();
    String _replaceAll = _name.replaceAll("\\.", "");
    _builder.append(_replaceAll, "");
    return _builder;
  }
  
  public CharSequence location(final Location it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<location id=\"");
    CharSequence _id = this.id(it);
    _builder.append(_id, "");
    _builder.append("\" x=\"");
    Object _xifexpression = null;
    Point _position = it.getPosition();
    boolean _equals = Objects.equal(_position, null);
    if (_equals) {
      _xifexpression = "";
    } else {
      Point _position_1 = it.getPosition();
      _xifexpression = Integer.valueOf(_position_1.getX());
    }
    _builder.append(_xifexpression, "");
    _builder.append("\" y=\"");
    Object _xifexpression_1 = null;
    Point _position_2 = it.getPosition();
    boolean _equals_1 = Objects.equal(_position_2, null);
    if (_equals_1) {
      _xifexpression_1 = "";
    } else {
      Point _position_3 = it.getPosition();
      _xifexpression_1 = Integer.valueOf(_position_3.getY());
    }
    _builder.append(_xifexpression_1, "");
    _builder.append("\" ");
    {
      String _colorToString = this.colorToString(it);
      boolean _notEquals = (!Objects.equal(_colorToString, null));
      if (_notEquals) {
        _builder.append("color=\"");
        String _colorToString_1 = this.colorToString(it);
        _builder.append(_colorToString_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<name>");
    CharSequence _name = this.name(it);
    _builder.append(_name, "\t");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Expression _invariant = it.getInvariant();
      boolean _equals_2 = Objects.equal(_invariant, null);
      boolean _not = (!_equals_2);
      if (_not) {
        _builder.append("<label kind=\"invariant\">");
        Expression _invariant_1 = it.getInvariant();
        CharSequence _expression = this.expression(_invariant_1);
        _builder.append(_expression, "\t");
        _builder.append("</label>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      LocationKind _locationTimeKind = it.getLocationTimeKind();
      boolean _equals_3 = Objects.equal(_locationTimeKind, LocationKind.URGENT);
      if (_equals_3) {
        _builder.append("<urgent/>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      LocationKind _locationTimeKind_1 = it.getLocationTimeKind();
      boolean _equals_4 = Objects.equal(_locationTimeKind_1, LocationKind.COMMITED);
      if (_equals_4) {
        _builder.append("<committed/>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</location>");
    _builder.newLine();
    return _builder;
  }
  
  public String colorToString(final Location it) {
    ColorKind _color = it.getColor();
    boolean _equals = Objects.equal(_color, null);
    if (_equals) {
      return null;
    }
    ColorKind _color_1 = it.getColor();
    if (_color_1 != null) {
      switch (_color_1) {
        case BLACK:
          return "#000000";
        case BLUE:
          return "#0000ff";
        case CYAN:
          return "#00ffff";
        case DARKGREY:
          return "#a9a9a9";
        case DEFAULT:
          return null;
        case GREEN:
          return "#00ff00";
        case LIGHTGREY:
          return "#c0c0c0";
        case MAGENTA:
          return "#ff00ff";
        case ORANGE:
          return "#ffa500";
        case PINK:
          return "#ffc0cb";
        case RED:
          return "#ff0000";
        case SELF_DEFINED:
          return it.getColorCode();
        case WHITE:
          return "#ffffff";
        case YELLOW:
          return "#ffff00";
        default:
          return null;
      }
    } else {
      return null;
    }
  }
  
  public CharSequence edge(final Edge it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("<source ref=\"");
    Location _source = it.getSource();
    CharSequence _id = this.id(_source);
    _builder.append(_id, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<target ref=\"");
    Location _target = it.getTarget();
    CharSequence _id_1 = this.id(_target);
    _builder.append(_id_1, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    {
      EList<Selection> _selection = it.getSelection();
      boolean _equals = Objects.equal(_selection, null);
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("<label kind=\"select\"");
        {
          if (this.moveEdgeLabelsAway) {
            _builder.append(" x=\"-100\" y=\"-100\"");
          }
        }
        _builder.append(">");
        {
          List<Selection> _elvis = null;
          EList<Selection> _selection_1 = it.getSelection();
          if (_selection_1 != null) {
            _elvis = _selection_1;
          } else {
            List<Selection> _emptyList = CollectionLiterals.<Selection>emptyList();
            _elvis = _emptyList;
          }
          boolean _hasElements = false;
          for(final Selection i : _elvis) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            CharSequence _selection_2 = this.selection(i);
            _builder.append(_selection_2, "");
          }
        }
        _builder.append("</label>");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Expression _guard = it.getGuard();
      boolean _equals_1 = Objects.equal(_guard, null);
      boolean _not_1 = (!_equals_1);
      if (_not_1) {
        _builder.append("<label kind=\"guard\"");
        {
          if (this.moveEdgeLabelsAway) {
            _builder.append(" x=\"-100\" y=\"-100\"");
          }
        }
        _builder.append(">");
        Expression _guard_1 = it.getGuard();
        CharSequence _expression = this.expression(_guard_1);
        _builder.append(_expression, "");
        _builder.append("</label>");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Synchronization _synchronization = it.getSynchronization();
      boolean _equals_2 = Objects.equal(_synchronization, null);
      boolean _not_2 = (!_equals_2);
      if (_not_2) {
        _builder.append("<label kind=\"synchronisation\"");
        {
          if (this.moveEdgeLabelsAway) {
            _builder.append(" x=\"-100\" y=\"-100\"");
          }
        }
        _builder.append(">");
        Synchronization _synchronization_1 = it.getSynchronization();
        CharSequence _synchronization_2 = this.synchronization(_synchronization_1);
        _builder.append(_synchronization_2, "");
        _builder.append("</label>");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Expression> _update = it.getUpdate();
      boolean _equals_3 = Objects.equal(_update, null);
      boolean _not_3 = (!_equals_3);
      if (_not_3) {
        _builder.append("<label kind=\"assignment\"");
        {
          if (this.moveEdgeLabelsAway) {
            _builder.append(" x=\"-100\" y=\"-100\"");
          }
        }
        _builder.append(">");
        {
          List<Expression> _elvis_1 = null;
          EList<Expression> _update_1 = it.getUpdate();
          if (_update_1 != null) {
            _elvis_1 = _update_1;
          } else {
            List<Expression> _emptyList_1 = CollectionLiterals.<Expression>emptyList();
            _elvis_1 = _emptyList_1;
          }
          boolean _hasElements_1 = false;
          for(final Expression i_1 : _elvis_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.newLineIfNotEmpty();
            CharSequence _expression_1 = this.expression(i_1);
            _builder.append(_expression_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</label>");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Point> _bendPoint = it.getBendPoint();
      boolean _equals_4 = Objects.equal(_bendPoint, null);
      boolean _not_4 = (!_equals_4);
      if (_not_4) {
        {
          List<Point> _elvis_2 = null;
          EList<Point> _bendPoint_1 = it.getBendPoint();
          if (_bendPoint_1 != null) {
            _elvis_2 = _bendPoint_1;
          } else {
            List<Point> _emptyList_2 = CollectionLiterals.<Point>emptyList();
            _elvis_2 = _emptyList_2;
          }
          for(final Point i_2 : _elvis_2) {
            _builder.append("<nail x=\"");
            int _x = i_2.getX();
            _builder.append(_x, "");
            _builder.append("\" y=\"");
            int _y = i_2.getY();
            _builder.append(_y, "");
            _builder.append("\"/>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</transition>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence selection(final Selection it) {
    StringConcatenation _builder = new StringConcatenation();
    EList<Variable> _variable = it.getVariable();
    Variable _get = _variable.get(0);
    CharSequence _variable_1 = this.variable(_get);
    _builder.append(_variable_1, "");
    _builder.append(" : ");
    TypeDefinition _typeDefinition = it.getTypeDefinition();
    CharSequence _typedefinition = this.typedefinition(_typeDefinition);
    _builder.append(_typedefinition, "");
    return _builder;
  }
  
  public CharSequence synchronization(final Synchronization it) {
    StringConcatenation _builder = new StringConcatenation();
    IdentifierExpression _channelExpression = it.getChannelExpression();
    CharSequence _expression = this.expression(_channelExpression);
    _builder.append(_expression, "");
    {
      SynchronizationKind _kind = it.getKind();
      boolean _equals = Objects.equal(_kind, SynchronizationKind.RECEIVE);
      if (_equals) {
        _builder.append("?");
      } else {
        _builder.append("!");
      }
    }
    return _builder;
  }
  
  protected CharSequence _statement(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _statement(final Block it) {
    StringConcatenation _builder = new StringConcatenation();
    Object _block = this.block(it);
    _builder.append(_block, "");
    return _builder;
  }
  
  protected CharSequence _statement(final ExpressionStatement it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _expression = it.getExpression();
    CharSequence _expression_1 = this.expression(_expression);
    _builder.append(_expression_1, "");
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _statement(final EmptyStatement it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _statement(final ForLoop it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(");
    Expression _initialization = it.getInitialization();
    CharSequence _expression = this.expression(_initialization);
    _builder.append(_expression, "");
    _builder.append("; ");
    Expression _condition = it.getCondition();
    CharSequence _expression_1 = this.expression(_condition);
    _builder.append(_expression_1, "");
    _builder.append("; ");
    Expression _iteration = it.getIteration();
    CharSequence _expression_2 = this.expression(_iteration);
    _builder.append(_expression_2, "");
    _builder.append(") ");
    {
      Statement _statement = it.getStatement();
      if ((!(_statement instanceof Block))) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    Statement _statement_1 = it.getStatement();
    Object _statement_2 = this.statement(_statement_1);
    _builder.append(_statement_2, "");
    return _builder;
  }
  
  protected CharSequence _statement(final Iteration it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(");
    EList<Variable> _variable = it.getVariable();
    Variable _get = _variable.get(0);
    CharSequence _variable_1 = this.variable(_get);
    _builder.append(_variable_1, "");
    _builder.append(" : ");
    TypeDefinition _typeDefinition = it.getTypeDefinition();
    CharSequence _typedefinition = this.typedefinition(_typeDefinition);
    _builder.append(_typedefinition, "");
    _builder.append(") ");
    {
      Statement _statement = it.getStatement();
      if ((!(_statement instanceof Block))) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    Statement _statement_1 = it.getStatement();
    Object _statement_2 = this.statement(_statement_1);
    _builder.append(_statement_2, "");
    return _builder;
  }
  
  protected CharSequence _statement(final WhileLoop it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while(");
    Expression _expression = it.getExpression();
    CharSequence _expression_1 = this.expression(_expression);
    _builder.append(_expression_1, "");
    _builder.append(") ");
    {
      Statement _statement = it.getStatement();
      if ((!(_statement instanceof Block))) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    Statement _statement_1 = it.getStatement();
    Object _statement_2 = this.statement(_statement_1);
    _builder.append(_statement_2, "");
    return _builder;
  }
  
  protected CharSequence _statement(final DoWhileLoop it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("do ");
    Statement _statement = it.getStatement();
    Object _statement_1 = this.statement(_statement);
    _builder.append(_statement_1, "");
    _builder.append(" while (");
    Expression _expression = it.getExpression();
    CharSequence _expression_1 = this.expression(_expression);
    _builder.append(_expression_1, "");
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence _statement(final IfStatement it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    Expression _ifExpression = it.getIfExpression();
    CharSequence _expression = this.expression(_ifExpression);
    _builder.append(_expression, "");
    _builder.append(") ");
    {
      Statement _thenStatement = it.getThenStatement();
      if ((!(_thenStatement instanceof Block))) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    Statement _thenStatement_1 = it.getThenStatement();
    Object _statement = this.statement(_thenStatement_1);
    _builder.append(_statement, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      Statement _elseStatement = it.getElseStatement();
      boolean _notEquals = (!Objects.equal(_elseStatement, null));
      if (_notEquals) {
        _builder.append("else ");
        {
          Statement _elseStatement_1 = it.getElseStatement();
          if ((!(_elseStatement_1 instanceof Block))) {
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
          }
        }
        Statement _elseStatement_2 = it.getElseStatement();
        Object _statement_1 = this.statement(_elseStatement_2);
        _builder.append(_statement_1, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _statement(final ReturnStatement it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return ");
    {
      Expression _returnExpression = it.getReturnExpression();
      boolean _notEquals = (!Objects.equal(_returnExpression, null));
      if (_notEquals) {
        Expression _returnExpression_1 = it.getReturnExpression();
        CharSequence _expression = this.expression(_returnExpression_1);
        _builder.append(_expression, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  /**
   * expressions
   */
  public CharSequence expressionOptionalParentheses(final Expression it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      EObject _eContainer = it.eContainer();
      if (!(_eContainer instanceof Expression)) {
        _and = false;
      } else {
        int _precedence = this.precedence(it);
        EObject _eContainer_1 = it.eContainer();
        int _precedence_1 = this.precedence(((Expression) _eContainer_1));
        boolean _lessThan = (_precedence < _precedence_1);
        _and = _lessThan;
      }
      if (_and) {
        _builder.append("(");
        Object _expression = this.expression(it);
        _builder.append(_expression, "");
        _builder.append(")");
      } else {
        Object _expression_1 = this.expression(it);
        _builder.append(_expression_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence expressionOptionalParenthesesNonAssoc(final Expression it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      EObject _eContainer = it.eContainer();
      if (!(_eContainer instanceof Expression)) {
        _and = false;
      } else {
        boolean _or = false;
        int _precedence = this.precedence(it);
        EObject _eContainer_1 = it.eContainer();
        int _precedence_1 = this.precedence(((Expression) _eContainer_1));
        boolean _lessThan = (_precedence < _precedence_1);
        if (_lessThan) {
          _or = true;
        } else {
          boolean _and_1 = false;
          int _precedence_2 = this.precedence(it);
          EObject _eContainer_2 = it.eContainer();
          int _precedence_3 = this.precedence(((Expression) _eContainer_2));
          boolean _equals = (_precedence_2 == _precedence_3);
          if (!_equals) {
            _and_1 = false;
          } else {
            EObject _eContainer_3 = it.eContainer();
            boolean _isAssociative = this.isAssociative(((Expression) _eContainer_3));
            boolean _not = (!_isAssociative);
            _and_1 = _not;
          }
          _or = _and_1;
        }
        _and = _or;
      }
      if (_and) {
        _builder.append("(");
        Object _expression = this.expression(it);
        _builder.append(_expression, "");
        _builder.append(")");
      } else {
        Object _expression_1 = this.expression(it);
        _builder.append(_expression_1, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _expression(final Void it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _expression(final AssignmentExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" ");
    AssignmentOperator _operator = it.getOperator();
    String _assignment = this.assignment(_operator);
    _builder.append(_assignment, "");
    _builder.append(" ");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParentheses_1 = this.expressionOptionalParentheses(_secondExpr);
    _builder.append(_expressionOptionalParentheses_1, "");
    return _builder;
  }
  
  protected CharSequence _expression(final IdentifierExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    NamedElement _identifier = it.getIdentifier();
    CharSequence _name = this.name(_identifier);
    _builder.append(_name, "");
    {
      EList<Expression> _index = it.getIndex();
      boolean _isEmpty = _index.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("[");
        {
          List<Expression> _elvis = null;
          EList<Expression> _index_1 = it.getIndex();
          if (_index_1 != null) {
            _elvis = _index_1;
          } else {
            List<Expression> _emptyList = CollectionLiterals.<Expression>emptyList();
            _elvis = _emptyList;
          }
          boolean _hasElements = false;
          for(final Expression i : _elvis) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("][", "");
            }
            Object _expression = this.expression(i);
            _builder.append(_expression, "");
          }
        }
        _builder.append("]");
      }
    }
    return _builder;
  }
  
  protected CharSequence _expression(final NegationExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("not ");
    Expression _negatedExpression = it.getNegatedExpression();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_negatedExpression);
    _builder.append(_expressionOptionalParentheses, "");
    return _builder;
  }
  
  protected CharSequence _expression(final FunctionCallExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Function _function = it.getFunction();
    String _name = _function.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      List<Expression> _elvis = null;
      EList<Expression> _argument = it.getArgument();
      if (_argument != null) {
        _elvis = _argument;
      } else {
        List<Expression> _emptyList = CollectionLiterals.<Expression>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final Expression i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        Object _expression = this.expression(i);
        _builder.append(_expression, "");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _expression(final LogicalExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" ");
    LogicalOperator _operator = it.getOperator();
    String _string = _operator.toString();
    _builder.append(_string, "");
    _builder.append(" ");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParenthesesNonAssoc = this.expressionOptionalParenthesesNonAssoc(_secondExpr);
    _builder.append(_expressionOptionalParenthesesNonAssoc, "");
    return _builder;
  }
  
  protected CharSequence _expression(final CompareExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" ");
    CompareOperator _operator = it.getOperator();
    String _comparison = this.comparison(_operator);
    _builder.append(_comparison, "");
    _builder.append(" ");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParenthesesNonAssoc = this.expressionOptionalParenthesesNonAssoc(_secondExpr);
    _builder.append(_expressionOptionalParenthesesNonAssoc, "");
    return _builder;
  }
  
  protected CharSequence _expression(final ArithmeticExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    ArithmeticOperator _operator = it.getOperator();
    String _arithmetic = this.arithmetic(_operator);
    _builder.append(_arithmetic, "");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParenthesesNonAssoc = this.expressionOptionalParenthesesNonAssoc(_secondExpr);
    _builder.append(_expressionOptionalParenthesesNonAssoc, "");
    return _builder;
  }
  
  protected CharSequence _expression(final LiteralExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    String _text = it.getText();
    _builder.append(_text, "");
    return _builder;
  }
  
  protected CharSequence _expression(final IncrementDecrementExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      IncrementDecrementPosition _position = it.getPosition();
      boolean _equals = Objects.equal(_position, IncrementDecrementPosition.PRE);
      if (_equals) {
        IncrementDecrementOperator _operator = it.getOperator();
        CharSequence _operator_1 = this.operator(_operator);
        _builder.append(_operator_1, "");
      }
    }
    Expression _expression = it.getExpression();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_expression);
    _builder.append(_expressionOptionalParentheses, "");
    {
      IncrementDecrementPosition _position_1 = it.getPosition();
      boolean _equals_1 = Objects.equal(_position_1, IncrementDecrementPosition.POST);
      if (_equals_1) {
        IncrementDecrementOperator _operator_2 = it.getOperator();
        CharSequence _operator_3 = this.operator(_operator_2);
        _builder.append(_operator_3, "");
      }
    }
    return _builder;
  }
  
  public CharSequence operator(final IncrementDecrementOperator it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equal(it, IncrementDecrementOperator.INCREMENT);
      if (_equals) {
        _builder.append("++");
      }
    }
    {
      boolean _equals_1 = Objects.equal(it, IncrementDecrementOperator.DECREMENT);
      if (_equals_1) {
        _builder.append("--");
      }
    }
    return _builder;
  }
  
  protected CharSequence _expression(final ConditionExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _ifExpression = it.getIfExpression();
    CharSequence _expressionOptionalParenthesesNonAssoc = this.expressionOptionalParenthesesNonAssoc(_ifExpression);
    _builder.append(_expressionOptionalParenthesesNonAssoc, "");
    _builder.append(" ? ");
    Expression _thenExpression = it.getThenExpression();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_thenExpression);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" : ");
    Expression _elseExpression = it.getElseExpression();
    CharSequence _expressionOptionalParentheses_1 = this.expressionOptionalParentheses(_elseExpression);
    _builder.append(_expressionOptionalParentheses_1, "");
    return _builder;
  }
  
  protected CharSequence _expression(final ScopedIdentifierExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _scope = it.getScope();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_scope);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(".");
    IdentifierExpression _identifier = it.getIdentifier();
    CharSequence _expressionOptionalParentheses_1 = this.expressionOptionalParentheses(_identifier);
    _builder.append(_expressionOptionalParentheses_1, "");
    return _builder;
  }
  
  protected CharSequence _expression(final QuantificationExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Quantifier _quantifier = it.getQuantifier();
    CharSequence _quantifier_1 = this.quantifier(_quantifier);
    _builder.append(_quantifier_1, "");
    _builder.append(" (");
    EList<Variable> _variable = it.getVariable();
    Variable _get = _variable.get(0);
    CharSequence _variable_1 = this.variable(_get);
    _builder.append(_variable_1, "");
    _builder.append(" : ");
    TypeDefinition _typeDefinition = it.getTypeDefinition();
    Object _typedefinition = this.typedefinition(_typeDefinition);
    _builder.append(_typedefinition, "");
    _builder.append(") ");
    Expression _expression = it.getExpression();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_expression);
    _builder.append(_expressionOptionalParentheses, "");
    return _builder;
  }
  
  public CharSequence quantifier(final Quantifier it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equal(it, Quantifier.UNIVERSAL);
      if (_equals) {
        _builder.append("forall");
      }
    }
    {
      boolean _equals_1 = Objects.equal(it, Quantifier.EXISTENTIAL);
      if (_equals_1) {
        _builder.append("exists");
      }
    }
    return _builder;
  }
  
  protected CharSequence _expression(final PlusExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("+");
    Expression _confirmedExpression = it.getConfirmedExpression();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_confirmedExpression);
    _builder.append(_expressionOptionalParentheses, "");
    return _builder;
  }
  
  protected CharSequence _expression(final MinusExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-");
    Expression _invertedExpression = it.getInvertedExpression();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_invertedExpression);
    _builder.append(_expressionOptionalParentheses, "");
    return _builder;
  }
  
  protected CharSequence _expression(final MinMaxExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" ");
    {
      MinMaxOperator _operator = it.getOperator();
      boolean _equals = Objects.equal(_operator, MinMaxOperator.MIN);
      if (_equals) {
        _builder.append("<?");
      }
    }
    {
      MinMaxOperator _operator_1 = it.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, MinMaxOperator.MAX);
      if (_equals_1) {
        _builder.append(">?");
      }
    }
    _builder.append(" ");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParenthesesNonAssoc = this.expressionOptionalParenthesesNonAssoc(_secondExpr);
    _builder.append(_expressionOptionalParenthesesNonAssoc, "");
    return _builder;
  }
  
  protected CharSequence _expression(final BitwiseExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" ");
    {
      BitwiseOperator _operator = it.getOperator();
      boolean _equals = Objects.equal(_operator, BitwiseOperator.AND);
      if (_equals) {
        _builder.append("&");
      }
    }
    {
      BitwiseOperator _operator_1 = it.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, BitwiseOperator.OR);
      if (_equals_1) {
        _builder.append("|");
      }
    }
    {
      BitwiseOperator _operator_2 = it.getOperator();
      boolean _equals_2 = Objects.equal(_operator_2, BitwiseOperator.XOR);
      if (_equals_2) {
        _builder.append("^");
      }
    }
    _builder.append(" ");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParentheses_1 = this.expressionOptionalParentheses(_secondExpr);
    _builder.append(_expressionOptionalParentheses_1, "");
    return _builder;
  }
  
  protected CharSequence _expression(final BitShiftExpression it) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpr = it.getFirstExpr();
    CharSequence _expressionOptionalParentheses = this.expressionOptionalParentheses(_firstExpr);
    _builder.append(_expressionOptionalParentheses, "");
    _builder.append(" ");
    {
      BitShiftOperator _operator = it.getOperator();
      boolean _equals = Objects.equal(_operator, BitShiftOperator.LEFT);
      if (_equals) {
        _builder.append("<<");
      }
    }
    {
      BitShiftOperator _operator_1 = it.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, BitShiftOperator.RIGHT);
      if (_equals_1) {
        _builder.append(">>");
      }
    }
    _builder.append(" ");
    Expression _secondExpr = it.getSecondExpr();
    CharSequence _expressionOptionalParenthesesNonAssoc = this.expressionOptionalParenthesesNonAssoc(_secondExpr);
    _builder.append(_expressionOptionalParenthesesNonAssoc, "");
    return _builder;
  }
  
  /**
   * define system
   */
  public CharSequence system(final de.uni_paderborn.uppaal.declarations.system.System it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("system ");
    {
      List<InstantiationList> _elvis = null;
      EList<InstantiationList> _instantiationList = it.getInstantiationList();
      if (_instantiationList != null) {
        _elvis = _instantiationList;
      } else {
        List<InstantiationList> _emptyList = CollectionLiterals.<InstantiationList>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final InstantiationList i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" < ", "");
        }
        CharSequence _instantiationList_1 = this.instantiationList(i);
        _builder.append(_instantiationList_1, "");
      }
    }
    _builder.append(";");
    return _builder;
  }
  
  public CharSequence instantiationList(final InstantiationList it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<AbstractTemplate> _elvis = null;
      EList<AbstractTemplate> _template = it.getTemplate();
      if (_template != null) {
        _elvis = _template;
      } else {
        List<AbstractTemplate> _emptyList = CollectionLiterals.<AbstractTemplate>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final AbstractTemplate i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _name = this.name(i);
        _builder.append(_name, "");
      }
    }
    return _builder;
  }
  
  public CharSequence progressMeasure(final ProgressMeasure it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("progress {");
    {
      List<Expression> _elvis = null;
      EList<Expression> _expression = it.getExpression();
      if (_expression != null) {
        _elvis = _expression;
      } else {
        List<Expression> _emptyList = CollectionLiterals.<Expression>emptyList();
        _elvis = _emptyList;
      }
      boolean _hasElements = false;
      for(final Expression i : _elvis) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(";", "");
        }
        CharSequence _expression_1 = this.expression(i);
        _builder.append(_expression_1, "");
      }
    }
    _builder.append(";}");
    return _builder;
  }
  
  public String assignment(final AssignmentOperator op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case EQUAL:
          _switchResult = "=";
          break;
        case PLUS_EQUAL:
          _switchResult = "+=";
          break;
        case MINUS_EQUAL:
          _switchResult = "-=";
          break;
        case TIMES_EQUAL:
          _switchResult = "*=";
          break;
        case DIVIDE_EQUAL:
          _switchResult = "/=";
          break;
        case MODULO_EQUAL:
          _switchResult = "%=";
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
          _switchResult = "&gt;";
          break;
        case GREATER_OR_EQUAL:
          _switchResult = "&gt;=";
          break;
        case LESS:
          _switchResult = "&lt;";
          break;
        case LESS_OR_EQUAL:
          _switchResult = "&lt;=";
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
  
  public String arithmetic(final ArithmeticOperator op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case ADD:
          _switchResult = "+";
          break;
        case SUBTRACT:
          _switchResult = "-";
          break;
        case MULTIPLICATE:
          _switchResult = "*";
          break;
        case DIVIDE:
          _switchResult = "/";
          break;
        case MODULO:
          _switchResult = "%";
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
  
  public boolean isAssociative(final Expression it) {
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof ArithmeticExpression) {
        _matched=true;
        boolean _or = false;
        ArithmeticOperator _operator = ((ArithmeticExpression)it).getOperator();
        boolean _equals = Objects.equal(_operator, ArithmeticOperator.MULTIPLICATE);
        if (_equals) {
          _or = true;
        } else {
          ArithmeticOperator _operator_1 = ((ArithmeticExpression)it).getOperator();
          boolean _equals_1 = Objects.equal(_operator_1, ArithmeticOperator.ADD);
          _or = _equals_1;
        }
        return _or;
      }
    }
    if (!_matched) {
      if (it instanceof ConditionExpression) {
        _matched=true;
        return false;
      }
    }
    if (!_matched) {
      if (it instanceof BitShiftExpression) {
        _matched=true;
        return false;
      }
    }
    if (!_matched) {
      if (it instanceof MinMaxExpression) {
        _matched=true;
        return false;
      }
    }
    if (!_matched) {
      if (it instanceof CompareExpression) {
        _matched=true;
        return false;
      }
    }
    if (!_matched) {
      if (it instanceof LogicalExpression) {
        _matched=true;
        LogicalOperator _operator = ((LogicalExpression)it).getOperator();
        return (!Objects.equal(_operator, LogicalOperator.IMPLY));
      }
    }
    return true;
  }
  
  public int precedence(final Expression it) {
    boolean _matched = false;
    if (!_matched) {
      boolean _equals = Objects.equal(it, null);
      if (_equals) {
        _matched=true;
        return 1000;
      }
    }
    if (!_matched) {
      if ((it instanceof IdentifierExpression)) {
        _matched=true;
        return 500;
      }
    }
    if (!_matched) {
      if ((it instanceof ScopedIdentifierExpression)) {
        _matched=true;
        return 500;
      }
    }
    if (!_matched) {
      if ((it instanceof LiteralExpression)) {
        _matched=true;
        return 500;
      }
    }
    if (!_matched) {
      if ((it instanceof FunctionCallExpression)) {
        _matched=true;
        return 500;
      }
    }
    if (!_matched) {
      if ((it instanceof IncrementDecrementExpression)) {
        _matched=true;
        return 300;
      }
    }
    if (!_matched) {
      if ((it instanceof PlusExpression)) {
        _matched=true;
        return 300;
      }
    }
    if (!_matched) {
      if ((it instanceof MinusExpression)) {
        _matched=true;
        return 300;
      }
    }
    if (!_matched) {
      boolean _and = false;
      if (!(it instanceof ArithmeticExpression)) {
        _and = false;
      } else {
        boolean _or = false;
        boolean _or_1 = false;
        ArithmeticOperator _operator = ((ArithmeticExpression) it).getOperator();
        boolean _equals_1 = Objects.equal(_operator, ArithmeticOperator.MULTIPLICATE);
        if (_equals_1) {
          _or_1 = true;
        } else {
          ArithmeticOperator _operator_1 = ((ArithmeticExpression) it).getOperator();
          boolean _equals_2 = Objects.equal(_operator_1, ArithmeticOperator.DIVIDE);
          _or_1 = _equals_2;
        }
        if (_or_1) {
          _or = true;
        } else {
          ArithmeticOperator _operator_2 = ((ArithmeticExpression) it).getOperator();
          boolean _equals_3 = Objects.equal(_operator_2, ArithmeticOperator.MODULO);
          _or = _equals_3;
        }
        _and = _or;
      }
      if (_and) {
        _matched=true;
        return 290;
      }
    }
    if (!_matched) {
      boolean _and_1 = false;
      if (!(it instanceof ArithmeticExpression)) {
        _and_1 = false;
      } else {
        boolean _or_2 = false;
        ArithmeticOperator _operator_3 = ((ArithmeticExpression) it).getOperator();
        boolean _equals_4 = Objects.equal(_operator_3, ArithmeticOperator.SUBTRACT);
        if (_equals_4) {
          _or_2 = true;
        } else {
          ArithmeticOperator _operator_4 = ((ArithmeticExpression) it).getOperator();
          boolean _equals_5 = Objects.equal(_operator_4, ArithmeticOperator.ADD);
          _or_2 = _equals_5;
        }
        _and_1 = _or_2;
      }
      if (_and_1) {
        _matched=true;
        return 280;
      }
    }
    if (!_matched) {
      if ((it instanceof BitShiftExpression)) {
        _matched=true;
        return 270;
      }
    }
    if (!_matched) {
      if ((it instanceof MinMaxExpression)) {
        _matched=true;
        return 260;
      }
    }
    if (!_matched) {
      boolean _and_2 = false;
      if (!(it instanceof CompareExpression)) {
        _and_2 = false;
      } else {
        boolean _or_3 = false;
        CompareOperator _operator_5 = ((CompareExpression) it).getOperator();
        boolean _equals_6 = Objects.equal(_operator_5, CompareOperator.EQUAL);
        if (_equals_6) {
          _or_3 = true;
        } else {
          CompareOperator _operator_6 = ((CompareExpression) it).getOperator();
          boolean _equals_7 = Objects.equal(_operator_6, CompareOperator.UNEQUAL);
          _or_3 = _equals_7;
        }
        _and_2 = _or_3;
      }
      if (_and_2) {
        _matched=true;
        return 250;
      }
    }
    if (!_matched) {
      if ((it instanceof CompareExpression)) {
        _matched=true;
        return 245;
      }
    }
    if (!_matched) {
      boolean _and_3 = false;
      if (!(it instanceof BitwiseExpression)) {
        _and_3 = false;
      } else {
        BitwiseOperator _operator_7 = ((BitwiseExpression) it).getOperator();
        boolean _equals_8 = Objects.equal(_operator_7, BitwiseOperator.AND);
        _and_3 = _equals_8;
      }
      if (_and_3) {
        _matched=true;
        return 240;
      }
    }
    if (!_matched) {
      boolean _and_4 = false;
      if (!(it instanceof BitwiseExpression)) {
        _and_4 = false;
      } else {
        BitwiseOperator _operator_8 = ((BitwiseExpression) it).getOperator();
        boolean _equals_9 = Objects.equal(_operator_8, BitwiseOperator.XOR);
        _and_4 = _equals_9;
      }
      if (_and_4) {
        _matched=true;
        return 230;
      }
    }
    if (!_matched) {
      boolean _and_5 = false;
      if (!(it instanceof BitwiseExpression)) {
        _and_5 = false;
      } else {
        BitwiseOperator _operator_9 = ((BitwiseExpression) it).getOperator();
        boolean _equals_10 = Objects.equal(_operator_9, BitwiseOperator.OR);
        _and_5 = _equals_10;
      }
      if (_and_5) {
        _matched=true;
        return 220;
      }
    }
    if (!_matched) {
      if ((it instanceof ConditionExpression)) {
        _matched=true;
        return 210;
      }
    }
    if (!_matched) {
      if ((it instanceof AssignmentExpression)) {
        _matched=true;
        return 200;
      }
    }
    if (!_matched) {
      if ((it instanceof NegationExpression)) {
        _matched=true;
        return 190;
      }
    }
    if (!_matched) {
      boolean _and_6 = false;
      if (!(it instanceof LogicalExpression)) {
        _and_6 = false;
      } else {
        LogicalOperator _operator_10 = ((LogicalExpression) it).getOperator();
        boolean _equals_11 = Objects.equal(_operator_10, LogicalOperator.AND);
        _and_6 = _equals_11;
      }
      if (_and_6) {
        _matched=true;
        return 180;
      }
    }
    if (!_matched) {
      boolean _and_7 = false;
      if (!(it instanceof LogicalExpression)) {
        _and_7 = false;
      } else {
        LogicalOperator _operator_11 = ((LogicalExpression) it).getOperator();
        boolean _equals_12 = Objects.equal(_operator_11, LogicalOperator.OR);
        _and_7 = _equals_12;
      }
      if (_and_7) {
        _matched=true;
        return 170;
      }
    }
    if (!_matched) {
      boolean _and_8 = false;
      if (!(it instanceof LogicalExpression)) {
        _and_8 = false;
      } else {
        LogicalOperator _operator_12 = ((LogicalExpression) it).getOperator();
        boolean _equals_13 = Objects.equal(_operator_12, LogicalOperator.IMPLY);
        _and_8 = _equals_13;
      }
      if (_and_8) {
        _matched=true;
        return 170;
      }
    }
    if (!_matched) {
      if ((it instanceof QuantificationExpression)) {
        _matched=true;
        return 160;
      }
    }
    return 0;
  }
  
  public CharSequence declarations(final Declarations it) {
    if (it instanceof GlobalDeclarations) {
      return _declarations((GlobalDeclarations)it);
    } else if (it instanceof LocalDeclarations) {
      return _declarations((LocalDeclarations)it);
    } else if (it instanceof SystemDeclarations) {
      return _declarations((SystemDeclarations)it);
    } else if (it == null) {
      return _declarations((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence declaration(final Declaration it) {
    if (it instanceof FunctionDeclaration) {
      return _declaration((FunctionDeclaration)it);
    } else if (it instanceof TypeDeclaration) {
      return _declaration((TypeDeclaration)it);
    } else if (it instanceof VariableDeclaration) {
      return _declaration((VariableDeclaration)it);
    } else if (it instanceof TemplateDeclaration) {
      return _declaration((TemplateDeclaration)it);
    } else if (it == null) {
      return _declaration((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence block(final Block it) {
    return _block(it);
  }
  
  public CharSequence prefix(final VariableDeclaration it) {
    if (it instanceof ChannelVariableDeclaration) {
      return _prefix((ChannelVariableDeclaration)it);
    } else if (it instanceof ClockVariableDeclaration) {
      return _prefix((ClockVariableDeclaration)it);
    } else if (it instanceof DataVariableDeclaration) {
      return _prefix((DataVariableDeclaration)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence channelPriority(final ChannelPriority it) {
    if (it != null) {
      return _channelPriority(it);
    } else if (it == null) {
      return _channelPriority((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence item(final ChannelPriorityItem it) {
    if (it instanceof ChannelList) {
      return _item((ChannelList)it);
    } else if (it instanceof DefaultChannelPriority) {
      return _item((DefaultChannelPriority)it);
    } else if (it == null) {
      return _item((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence typedefinition(final TypeDefinition it) {
    if (it instanceof RangeTypeSpecification) {
      return _typedefinition((RangeTypeSpecification)it);
    } else if (it instanceof ScalarTypeSpecification) {
      return _typedefinition((ScalarTypeSpecification)it);
    } else if (it instanceof StructTypeSpecification) {
      return _typedefinition((StructTypeSpecification)it);
    } else if (it instanceof TypeReference) {
      return _typedefinition((TypeReference)it);
    } else if (it == null) {
      return _typedefinition((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence index(final Index it) {
    if (it instanceof TypeIndex) {
      return _index((TypeIndex)it);
    } else if (it instanceof ValueIndex) {
      return _index((ValueIndex)it);
    } else if (it == null) {
      return _index((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence initializer(final Initializer it) {
    if (it instanceof ArrayInitializer) {
      return _initializer((ArrayInitializer)it);
    } else if (it instanceof ExpressionInitializer) {
      return _initializer((ExpressionInitializer)it);
    } else if (it == null) {
      return _initializer((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence statement(final Statement it) {
    if (it instanceof Block) {
      return _statement((Block)it);
    } else if (it instanceof DoWhileLoop) {
      return _statement((DoWhileLoop)it);
    } else if (it instanceof EmptyStatement) {
      return _statement((EmptyStatement)it);
    } else if (it instanceof ExpressionStatement) {
      return _statement((ExpressionStatement)it);
    } else if (it instanceof ForLoop) {
      return _statement((ForLoop)it);
    } else if (it instanceof IfStatement) {
      return _statement((IfStatement)it);
    } else if (it instanceof Iteration) {
      return _statement((Iteration)it);
    } else if (it instanceof ReturnStatement) {
      return _statement((ReturnStatement)it);
    } else if (it instanceof WhileLoop) {
      return _statement((WhileLoop)it);
    } else if (it == null) {
      return _statement((Void)null);
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
    } else if (it == null) {
      return _expression((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

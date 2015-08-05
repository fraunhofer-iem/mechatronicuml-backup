package de.uni_paderborn.fujaba.muml.allocation.language.ui.view;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.ocl.OCLEvaluator;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS;
import de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext;
import de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextFactory;
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class AllocationSpecificationLanguageEvaluationView extends ViewPart implements ISelectionListener {
  @Inject
  private EObjectAtOffsetHelper eObjectAtOffsetHelper;
  
  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String languageName;
  
  private String evaluatableElementFragmentURI;
  
  private XtextEditor editor;
  
  @Accessors
  private ComponentInstanceConfiguration cic;
  
  @Accessors
  private HWPlatformInstanceConfiguration hpic;
  
  private ITextViewer resultTextViewer;
  
  @Override
  public void createPartControl(final Composite parent) {
    this.createResultTextViewer(parent);
    IViewSite _viewSite = this.getViewSite();
    boolean _notEquals = (!Objects.equal(_viewSite, null));
    if (_notEquals) {
      IViewSite _viewSite_1 = this.getViewSite();
      IWorkbenchPage _page = _viewSite_1.getPage();
      _page.addSelectionListener(this);
    }
  }
  
  private void createResultTextViewer(final Composite parent) {
    TextViewer _textViewer = new TextViewer(parent, (((SWT.BORDER | SWT.MULTI) | SWT.V_SCROLL) | SWT.H_SCROLL));
    this.resultTextViewer = _textViewer;
    StyledText _textWidget = this.resultTextViewer.getTextWidget();
    GridData _gridData = new GridData(GridData.FILL_BOTH);
    _textWidget.setLayoutData(_gridData);
    StyledText _textWidget_1 = this.resultTextViewer.getTextWidget();
    Font _font = JFaceResources.getFont(JFaceResources.TEXT_FONT);
    _textWidget_1.setFont(_font);
    this.resultTextViewer.setEditable(false);
    Document _document = new Document();
    this.resultTextViewer.setDocument(_document);
  }
  
  @Override
  public void setFocus() {
  }
  
  @Override
  public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
    boolean _and = false;
    boolean _and_1 = false;
    if (!(part instanceof XtextEditor)) {
      _and_1 = false;
    } else {
      String _languageName = ((XtextEditor) part).getLanguageName();
      boolean _equals = _languageName.equals(this.languageName);
      _and_1 = _equals;
    }
    if (!_and_1) {
      _and = false;
    } else {
      _and = (selection instanceof ITextSelection);
    }
    if (_and) {
      final ITextSelection textSel = ((ITextSelection) selection);
      this.editor = ((XtextEditor) part);
      IXtextDocument _document = this.editor.getDocument();
      final IUnitOfWork<String, XtextResource> _function = new IUnitOfWork<String, XtextResource>() {
        @Override
        public String exec(final XtextResource resource) throws Exception {
          String _xblockexpression = null;
          {
            int _offset = textSel.getOffset();
            EObject model = AllocationSpecificationLanguageEvaluationView.this.eObjectAtOffsetHelper.resolveContainedElementAt(resource, _offset);
            while (((!(model instanceof EvaluatableElementCS)) && (!Objects.equal(model, null)))) {
              EObject _eContainer = model.eContainer();
              model = _eContainer;
            }
            String _xifexpression = null;
            boolean _notEquals = (!Objects.equal(model, null));
            if (_notEquals) {
              _xifexpression = resource.getURIFragment(model);
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        }
      };
      String _readOnly = _document.<String>readOnly(_function);
      this.evaluatableElementFragmentURI = _readOnly;
    }
  }
  
  private EvaluatableElementCS getEvaluatableElementCS(final Resource resource) {
    EvaluatableElementCS _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this.evaluatableElementFragmentURI, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(this.editor, null));
      _and = _notEquals_1;
    }
    if (_and) {
      _xifexpression = ((EvaluatableElementCS) resource.getEObject(this.evaluatableElementFragmentURI));
    }
    return _xifexpression;
  }
  
  private OCLContext getContext() {
    OCLContext _xblockexpression = null;
    {
      final OCLContext ctx = OclcontextFactory.eINSTANCE.createOCLContext();
      ctx.setComponentInstanceConfiguration(this.cic);
      ctx.setHardwarePlatformInstanceConfiguration(this.hpic);
      _xblockexpression = ctx;
    }
    return _xblockexpression;
  }
  
  public void evaluate() {
    final StringBuilder builder = new StringBuilder();
    boolean _notEquals = (!Objects.equal(this.editor, null));
    if (_notEquals) {
      IXtextDocument _document = this.editor.getDocument();
      final IUnitOfWork<Object, XtextResource> _function = new IUnitOfWork<Object, XtextResource>() {
        @Override
        public Object exec(final XtextResource resource) throws Exception {
          Object _xblockexpression = null;
          {
            final EvaluatableElementCS element = AllocationSpecificationLanguageEvaluationView.this.getEvaluatableElementCS(resource);
            final OCLContext ctx = AllocationSpecificationLanguageEvaluationView.this.getContext();
            Object _xifexpression = null;
            boolean _and = false;
            boolean _and_1 = false;
            boolean _notEquals = (!Objects.equal(element, null));
            if (!_notEquals) {
              _and_1 = false;
            } else {
              ComponentInstanceConfiguration _componentInstanceConfiguration = ctx.getComponentInstanceConfiguration();
              boolean _notEquals_1 = (!Objects.equal(_componentInstanceConfiguration, null));
              _and_1 = _notEquals_1;
            }
            if (!_and_1) {
              _and = false;
            } else {
              HWPlatformInstanceConfiguration _hardwarePlatformInstanceConfiguration = ctx.getHardwarePlatformInstanceConfiguration();
              boolean _notEquals_2 = (!Objects.equal(_hardwarePlatformInstanceConfiguration, null));
              _and = _notEquals_2;
            }
            if (_and) {
              Object _xblockexpression_1 = null;
              {
                String _name = AllocationSpecificationLanguageEvaluationView.this.getName(element);
                String _plus = ("Evaluating: " + _name);
                String _plus_1 = (_plus + "\n");
                builder.append(_plus_1);
                Type _createType = TypesUtil.createType(element);
                String _plus_2 = ("Expected type: " + _createType);
                builder.append(_plus_2);
                builder.append("\n");
                ContextCS _expression = element.getExpression();
                Element _pivot = _expression.getPivot();
                Type _type = ((ExpressionInOCL) _pivot).getType();
                String _plus_3 = ("Actual type: " + _type);
                builder.append(_plus_3);
                builder.append("\nResult:\n\n");
                Object _xtrycatchfinallyexpression = null;
                try {
                  ContextCS _expression_1 = element.getExpression();
                  _xtrycatchfinallyexpression = OCLEvaluator.evaluate(_expression_1, ctx);
                } catch (final Throwable _t) {
                  if (_t instanceof InvalidValueException) {
                    final InvalidValueException e = (InvalidValueException)_t;
                    Object _xblockexpression_2 = null;
                    {
                      final StringWriter writer = new StringWriter();
                      PrintWriter _printWriter = new PrintWriter(writer);
                      e.printStackTrace(_printWriter);
                      String _string = writer.toString();
                      builder.append(_string);
                      _xblockexpression_2 = null;
                    }
                    _xtrycatchfinallyexpression = _xblockexpression_2;
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
                _xblockexpression_1 = _xtrycatchfinallyexpression;
              }
              _xifexpression = _xblockexpression_1;
            } else {
              Object _xblockexpression_2 = null;
              {
                builder.append("Select an evaluation context and/or a constraint");
                _xblockexpression_2 = null;
              }
              _xifexpression = _xblockexpression_2;
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        }
      };
      final Object result = _document.<Object>readOnly(_function);
      boolean _notEquals_1 = (!Objects.equal(result, null));
      if (_notEquals_1) {
        this.buildOutput(builder, result, "");
      }
    } else {
      builder.append("Open the ASL editor and select a constraint");
    }
    IDocument _document_1 = this.resultTextViewer.getDocument();
    String _string = builder.toString();
    _document_1.set(_string);
  }
  
  private String getName(final EvaluatableElementCS element) {
    String _xifexpression = null;
    if ((element instanceof NamedElementCS)) {
      _xifexpression = ((NamedElementCS) element).getName();
    } else {
      _xifexpression = "<Unnamed>";
    }
    return _xifexpression;
  }
  
  private void _buildOutput(final StringBuilder builder, final Object value, final String indent) {
    final CollectionValue collection = ValueUtil.isCollectionValue(value);
    boolean _notEquals = (!Objects.equal(collection, null));
    if (_notEquals) {
      builder.append(indent);
      Class<? extends CollectionValue> _class = collection.getClass();
      String _name = _class.getName();
      String _replaceAll = _name.replaceAll(".*\\.", "");
      String _replaceAll_1 = _replaceAll.replaceAll("ValueImpl", "");
      String _replaceAll_2 = _replaceAll_1.replaceAll("\\$.*$", "");
      builder.append(_replaceAll_2);
      builder.append(" {\n");
      Iterable<?> _iterable = collection.iterable();
      for (final Object item : _iterable) {
        this.buildOutput(builder, item, (indent + " "));
      }
      builder.append((indent + "}\n"));
    } else {
      builder.append(indent);
      ValueUtil.toString(value, builder, 4000);
      builder.append("\n");
    }
  }
  
  private void _buildOutput(final StringBuilder builder, final TupleValue value, final String indent) {
    builder.append(indent);
    builder.append("Tuple{");
    TupleTypeId _typeId = value.getTypeId();
    final TuplePartId[] partIds = _typeId.getPartIds();
    for (int i = 0; (i < partIds.length); i++) {
      {
        final TuplePartId partId = partIds[i];
        if ((i != 0)) {
          builder.append(", ");
        }
        String _displayName = partId.getDisplayName();
        String _replaceAll = _displayName.replaceAll("\'.*\'::", "");
        builder.append(_replaceAll);
        builder.append(" = ");
        final StringBuilder tmp = new StringBuilder();
        Object _value = value.getValue(i);
        ValueUtil.toString(_value, tmp, 4000);
        String _string = tmp.toString();
        String _replaceAll_1 = _string.replaceAll(".*@[^\\s]*\\s+", "");
        builder.append(_replaceAll_1);
      }
    }
    builder.append("}");
    builder.append("\n");
  }
  
  private void buildOutput(final StringBuilder builder, final Object value, final String indent) {
    if (value instanceof TupleValue) {
      _buildOutput(builder, (TupleValue)value, indent);
      return;
    } else if (value != null) {
      _buildOutput(builder, value, indent);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(builder, value, indent).toString());
    }
  }
  
  @Pure
  public ComponentInstanceConfiguration getCic() {
    return this.cic;
  }
  
  public void setCic(final ComponentInstanceConfiguration cic) {
    this.cic = cic;
  }
  
  @Pure
  public HWPlatformInstanceConfiguration getHpic() {
    return this.hpic;
  }
  
  public void setHpic(final HWPlatformInstanceConfiguration hpic) {
    this.hpic = hpic;
  }
}

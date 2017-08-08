package org.muml.eloquent.adapter.muml.ui;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.muml.psm.allocation.algorithm.ui.AbstractCreateASLFileHandler;

@SuppressWarnings("all")
public class MUMLCreateASLFileHandler extends AbstractCreateASLFileHandler {
  @Override
  public String getTemplate(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("import \'http://www.muml.org/eloquent/adapter/muml/oclcontext/1.0.0\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("include \'platform:/plugin/org.muml.eloquent.adapter.muml/operations/OCLContext.ocl\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("oclContext oclcontext::OCLContext");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("nameProvider \'org.muml.eloquent.adapter.muml.provider.MUMLNameProvider\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("storageProvider \'org.muml.eloquent.adapter.muml.provider.MUMLStorageProvider\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("relation allocate {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("descriptors (first : pim::instance::ComponentInstance, second : hardware::hwresourceinstance::ResourceInstance);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lower 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("upper 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ocl self.getAllSWInstances()->product(");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("self.getAllStructuredHWInstances()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}

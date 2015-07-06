package de.uni_paderborn.fujaba.modelcopy.qvto.generator.adapters;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapter;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;

public class ModelcopyGeneratorAdapterFactory extends GenModelAdapterFactory implements GeneratorAdapterFactory
{
  protected Generator generator;
  protected GenBaseGeneratorAdapter genModelGeneratorAdapter;

  public ModelcopyGeneratorAdapterFactory()
  {
    super();
  }

  /**
   * Returns <code>true</code> when the type is <code>GeneratorAdapter.class</code>.
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return type == GeneratorAdapter.class;
  }

  /**
   * Does an {@link org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#adapt(Notifier, Object) adapt(Notifier, Object)},
   * substituting <code>this</code> for the given <code>type</code>. This substitution is necessary because each of many
   * generator adapter factories can have its own generator adapter on a single object.
   */ 
  @Override
  public Adapter adapt(Notifier target, Object type)
  {
    return super.adapt(target, this);
  }

  /**
   * Returns a singleton {@link ModelcopyPackageGeneratorAdapter}.
   */
  @Override
  public Adapter createGenClassAdapter()
  {
    return null;
  }
 
  /**
   * Returns a singleton {@link ModelcopyPackageGeneratorAdapter}.
   */
  @Override
  public Adapter createGenModelAdapter()
  {
    if (genModelGeneratorAdapter == null)
    {
    	genModelGeneratorAdapter = new ModelcopyModelGeneratorAdapter(this);
    }
    return genModelGeneratorAdapter;
  }

  public Generator getGenerator()
  {
    return generator;
  }

  public void setGenerator(Generator generator)
  {
    this.generator = generator;
  }

  /**
   * Performs initialization for the given input {@link GenModel}. It is used as the basis for setting
   * {@link Generator#getOptions() options} on the associated {@link Generator}.
   */
  public void initialize(Object input)
  {
    Generator.Options options = generator.getOptions();
    GenModel genModel = (GenModel)input;
    Resource resource = genModel.eResource();
    
    options.redirectionPattern = genModel.getRedirection();
    options.forceOverwrite = genModel.isForceOverwrite();
    options.dynamicTemplates = genModel.isDynamicTemplates();

//    initializeMergeRulesURI(options, genModel);

    options.mergerFacadeHelperClass = genModel.getFacadeHelperClass();
    options.codeFormatting = genModel.isCodeFormatting();
    options.resourceSet = resource != null ? resource.getResourceSet() : null;
    options.templateClasspath = genModel.getTemplatePluginVariables();
  }
 
  public void dispose()
  {
    if (genModelGeneratorAdapter != null) genModelGeneratorAdapter.dispose();
  }
}

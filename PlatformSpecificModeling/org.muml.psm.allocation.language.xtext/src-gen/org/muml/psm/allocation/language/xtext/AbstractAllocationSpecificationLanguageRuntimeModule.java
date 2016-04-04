/*
 * generated by Xtext
 */
package org.muml.psm.allocation.language.xtext;

import java.util.Properties;

import org.eclipse.xtext.Constants;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {de.uni_paderborn.fujaba.muml.allocation.language.AllocationSpecificationLanguageRuntimeModule}
 */
@SuppressWarnings("all")
public abstract class AbstractAllocationSpecificationLanguageRuntimeModule extends org.eclipse.xtext.common.types.DefaultCommonTypesRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "de/uni_paderborn/fujaba/muml/allocation/language/AllocationSpecificationLanguage.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("de.uni_paderborn.fujaba.muml.allocation.language.AllocationSpecificationLanguage");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("allocation_specification");
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return org.muml.psm.allocation.language.xtext.services.AllocationSpecificationLanguageGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ISemanticSequencer> bindISemanticSequencer() {
		return org.muml.psm.allocation.language.xtext.serializer.AllocationSpecificationLanguageSemanticSequencer.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer> bindISyntacticSequencer() {
		return org.muml.psm.allocation.language.xtext.serializer.AllocationSpecificationLanguageSyntacticSequencer.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.ISerializer> bindISerializer() {
		return org.eclipse.xtext.serializer.impl.Serializer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return org.muml.psm.allocation.language.xtext.parser.antlr.AllocationSpecificationLanguageParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return org.muml.psm.allocation.language.xtext.parser.antlr.AllocationSpecificationLanguageAntlrTokenFileProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return org.muml.psm.allocation.language.xtext.parser.antlr.internal.InternalAllocationSpecificationLanguageLexer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public com.google.inject.Provider<org.muml.psm.allocation.language.xtext.parser.antlr.internal.InternalAllocationSpecificationLanguageLexer> provideInternalAllocationSpecificationLanguageLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(org.muml.psm.allocation.language.xtext.parser.antlr.internal.InternalAllocationSpecificationLanguageLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(org.muml.psm.allocation.language.xtext.parser.antlr.internal.InternalAllocationSpecificationLanguageLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.muml.psm.allocation.language.xtext.validation.AllocationSpecificationLanguageJavaValidator> bindAllocationSpecificationLanguageJavaValidator() {
		return org.muml.psm.allocation.language.xtext.validation.AllocationSpecificationLanguageJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return org.muml.psm.allocation.language.xtext.scoping.AllocationSpecificationLanguageScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIgnoreCaseLinking(com.google.inject.Binder binder) {
		binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
	}

	// contributed by org.eclipse.xtext.generator.exporting.SimpleNamesFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.eclipse.xtext.naming.SimpleNameProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return org.eclipse.xtext.resource.containers.StateBasedContainerManager.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsPersisted(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.muml.psm.allocation.language.xtext.generator.AllocationSpecificationLanguageGenerator.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return org.muml.psm.allocation.language.xtext.formatting.AllocationSpecificationLanguageFormatter.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer> bindICrossReferenceSerializer() {
		return org.eclipse.ocl.xtext.base.serializer.BaseCrossReferenceSerializer.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.validation.IDiagnosticConverter> bindIDiagnosticConverter() {
		return org.eclipse.ocl.xtext.base.utilities.PivotDiagnosticConverter.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.resource.IFragmentProvider> bindIFragmentProvider() {
		return org.eclipse.ocl.xtext.base.cs2as.BaseFragmentProvider.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.IHiddenTokenSequencer> bindIHiddenTokenSequencer() {
		return org.eclipse.ocl.xtext.base.serializer.BaseHiddenTokenSequencer.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
		return org.eclipse.ocl.xtext.base.utilities.CS2ASLinker.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return org.eclipse.ocl.xtext.base.services.BaseLinkingDiagnosticMessageProvider.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.linking.ILinkingService> bindILinkingService() {
		return org.eclipse.ocl.xtext.base.services.BaseLinkingService.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return org.eclipse.ocl.xtext.base.services.BaseQualifiedNameConverter.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.resource.IResourceServiceProvider> bindIResourceServiceProvider() {
		return org.eclipse.ocl.xtext.base.services.PivotResourceServiceProvider.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.validation.IResourceValidator> bindIResourceValidator() {
		return org.eclipse.ocl.xtext.base.utilities.PivotResourceValidator.class;
	}

	// contributed by org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return org.eclipse.ocl.xtext.base.services.BaseValueConverterService.class;
	}

	// contributed by de.uni_paderborn.fujaba.muml.allocation.language.build.GuiceBindingFragment
	public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
		return org.muml.psm.allocation.language.xtext.resource.SpecificationCSResource.class;
	}

}
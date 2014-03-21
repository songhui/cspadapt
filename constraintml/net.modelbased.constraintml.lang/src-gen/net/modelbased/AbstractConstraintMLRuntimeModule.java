/*
 * generated by Xtext
 */
package net.modelbased;

import java.util.Properties;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {net.modelbased.ConstraintMLRuntimeModule}
 */
 @SuppressWarnings("all")
public abstract class AbstractConstraintMLRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "net/modelbased/ConstraintML.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("net.modelbased.ConstraintML");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("constraint");
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return net.modelbased.services.ConstraintMLGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ISemanticSequencer> bindISemanticSequencer() {
		return net.modelbased.serializer.ConstraintMLSemanticSequencer.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer> bindISyntacticSequencer() {
		return net.modelbased.serializer.ConstraintMLSyntacticSequencer.class;
	}

	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends org.eclipse.xtext.serializer.ISerializer> bindISerializer() {
		return org.eclipse.xtext.serializer.impl.Serializer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return net.modelbased.parser.antlr.ConstraintMLParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return net.modelbased.parser.antlr.ConstraintMLAntlrTokenFileProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return net.modelbased.parser.antlr.internal.InternalConstraintMLLexer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public com.google.inject.Provider<net.modelbased.parser.antlr.internal.InternalConstraintMLLexer> provideInternalConstraintMLLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(net.modelbased.parser.antlr.internal.InternalConstraintMLLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(net.modelbased.parser.antlr.internal.InternalConstraintMLLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends net.modelbased.validation.ConstraintMLJavaValidator> bindConstraintMLJavaValidator() {
		return net.modelbased.validation.ConstraintMLJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return net.modelbased.scoping.ConstraintMLScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIgnoreCaseLinking(com.google.inject.Binder binder) {
		binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
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
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE)).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return net.modelbased.generator.ConstraintMLGenerator.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return net.modelbased.formatting.ConstraintMLFormatter.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public org.eclipse.xtext.common.types.TypesFactory bindTypesFactoryToInstance() {
		return org.eclipse.xtext.common.types.TypesFactory.eINSTANCE;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.ClasspathBasedTypeScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer> bindICrossReferenceSerializer() {
		return org.eclipse.ocl.examples.xtext.essentialocl.serializer.EssentialOCLCrossReferenceSerializer.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.validation.IDiagnosticConverter> bindIDiagnosticConverter() {
		return org.eclipse.ocl.examples.xtext.base.utilities.PivotDiagnosticConverter.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.serializer.sequencer.IHiddenTokenSequencer> bindIHiddenTokenSequencer() {
		return org.eclipse.ocl.examples.xtext.essentialocl.serializer.EssentialOCLHiddenTokenSequencer.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
		return org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotLinker.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLLinkingDiagnosticMessageProvider.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.linking.ILinkingService> bindILinkingService() {
		return org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLLinkingService.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLQualifiedNameConverter.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLQualifiedNameProvider.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.resource.IResourceServiceProvider> bindIResourceServiceProvider() {
		return org.eclipse.ocl.examples.xtext.base.services.PivotResourceServiceProvider.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.validation.IResourceValidator> bindIResourceValidator() {
		return org.eclipse.ocl.examples.xtext.base.utilities.PivotResourceValidator.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLValueConverterService.class;
	}

	// contributed by net.modelbased.fragment.EssentialOCLFragment
	public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
		return org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource.class;
	}

}

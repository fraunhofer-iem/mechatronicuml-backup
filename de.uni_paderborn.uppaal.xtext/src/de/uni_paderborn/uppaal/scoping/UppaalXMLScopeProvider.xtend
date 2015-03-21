/*
 * generated by Xtext
 */
package de.uni_paderborn.uppaal.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import de.uni_paderborn.uppaal.templates.Template

import org.eclipse.xtext.scoping.Scopes
import com.google.common.base.Function
import de.uni_paderborn.uppaal.parsable.IdentifiableLocation
import org.eclipse.xtext.naming.QualifiedName
import de.uni_paderborn.uppaal.expressions.IdentifierExpression
import de.uni_paderborn.uppaal.NTA
import de.uni_paderborn.uppaal.declarations.TypedDeclaration
import de.uni_paderborn.uppaal.core.NamedElement
import de.uni_paderborn.uppaal.declarations.TypedElementContainer
import de.uni_paderborn.uppaal.declarations.TypeDeclaration
import de.uni_paderborn.uppaal.statements.Block
import de.uni_paderborn.uppaal.statements.Iteration
import de.uni_paderborn.uppaal.declarations.SystemDeclarations
import de.uni_paderborn.uppaal.templates.Edge
import de.uni_paderborn.uppaal.expressions.DataPrefixExpression
import de.uni_paderborn.uppaal.declarations.Variable
import de.uni_paderborn.uppaal.expressions.QuantificationExpression
import de.uni_paderborn.uppaal.expressions.ScopedIdentifierExpression
import de.uni_paderborn.uppaal.types.StructTypeSpecification
import de.uni_paderborn.uppaal.core.TypedElement
import de.uni_paderborn.uppaal.types.DeclaredType
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import de.uni_paderborn.uppaal.types.Library
import de.uni_paderborn.uppaal.expressions.FunctionCallExpression

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 * Custom scoping for UPPAALs XML format and programming language.
 */
class UppaalXMLScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {

	/**
	 * The Library instance that is used by this ScopeProvider.
	 */	
	private static Library LIBRARY = null;

	/**
	 * Helper method that appends the TypedElements of a TypedElementContainer to a given
	 * Iterable for NamedElements.
	 */
	private var Functions.Function2<Iterable<NamedElement>, TypedElementContainer, Iterable<NamedElement>>
		TypedElementContainerReduction = [ a, b | a + b.elements.filter(typeof(NamedElement)) ]

	/**
	 * Helper method that appends the Types of a TypeDeclaration to a given
	 * Iterable for NamedElements.
	 */
	private var Functions.Function2<Iterable<NamedElement>, TypeDeclaration, Iterable<NamedElement>>
		TypeDeclarationReduction = [ a, b | a + b.type.filter(typeof(NamedElement)) ]
	
	/**
	 * Helper method that returns the QualifiedName of an IdentifiableLocation (= the id).
	 */
	private var Function<IdentifiableLocation, QualifiedName>
		getNameOfLocation = [ QualifiedName::create(it.id) ]

	/**
	 * Method that is called via reflection whenever the identifier attribute of an
	 * IdentifierExpression needs to be resolved.
	 * 
	 * @param context Instance of IdentifierExpression.
	 * @param ref Instance of the reference, i.e. the identifier attribute.
	 * 
	 * @return Hopefully a matching scope for the given identifier.
	 */
	def scope_IdentifierExpression_identifier(EObject context, EReference ref)
	{
		getIdentifierScope(context as IdentifierExpression)
	}
	
	/**
	 * Method that is called via reflection whenever the function reference of a
	 * FunctionCallExpression needs to be resolved.
	 * 
	 * @param context Instance of FunctionCallExpression.
	 * @param ref Instance of the reference, i.e. the function reference.
	 * 
	 * @return Hopefully a matching scope for the given function.
	 */
	def scope_FunctionCallExpression_function(EObject context, EReference ref)
	{
		getRecursiveScope(context, ScopeMode.TYPED_ELEMENTS, false) 
	}
	
	/**
	 * Method that is called when the source attribute of an edge needs to be resolved.
	 * 
	 * @param context Edge instance.
	 * @param ref EReference instance of the source attribute.
	 * 
	 * @return Scope for the source attribute.
	 */
	def IScope scope_Edge_source(EObject context, EReference ref)
	{
		val container = context.eContainer as Template
		Scopes::scopeFor(
			container.location.filter(typeof(IdentifiableLocation)),
			getNameOfLocation, IScope::NULLSCOPE
		)
	}
	
	/**
	 * Method that is called when the target attribute of an Edge needs to be resolved.
	 * 
	 * @param context Edge instance.
	 * @param ref EReference instance of the target attribute.
	 * 
	 * @return Scope for the target attribute.
	 */
	def IScope scope_Edge_target(EObject context, EReference ref)
	{
		val container = context.eContainer as Template
		Scopes::scopeFor(
			container.location.filter(typeof(IdentifiableLocation)),
			getNameOfLocation, IScope::NULLSCOPE
		)
	}
	
	/**
	 * Method that is called when the init attribute of a Template needs to be resolved.
	 * 
	 * @param context Template instance.
	 * @param ref EReference instance for the init attribute.
	 * 
	 * @return Scope for the init attribute.
	 */
	def IScope scope_Template_init(EObject context, EReference ref)
	{
		if (context == null || !(context instanceof Template))
			return IScope::NULLSCOPE;
		val template = context as Template
		Scopes::scopeFor(
			template.location.filter(typeof(IdentifiableLocation)),
			getNameOfLocation, IScope::NULLSCOPE
		)
	}
	
	/**
	 * Method that is called when the channelType attribute of a ChannelPrefixExpression
	 * needs to be resolved.
	 * 
	 * @param context ChannelPrefixExpression instance.
	 * @param ref EReference instance for the channelType attribute.
	 * 
	 * @return Scope for the channelType attribute.
	 */
	def IScope scope_ChannelPrefixExpression_channelType(EObject context, EReference ref)
	{
		val Library lib = getLibrary(context);
		return Scopes::scopeFor(lib.types)
	}
		
	/**
	 * Main method to find the scope corresponding to a given IdentifierExpression.
	 * It checks for certain special cases an then delegates to more specialized
	 * methods.
	 * 
	 * @param identifier The IdentifierExpression that needs resolving.
	 * 
	 * @return Scope for the IdentifierExpression.
	 */
	private def getIdentifierScope(IdentifierExpression identifier)
	{
		// Filter out cases where we may only reference instances of Type.
		switch (identifier.eContainer)
		{
			TypedElementContainer,
			TypeDeclaration:
				if ("typeDefinition".equals(identifier.eContainmentFeature.name))
					return getRecursiveScope(identifier, ScopeMode.TYPES, false)
			DataPrefixExpression:
				return getRecursiveScope(identifier, ScopeMode.TYPES, false)
		}
		
		// If none of the cases above happens, just return all TypedElements.
		getRecursiveScope(identifier, ScopeMode.TYPED_ELEMENTS, false) 
	}
	
	/**
	 * Checks whether the given ScopedIdentifierExpression follows the structure that
	 * we can scope, i.e. if the "scope" is either an IdentifierExpression or a valid
	 * ScopedIdentifierExpression and the identifier is an IdentifierExpression.
	 * 
	 * @param expr The ScopedIdentifierExpression to check.
	 * 
	 * @return A boolean indicating whether the structure is valid or not.
	 */
	private def boolean checkScopedIdentifierExpressionStructure(ScopedIdentifierExpression expr)
	{
		switch (expr.scope)
		{
			IdentifierExpression,
			ScopedIdentifierExpression:
				return true
		}
		
		return false;
	}
	
	/**
	 * Specifically scopes ScopedIdentifierExpressions. The method assumes that the
	 * structure of the expression is valid, i.e. checkScopedIdentifierExpression
	 * returned true.
	 * 
	 * @param expr The ScopedIdentifierExpression whose identifier attribute should
	 * be resolved.
	 * 
	 * @return A scope that hopefully includes the referenced element.
	 */
	private def IScope getScopedIdentifierExpressionScope(ScopedIdentifierExpression expr)
	{
		// Define variables.
		var StructTypeSpecification struct = null;
		var scope = IScope::NULLSCOPE
		var IdentifierExpression identifier = null

		// Check on which level of the ScopedIdentifierExpression we currently are
		// and get the relevant scope identifier.
		switch (expr.scope)
		{
			IdentifierExpression:
				identifier = expr.scope as IdentifierExpression
			ScopedIdentifierExpression: {
				identifier = (expr.scope as ScopedIdentifierExpression).identifier
			}
		}
		
		// Try to find a struct through the given identifier, i.e. the identifier
		// should point to a variable of a struct type.
		if (identifier.identifier instanceof TypedElement)
		{
			var typeDefinition = (identifier.identifier as TypedElement).typeDefinition;
			
			// Check if we have some typedefs we need to trace first.
			while (
				(typeDefinition instanceof IdentifierExpression) &&
				(typeDefinition as IdentifierExpression).identifier instanceof DeclaredType
			)
			{
				typeDefinition = ((typeDefinition as IdentifierExpression).identifier
					as DeclaredType
				).typeDefinition;
			}
			
			// If we found a struct, remember it.
			if (typeDefinition instanceof StructTypeSpecification)
				struct = typeDefinition as StructTypeSpecification
		}

		// If we found a struct, then we can add its elements to the scope.
		if (struct != null)
		{
			// Add all elements of the struct to the current scope.
			var elements = struct.declaration
				.bReduce(emptyList, TypedElementContainerReduction)
					
			// Create the new scope.
			scope = Scopes::scopeFor(elements, IScope::NULLSCOPE)
		}
		
		return scope;
	}
	
	/**
	 * Recursive strategy to find the scope of arbitrary EObjects. Essentially, the
	 * containment tree is traversed and on relevant objects the scope is extended.
	 * It is recursive as we go up in the containment tree, thus encountering inner
	 * scopes first and outer scopes last. This is easier to do with recursion.
	 * 
	 * @param obj EObject for which to calculate the scope.
	 * @param mode Mode telling us whether to scope for TypedElements or Types.
	 * 
	 * @return An appropiate scope representation for the EObject.
	 */
	private def IScope getRecursiveScope(EObject obj, ScopeMode mode, boolean ignoreScopedIdentifier)
	{
		// Define local variables.
		var localIgnoreScopedIdentifier = ignoreScopedIdentifier;
		var Iterable<NamedElement> elements = emptyList
		var EObject curObj = obj.eContainer
		var EObject lastObj = obj
		var ScopeMode curMode = mode
		
		// Check objects and go up in the containment tree.
		while (curObj != null)
		{
			// Special cases.
			switch (curObj)
			{
				Variable:
					// In Variable indices, Type references are also allowed.
					if ("index".equals(lastObj.eContainmentFeature.name))
						curMode = ScopeMode.TYPES_AND_TYPED_ELEMENTS
						
				IdentifierExpression:
					if ("index".equals(lastObj.eContainmentFeature.name))
						localIgnoreScopedIdentifier = true
				
				ScopedIdentifierExpression case !localIgnoreScopedIdentifier:
					// The ScopedIdentifierExpression needs custom scoping, because it
					// may restrict the scope to certain structs etc.
					// For purposes of simplicity, we only scope simple chains of the form
					//    variable.struct_var1.struct_var2...
					// Complex scopes like
					//    (cond?variable1:variable2).struct_var1
					// will not be parsed.
					// TODO: Scope complex scopes.
					if (
						"identifier".equals(lastObj.eContainmentFeature.name) &&
						checkScopedIdentifierExpressionStructure(curObj)
					)
						return getScopedIdentifierExpressionScope(curObj)
			}
			
			// Scope for TypedElement's.
			if (curMode == ScopeMode.TYPED_ELEMENTS || curMode == ScopeMode.TYPES_AND_TYPED_ELEMENTS)
			{
				switch(curObj)
				{
					NTA:
						elements = elements + curObj.globalDeclarations.declaration
							.filter(typeof(TypedDeclaration))
							.bReduce(emptyList, TypedElementContainerReduction)
					Template:
					{
						elements = elements + curObj.parameter
							.bReduce(emptyList, TypedElementContainerReduction)
						if (curObj.declarations != null)
							elements = elements + curObj.declarations.declaration
							.filter(typeof(TypedDeclaration))
							.bReduce(emptyList, TypedElementContainerReduction)
					}
					de.uni_paderborn.uppaal.declarations.Function:
						elements = elements + curObj.parameter
							.bReduce(emptyList, TypedElementContainerReduction)
					Block:
					{
						if (curObj.declarations != null)
							elements = elements + curObj.declarations.declaration
							.filter(typeof(TypedDeclaration))
							.bReduce(emptyList, TypedElementContainerReduction)
					}
					Iteration:
						elements = elements + curObj.elements.filter(typeof(NamedElement))
					SystemDeclarations:
						elements = elements + curObj.declaration
							.filter(typeof(TypedDeclaration))
							.bReduce(emptyList, TypedElementContainerReduction)
					Edge:
						elements = elements + curObj.selection
							.bReduce(emptyList, TypedElementContainerReduction)
					QuantificationExpression:
						elements = elements + curObj.elements.filter(typeof(NamedElement))
				}
			}
			
			// Scope for DeclaredType and Type.
			if (curMode == ScopeMode.TYPES_AND_TYPED_ELEMENTS || curMode == ScopeMode.TYPES)
			{
				switch(curObj)
				{
					NTA:
						elements = elements + curObj.globalDeclarations.declaration
							.filter(typeof(TypeDeclaration))
							.bReduce(emptyList, TypeDeclarationReduction)
							+ getPredefinedTypes(curObj)
					Template:
					{
						if (curObj.declarations != null)
							elements = elements + curObj.declarations.declaration
								.filter(typeof(TypeDeclaration))
								.bReduce(emptyList, TypeDeclarationReduction)
					}
					SystemDeclarations:
						elements = elements + curObj.declaration
							.filter(typeof(TypeDeclaration))
							.bReduce(emptyList, TypeDeclarationReduction)
				}
			}
			
			// Create a new scope if necessary.
			if (elements.size > 0)
			{
				return Scopes::scopeFor(elements, getRecursiveScope(curObj, mode, localIgnoreScopedIdentifier))
			}
			
			lastObj = curObj
			curObj = curObj.eContainer
		}
		
		// Add predefined types if necessary.
		if (curMode == ScopeMode.TYPES_AND_TYPED_ELEMENTS || curMode == ScopeMode.TYPES)
		{
			val Library lib = getLibrary(lastObj);
			return Scopes::scopeFor(lib.types)
		}
		
		// In case of failure or end of recursion, return the empty scope.
		IScope::NULLSCOPE
	}
	
	/**
	 * Gets an instance of Library for the given context.
	 * 
	 * @param context EObject whose Library should be returned if there is one.
	 * 
	 * @return An instance of Library.
	 */
	private static def Library getLibrary(EObject context)
	{
		if (LIBRARY == null)
		{
			// Check if there is already a Library loaded in the context.
			if (context.eResource != null && context.eResource.resourceSet != null)
			{
				for (Resource res : context.eResource.resourceSet.resources)
				{
					for (EObject obj : res.contents)
					{
						if (obj instanceof Library)
						{
							LIBRARY = obj
							return LIBRARY
						}
					}
				}
				
				LIBRARY = context.eResource.resourceSet.getResource(
					URI.createURI("platform:/plugin/de.uni_paderborn.uppaal/model/stdlib.xmi", false), true
				).getContents().get(0) as Library;
			}
			else
			{
				LIBRARY = new ResourceSetImpl().getResource(
					URI.createURI("platform:/plugin/de.uni_paderborn.uppaal/model/stdlib.xmi", false), true
				).getContents().get(0) as Library;
			}
		}
		LIBRARY
	}
	
	/**
	 * Creates an empty Iterable for NamedElements.
	 * 
	 * @return Empty Iterable for NamedElements.
	 */
	private def Iterable<NamedElement> emptyList()
	{
		val Iterable<NamedElement> emptyList = newArrayList
		emptyList
	}

	/**
	 * Returns all the PredefinedTypes of the given NTA instance.
	 * 
	 * @param nta Instance of NTA.
	 * 
	 * @return Iterable of all the PredefinedTypes as NamedElements.
	 */
	private def Iterable<NamedElement> getPredefinedTypes(NTA nta)
	{
		emptyList
//		newArrayList(nta.bool, nta.chan, nta.clock, nta.int, nta.bool, nta.void)
	}
	
	/**
	 * Enumeration to distinguish between different aims for the scoping, i.e. whether we are
	 * interested in TypedElements or Types. As this may change during scoping (e.g. when we
	 * encounter an array structure) we need to be able to change it on-the-fly.
	 */
	private enum ScopeMode {
		TYPES, TYPED_ELEMENTS, TYPES_AND_TYPED_ELEMENTS
	}
	
	/**
	 * Better reduction function that allows start values etc.
	 * Thanks: http://shiggyenterprises.wordpress.com/2012/11/27/better-reduce-for-xtend/
	 * 
	 * @param iterable Iterable to reduce.
	 * @param initial Initial value of the combined value.
	 * @param fu Reduction function.
	 * 
	 * @return Reduced version of iterable.
	 */
	private def <T, V> T bReduce(Iterable<V> iterable, T initial, (T, V)=>T fu) {
		val i = iterable.iterator()
		var T out = initial
		while (i.hasNext())
		{
			out = fu.apply(out, i.next())
		}
		return out
	} 
}
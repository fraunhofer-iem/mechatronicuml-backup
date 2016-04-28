package org.muml.pim.common.naming;

import org.eclipse.emf.ecore.EObject;
import org.muml.mumlcore.NamedElement;
import org.muml.mumlcore.modelinstance.ModelElementCategory;

/**
 * Main class for computing QualifiedNames for EObjects and superclass of all concrete implementations
 * of QualifiedNameProviders. 
 * <p>You most likely do not want to instantiate this by itself, but use
 * one of the more specific implementations such as the {@link MumlQualifiedNameProvider}.
 * A typical way of instantiating this would be 
 * {@code new MySpecialNameProvider(new MumlQualifiedNameProvider(new QualifiedNameProvider()))},
 * specifying that MySpecialNameProvider should use a MumlQualifiedNameProvider as a 
 * fallback if it does not specify a name computation for an object itself. </p>
 * 
 * <p><b>Notes for implementors</b>:
 * You should inherit from this class and override getQualifiedName(EObject, EObject)
 * (see the method's javadoc for more details).<br>
 * Also, you should create at least one Constructor(QualifiedNameProvider delegate)
 * and all your constructors should call super(delegate) or super() appropriately.
 * This ensures that your delegate and delegationRoot fields are properly populated. 
 * (See {@link MumlQualifiedNameProvider} as an example implementation) </p>
 * 
 * <p>This particular QualifiedNameProvider itself computes a "default" QualifiedName 
 * using the 'name' attribute of the NamedElement class if it exists. This 
 * allows using this QualifiedNameProvider as a convenient fallback (read: delegate) for most 
 * QualifiedName computations.</p> 
 * 
 * <p><b>Implementation notes</b>:
 * The class is based on the notion of delegates as opposed to inheritance 
 * because it is not uncommon that some new language references several metamodels
 * and would wish to unify the QualifiedNameProviders for these metamodels. 
 * This is not possible to solve gracefully using single inheritance.</p> 
 *
 */
public class QualifiedNameProvider {
	protected QualifiedNameProvider delegate = null;
	protected QualifiedNameProvider delegationRoot;
	
	public QualifiedNameProvider() {
		this.delegationRoot = this;
	}
	
	/**
	 * Construct a new QualifiedNameProvider that delegates to 'delegate'
	 * whenever it cannot compute a qualified name itself
	 */
	public QualifiedNameProvider(QualifiedNameProvider delegate) {
		this.delegate = delegate;
		this.delegationRoot = this;
		delegate.delegationRoot = this.delegationRoot;
	}
	
	/**
	 * Returns the QualifiedName of 'object' wrt. 'scope'.<br>
	 * More specifically, the segment for 'scope' will never appear in the name.
	 * For example, getQualifiedName(someState, itsSuperstate) will only return
	 * "someState" (because we assume that the name is used in a context 
	 * explicitly linked to itsSuperstate).<br>
	 * Another example: If 'scope' is set to a CoordinationProtocol, 
	 * the QualifiedName would look like this: 
	 * role1.statechart1.itsSuperstate.someState.
	 * 
	 * <p>Implementations of QualifiedNameProvider should override this method.<br>
	 * You have access to fields 'delegate' and 'delegationRoot'. Please respect the following structure:
	 * <ul>
	 * 	<li>For object == null, return an empty QualifiedName</li>
	 *  <li>For object.equals(scope), return an empty QualifiedName</li>
	 * 	<li>If you know how to name the object, return its complete QualifiedName wrt. 'scope'.
	 * 		<ul>
	 *   		<li>You may want to call delegateRoot.getQualifiedName(object.eContainer, scope) (or similar)
	 *     and then append any the segment for 'object' itself.</li>
	 *     			<ul><li>Call it on delegateRoot! (Otherwise, more specific naming requirements of parent QualifiedNameProviders 
	 *       may not be considered)</li></ul>
	 *       	</li>
	 *       </ul>
	 * 	<li>If you do not know how to name the object, return delegate.getQualifiedName(object, scope)</li>
	 * </ul>
	 * 
	 * @param object the object to name
	 * @param scope any object that the name should be relative to. Or null.
	 * @return the QualifiedName for 'object'
	 */
	public QualifiedName getQualifiedName(EObject object, EObject scope) {
		if (object == null || object.equals(scope) || object instanceof ModelElementCategory)
			return new QualifiedName();
		if (object instanceof NamedElement)
			return delegationRoot.getQualifiedName(object.eContainer(), scope).append(((NamedElement) object).getName());
		if (delegate != null)
			return delegate.getQualifiedName(object, scope);
		
		throw new RuntimeException("Don't know how to compute the qualified name for "+object);
	}
	
	/**
	 * Returns the fully qualified name for 'object'
	 * Equivalent to getQualifiedName(object, null)
	 */
	public QualifiedName getQualifiedName(EObject object) {
		return getQualifiedName(object, null);
	}
}

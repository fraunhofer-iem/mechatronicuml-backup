package org.muml.pm.common.xtext;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.muml.mumlcore.NamedElement;

public class FujabaResourceServiceProvider extends DefaultResourceServiceProvider{

	final org.eclipse.xtext.resource.IContainer.Manager containerManager = new SimpleResourceDescriptionsBasedContainerManager();

	@Override
	public IResourceValidator getResourceValidator() {
		return new IResourceValidator() {

			@Override
			public List<Issue> validate(Resource resource, CheckMode mode,
					CancelIndicator indicator) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	@Override
	public Manager getResourceDescriptionManager() {
		return new Manager() {

			


			@Override
			public IResourceDescription getResourceDescription(Resource resource) {
				DefaultResourceDescriptionStrategy strat = new DefaultResourceDescriptionStrategy();
				strat.setQualifiedNameProvider(new IQualifiedNameProvider.AbstractImpl() {

					@Override
					public QualifiedName getFullyQualifiedName(EObject obj) {
						// TODO Auto-generated method stub
						if(obj instanceof NamedElement){
							if(((NamedElement) obj).getName()!=null){
								return  QualifiedName.create(((NamedElement) obj).getName());
							}
							else{
								return QualifiedName.create(obj.eClass().getName());
							}
						}
						else{
							return QualifiedName.create(obj.eClass().getName());
						}
					}
				});

				return new DefaultResourceDescription(resource, strat);
			}

			@Override
			public Delta createDelta(IResourceDescription oldDescription,
					IResourceDescription newDescription) {
				// TODO Auto-generated method stub
			 				return new DefaultResourceDescriptionDelta(oldDescription, newDescription);

			}

			@Override
			public boolean isAffected(Delta delta,
					IResourceDescription candidate)
					throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isAffected(Collection<Delta> deltas,
					IResourceDescription candidate,
					IResourceDescriptions context)
					throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

	@Override
	public org.eclipse.xtext.resource.IContainer.Manager getContainerManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canHandle(URI uri) {
		return uri.fileExtension().equals("fujaba");
	}

	@Override
	public IEncodingProvider getEncodingProvider() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T get(Class<T> t) {
		return null;
	}
	
	

}

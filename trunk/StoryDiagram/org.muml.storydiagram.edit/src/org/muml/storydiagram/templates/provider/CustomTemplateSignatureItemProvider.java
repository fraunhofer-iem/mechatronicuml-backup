package org.muml.storydiagram.templates.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.templates.provider.TemplateSignatureItemProvider;

public class CustomTemplateSignatureItemProvider extends TemplateSignatureItemProvider {
	public CustomTemplateSignatureItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("templates/TemplateSignature.png"); //$NON-NLS-1$
	}
}

package org.muml.eloquent.adapter.muml.ui;

import org.muml.psm.allocation.algorithm.ui.AbstractCreateASLFileHandler

class MUMLCreateASLFileHandler extends AbstractCreateASLFileHandler {

	override getTemplate(String name) {
		'''
		«name» {
			import 'http://www.muml.org/eloquent/adapter/muml/oclcontext/1.0.0'
			include 'platform:/plugin/org.muml.eloquent.adapter.muml/operations/OCLContext.ocl'
			
			oclContext oclcontext::OCLContext
			
			nameProvider 'org.muml.eloquent.adapter.muml.provider.MUMLNameProvider'
			storageProvider 'org.muml.eloquent.adapter.muml.provider.MUMLStorageProvider'
			
			relation allocate {
				descriptors (first : pim::instance::ComponentInstance, second : hardware::hwresourceinstance::ResourceInstance);
				lower 1;
				upper 1;
				ocl self.getAllSWInstances()->product(
					self.getAllStructuredHWInstances()
				);
			}
		}
		'''
	}

}

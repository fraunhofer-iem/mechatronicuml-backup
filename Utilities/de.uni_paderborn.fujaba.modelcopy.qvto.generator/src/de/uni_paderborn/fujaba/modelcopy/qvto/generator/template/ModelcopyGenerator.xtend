package de.uni_paderborn.fujaba.modelcopy.qvto.generator.template

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class ModelcopyGenerator {

	def fqn(EClass it) '''«EPackage.nsPrefix»::«name»'''
	def mapping(EClass it) '''«name»2«name»'''
	def packageImport(EPackage it) '''modeltype «nsPrefix» uses «nsPrefix»('«nsURI»');'''

	def createGenerator(EPackage it) '''
		library «name»2«name»;
		«val directPackages = (#[it] + ESubpackages)»
		«val additionalPackages = directPackages.map[EClassifiers].flatten.filter(EClass).map[EReferences].flatten.map[EType].map[EPackage].filterNull»
		«FOR it : (directPackages + additionalPackages).toSet»
			«packageImport»
		«ENDFOR»
		«createMappings»
	'''

	def String createMappings(EPackage it) '''
		«FOR it : getEClassifiers.filter(EClass)»
			«createMapping»
		«ENDFOR»
		«FOR it : getESubpackages»
			«createMappings»
		«ENDFOR»
		'''

	def createMapping(EClass it) '''
		mapping «fqn»::«mapping»() : «fqn»{
			«FOR it : getEAttributes»
				_«name» := self._«name»;
			«ENDFOR»
			«FOR it : getEReferences»
				_«name» := self._«name».map «(getEType as EClass).mapping»();
			«ENDFOR»
		}
		'''
}
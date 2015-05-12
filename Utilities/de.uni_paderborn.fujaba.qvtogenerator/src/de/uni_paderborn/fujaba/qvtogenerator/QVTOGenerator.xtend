package de.uni_paderborn.fujaba.qvtogenerator

import java.util.HashSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.core.runtime.Platform

class QVTOGenerator implements IGenerator{
	
	var HashSet<EPackage> packages = new HashSet<EPackage>
	
	var HashSet<Resource> models = new HashSet<Resource>();
	
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
			var EObject curObject = input.contents.get(0);
			
			//Add your models
			models.add("/de.uni_paderborn.fujaba.modelinstance/model/modelinstance.ecore".loadModel)
		 	models.add('/de.uni_paderborn.fujaba.muml/model/muml.ecore'.loadModel)
			models.add('/org.storydriven.core/model/core.ecore'.loadModel)
			models.add('/de.uni_paderborn.fujaba.qvtogenerator/model2/Ecore.ecore'.loadModel)
			models.add('/de.uni_paderborn.fujaba.muml.actionlanguage/model/actionlanguage.ecore'.loadModel)
			models.add('/de.uni_paderborn.fujaba.muml.verification.extension/model/verificationExtension.ecore'.loadModel)
			models.add('/de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl/model/Mtctl.ecore'.loadModel)
		
			collectSubPackages(models)
			if(curObject instanceof EPackage){
				switch curObject {
					EPackage case curObject.name == 'muml' : fsa.generateFile('''MUML2MUML.qvto''', '''«curObject.initialize»''')
					default : return
					} 			
			}
	}
	
	def dispatch String initialize(EPackage modelInstancePackage){
		return '''library MUML2MUML;
«createPackageImport()»

	«FOR p : packages»
	«p.createMappingsForEClasses»
	«ENDFOR»
	'''
	}
	
	def dispatch String initialize(EObject dummy){
		return ''''''
	}
   
   def collectSubPackages(HashSet<Resource> models){
   		var HashSet<EPackage> packages = new HashSet;
   		for(curModel : models)
   			for(curContent : curModel.contents){
   				switch curContent{
   					EPackage case curContent : curContent.addToPackages
   					default : packages = packages
   				}
   			}
   				
   }
   def  createPackageImport()
   {
		return '''
		«FOR p : packages» 
modeltype «p.nsPrefix» uses '«p.nsURI»';
«ENDFOR»'''
   } 
   def dispatch void addToPackages(EPackage p){
   		packages += p
   		for(subPackage : p.ESubpackages) subPackage.addToPackages	
   }
   
   def dispatch void addToPackages(EObject object){
   	
   }
   
    def createMappingsForEClasses(EPackage ePackage){
   	packages += ePackage
   	for(i : ePackage.EClassifiers){
   		switch i{
   			EClass case i : i.createMapping
   		}
   	}
	return 
	'''	«FOR i: ePackage.EClassifiers»
   			«i.createMapping»
    	«ENDFOR»
   		'''
   			
   		}
    
 	 def dispatch createMapping(EClass eClassi){
 	 	if(!eClassi.abstract){
 	 		if(eClassi.createDisjunct != null){
 	 			return '''mapping «eClassi.EPackage.packagePrefix»«eClassi.name» :: «eClassi.name»2«eClassi.name»() : «eClassi.EPackage.packagePrefix»«eClassi.name» «eClassi.createDisjunct», «eClassi.EPackage.packagePrefix»«eClassi.name»::normal«eClassi.name»2«eClassi.name»;
 	 			
 mapping «eClassi.EPackage.packagePrefix»«eClassi.name» :: normal«eClassi.name»2«eClassi.name»() : «eClassi.EPackage.packagePrefix»«eClassi.name»{
 «eClassi.createReferences»
 }
 	 			
 	 			'''
 	 			}

 	 		return '''mapping «eClassi.EPackage.packagePrefix»«eClassi.name» :: «eClassi.name»2«eClassi.name»() : «eClassi.EPackage.packagePrefix»«eClassi.name»{
    	«eClassi.createReferences»
   		 }
   		 
    	'''
    	}
    	if (eClassi.createDisjunct != null)
      	return '''mapping «eClassi.EPackage.packagePrefix»«eClassi.name» :: «eClassi.name»2«eClassi.name»() : «eClassi.EPackage.packagePrefix»«eClassi.name» «eClassi.createDisjunct»;
      	
      	'''
      else return ''''''
    	}
     
    def dispatch createMapping(EClassifier eClassi)'''
    '''
    
    def dispatch String createDisjunct(EClass abstractClass){
    var String s ='''disjuncts
    «FOR i:abstractClass.extendingTypes»
	«IF i.hasNonAbstractExtendingClasses»		«i.createSingleDisjunct»«ENDIF»
	«ENDFOR»'''
    	if(s.lastIndexOf(",")!=-1){
    		var String s1 =s.substring(0, s.lastIndexOf(","));
    		return '''«s1»'''
    	}    	
    	return null
    }
    
    def dispatch createDisjunct(Object dummy)''''''
    
    //TODO commented code is for using late resolve, such that the case distinction in line 176 is not needed anymore (The distinction is valid only for the original models)
    def dispatch String createReferences(EClass eClass)
     '''
       	«FOR i : eClass.EAllAttributes»
    		«IF !i.derived»
«««    			«IF i.name == 'ordered' || i.name == 'derived' || i.name =='literal' || i.name == 'abstract' || i.name == 'references'»
«««    				_«i.name» := self._«i.name»;
«««    			«ELSE»
    				_«i.name» := self._«i.name»;
«««    			«ENDIF»
    		«ENDIF»
    	«ENDFOR»
    	«FOR i : eClass.EAllReferences»
   		«IF !i.derived && i.changeable &&i.EType.hasNonAbstractExtendingClasses»
            «IF eClass.name != 'StaticStructuredComponent' && i.name == 'connectors' 
                || i.name == 'connectorInstances' || i.name == 'references'»
            _«i.name» += self.«i.name».map «i.EType.name»2«i.EType.name»(); «ELSE»
            _«i.name» := self._«i.name».map «i.EType.name»2«i.EType.name»();
            «ENDIF»
    	«ENDIF»
    	«ENDFOR»
    	'''
   
    def dispatch String createReferences(EClassifier eClassi){
    	return ''''''
    }
    
    def dispatch String createSingleDisjunct(EClass eClass){
    return '''«eClass.EPackage.packagePrefix»«eClass.name»::«eClass.name»2«eClass.name»,'''
    }
    
    def dispatch createSingleDisjunct(EClassifier eClass) ''''''
    
    def getExtendingTypes(EClassifier superType){
    	switch superType{
    		EClass case superType : {
    			var HashSet<EClassifier> extendingTypes = new HashSet
   				for(i : packages)
    				for(k : i.EClassifiers)
    					if(k!= superType && superType.isSuperTypeOfClassifier(k))
    						extendingTypes += k
    	
    			return extendingTypes	
    		}
    	}	
    }
    
    def Boolean hasNonAbstractExtendingClasses(EClassifier superType){
    	switch superType{
    		EClass case superType : if(!superType.abstract) return true
    	}
    	for(curType: superType.extendingTypes)
    		switch curType{
    			EClass case curType : {
    				if(!curType.abstract) return true
    				else for(nextType : curType.extendingTypes)
							if(nextType.hasNonAbstractExtendingClasses) return true
						return false
    			}
    		}
    	return false
    }
    
    def dispatch Boolean isSuperTypeOfClassifier(EClass superType, EClass type){

    	for(sT : type.ESuperTypes)
    		if(sT.name == superType.name && sT.EPackage.packagePrefix.toString.equals(superType.EPackage.packagePrefix.toString))
    			return true
    	return false
    }

    
    def dispatch Boolean isSuperTypeOfClassifier(EClass superType, EClassifier type){
    	return false
    }

    def Resource loadModel(String path){

		val projectPath = System.getProperty("user.dir");
		val absoluteModelPath= projectPath.replace("\\de.uni_paderborn.fujaba.qvtogenerator", path)
		val modelURI = URI.createFileURI(absoluteModelPath)
    	
    //	val modelURI = URI.createPlatformPluginURI(path, true)
    	
    	val uselocation = this.class.protectionDomain.codeSource.location
    	//.class.getProtectionDomain().getCodeSource().getLocation()
    	
    	val resSet = new ResourceSetImpl
		val resource = resSet.getResource(modelURI.trimFragment, true)
		return resource
    }
    
    
    def getPackagePrefix(EPackage ePackage) '''«IF ePackage.ESuperPackage!=null»«ePackage.ESuperPackage.packagePrefix»«ENDIF»«IF ePackage.name != ""»«ePackage.name»::«ENDIF»'''
}
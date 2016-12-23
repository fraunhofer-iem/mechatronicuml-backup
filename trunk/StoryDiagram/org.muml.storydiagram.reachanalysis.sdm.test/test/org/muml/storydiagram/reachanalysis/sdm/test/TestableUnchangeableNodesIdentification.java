package org.muml.storydiagram.reachanalysis.sdm.test;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.reachanalysis.sdm.UnchangeableNodesIdentification;

public class TestableUnchangeableNodesIdentification extends
		UnchangeableNodesIdentification {

	@Override
	protected boolean extendByClassesWithBidirectionalReference(
			Set<EClass> changeableClasses, Set<EClass> usedObjectVariableClasses) {
		// TODO Auto-generated method stub
		return super.extendByClassesWithBidirectionalReference(changeableClasses,
				usedObjectVariableClasses);
	}

	@Override
	public Set<EClass> identifyUnchangeableNodes(List<Activity> activities,
			Set<EObject> initialGraphObjects) {
		// TODO Auto-generated method stub
		return super.identifyUnchangeableNodes(activities, initialGraphObjects);
	}

	@Override
	protected Set<EClass> identifyClassesOfInitialGraphObjects(
			Set<EObject> initialGraphObjects) {
		// TODO Auto-generated method stub
		return super.identifyClassesOfInitialGraphObjects(initialGraphObjects);
	}

	@Override
	protected Set<EClass> identifyChangeableObjectVariables(
			List<Activity> activities, Set<EClass> usedObjectVariableClasses,
			Set<EClass> classesOfInitialGraphObjects) {
		// TODO Auto-generated method stub
		return super.identifyChangeableObjectVariables(activities,
				usedObjectVariableClasses, classesOfInitialGraphObjects);
	}

	@Override
	protected void analyzeStoryDiagram(Activity activity,
			Set<EClass> changableClasses, Set<EClass> usedObjectVariableClasses) {
		// TODO Auto-generated method stub
		super.analyzeStoryDiagram(activity, changableClasses, usedObjectVariableClasses);
	}

	@Override
	protected boolean identifySubclassesOfChangeableNodes(
			Set<EClass> changeableClasses, Set<EClass> usedObjectVariableClasses) {
		// TODO Auto-generated method stub
		return super.identifySubclassesOfChangeableNodes(changeableClasses,
				usedObjectVariableClasses);
	}

	@Override
	protected boolean extendByContainedClasses(Set<EClass> changeableClasses,
			Set<EClass> usedObjectVariableClasses,
			Set<EClass> classesOfInitialGraphObjects) {
		// TODO Auto-generated method stub
		return super.extendByContainedClasses(changeableClasses,
				usedObjectVariableClasses, classesOfInitialGraphObjects);
	}

	@Override
	protected boolean extendByClassesOfChangeableInitialNodes(
			Set<EClass> changeableClasses,
			Set<EClass> usedObjectVariableClasses,
			Set<EClass> classesOfInitialGraphObjects) {
		// TODO Auto-generated method stub
		return super.extendByClassesOfChangeableInitialNodes(changeableClasses,
				usedObjectVariableClasses, classesOfInitialGraphObjects);
	}

	@Override
	protected boolean containsChangeableNode(EClass currentClazz,
			Set<EClass> changeableClasses) {
		// TODO Auto-generated method stub
		return super.containsChangeableNode(currentClazz, changeableClasses);
	}

	@Override
	protected boolean isSubClassChangeable(EClass tgtClazz,
			Set<EClass> changeableClasses) {
		// TODO Auto-generated method stub
		return super.isSubClassChangeable(tgtClazz, changeableClasses);
	}

}

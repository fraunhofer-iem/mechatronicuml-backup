
package org.muml.pim.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class TransitionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TransitionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorPriority_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorClockConstraints_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorGuard_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorEvents_property_tab_conditionTab_0_Editor(), false);

			addPropertyEditor(createEditorEvents_property_tab_effectTab_1_Editor(), false);

			addPropertyEditor(createEditorSynchronization_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorTarget_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorClockResets_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorAbsoluteDeadlines_property_tab_deadlineTab_Editor(), false);

			addPropertyEditor(createEditorRelativeDeadline_property_tab_deadlineTab_Editor(), false);

			addPropertyEditor(createEditorAction_property_tab_effectTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorBlockable_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUrgent_property_tab_generalTab_Editor(),
					false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

			addPropertyEditor(createEditorClockConstraints_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorGuard_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorEvents_property_tab_conditionTab_0_Editor(), false);

			addPropertyEditor(createEditorSynchronization_property_tab_conditionTab_Editor(), false);

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

			addPropertyEditor(createEditorEvents_property_tab_effectTab_1_Editor(), false);

			addPropertyEditor(createEditorClockResets_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorAction_property_tab_effectTab_Editor(), false);

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

			addPropertyEditor(createEditorAbsoluteDeadlines_property_tab_deadlineTab_Editor(), false);

			addPropertyEditor(createEditorRelativeDeadline_property_tab_deadlineTab_Editor(), false);

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorPriority_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSource_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorBlockable_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUrgent_property_tab_generalTab_Editor(),
					false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClockConstraints_property_tab_conditionTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClockConstraints_property_tab_conditionTab_Editor() {
		if (this.editorClockConstraints_property_tab_conditionTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockConstraints();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A clock constraint restricts when the transition can be activeted in dependency of the values of the clock.");

			this.editorClockConstraints_property_tab_conditionTab = editor;
		}
		return this.editorClockConstraints_property_tab_conditionTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGuard_property_tab_conditionTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGuard_property_tab_conditionTab_Editor() {
		if (this.editorGuard_property_tab_conditionTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Guard();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.pim.actionlanguage.xtext.ui.properties.XtextPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The guard of a transition is defined by an expression which should have return type boolean. Comparing clock values is not allowed (use clock constraints instead).");

			this.editorGuard_property_tab_conditionTab = editor;
		}
		return this.editorGuard_property_tab_conditionTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEvents_property_tab_conditionTab_0;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEvents_property_tab_conditionTab_0_Editor() {
		if (this.editorEvents_property_tab_conditionTab_0 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Events();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			{
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});

				final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
				org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);

				try {
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"if(self.statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(pim::connector::DiscreteInteractionEndpoint) and not self.statechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pim::connector::DiscreteInteractionEndpoint).coordinatorBehavior.oclIsUndefined() )then\n	not  self.statechart->closure(s:RealtimeStatechart|   let parent : RealtimeStatechart = s.parentRegion.parentState.parentStatechart in \n		if(parent.oclIsInvalid()) \n			then self.statechart \n		else parent \n		 endif )->includes(self.statechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pim::connector::DiscreteInteractionEndpoint).coordinatorBehavior) \nelse \n	 	true \nendif");

					org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {
						@Override
						public boolean select(Object object) {
							return object != null && Boolean.TRUE.equals(ocl.evaluate(object, oclExpression));
						}
					};
					if (filter != null) {
						editor.addVisibilityFilter(filter);
					}

				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("All events which belong to this transition.");

			this.editorEvents_property_tab_conditionTab_0 = editor;
		}
		return this.editorEvents_property_tab_conditionTab_0;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEvents_property_tab_effectTab_1;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEvents_property_tab_effectTab_1_Editor() {
		if (this.editorEvents_property_tab_effectTab_1 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Events();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			{
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});

				final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
				org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);

				try {
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"if(self.statechart.getPortOrRoleStatechart().behavioralElement.oclIsKindOf(pim::connector::DiscreteInteractionEndpoint) and not self.statechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pim::connector::DiscreteInteractionEndpoint).coordinatorBehavior.oclIsUndefined() )then\n	not  self.statechart->closure(s:RealtimeStatechart|   let parent : RealtimeStatechart = s.parentRegion.parentState.parentStatechart in \n		if(parent.oclIsInvalid()) \n			then self.statechart \n		else parent \n		 endif )->includes(self.statechart.getPortOrRoleStatechart().behavioralElement.oclAsType(pim::connector::DiscreteInteractionEndpoint).coordinatorBehavior) \nelse \n	 	true \nendif");

					org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {
						@Override
						public boolean select(Object object) {
							return object != null && Boolean.TRUE.equals(ocl.evaluate(object, oclExpression));
						}
					};
					if (filter != null) {
						editor.addVisibilityFilter(filter);
					}

				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("All events which belong to this transition.");

			this.editorEvents_property_tab_effectTab_1 = editor;
		}
		return this.editorEvents_property_tab_effectTab_1;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSynchronization_property_tab_conditionTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSynchronization_property_tab_conditionTab_Editor() {
		if (this.editorSynchronization_property_tab_conditionTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Synchronization();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The synchronisation which is sent upon activation of this transition.");

			this.editorSynchronization_property_tab_conditionTab = editor;
		}
		return this.editorSynchronization_property_tab_conditionTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTarget_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTarget_property_tab_generalTab_Editor() {
		if (this.editorTarget_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Target();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The state which is the target of this transition.");

			this.editorTarget_property_tab_generalTab = editor;
		}
		return this.editorTarget_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSource_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSource_property_tab_generalTab_Editor() {
		if (this.editorSource_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Source();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The state which is the source of this transition.");

			this.editorSource_property_tab_generalTab = editor;
		}
		return this.editorSource_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClockResets_property_tab_effectTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClockResets_property_tab_effectTab_Editor() {
		if (this.editorClockResets_property_tab_effectTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockResets();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The clock resets of this transition.");

			this.editorClockResets_property_tab_effectTab = editor;
		}
		return this.editorClockResets_property_tab_effectTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAbsoluteDeadlines_property_tab_deadlineTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAbsoluteDeadlines_property_tab_deadlineTab_Editor() {
		if (this.editorAbsoluteDeadlines_property_tab_deadlineTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_AbsoluteDeadlines();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("a transition can has one or more absolute deadlines");

			this.editorAbsoluteDeadlines_property_tab_deadlineTab = editor;
		}
		return this.editorAbsoluteDeadlines_property_tab_deadlineTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRelativeDeadline_property_tab_deadlineTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorRelativeDeadline_property_tab_deadlineTab_Editor() {
		if (this.editorRelativeDeadline_property_tab_deadlineTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_RelativeDeadline();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("a transition can have one relative deadline");

			this.editorRelativeDeadline_property_tab_deadlineTab = editor;
		}
		return this.editorRelativeDeadline_property_tab_deadlineTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBlockable_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBlockable_property_tab_generalTab_Editor() {
		if (this.editorBlockable_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Blockable();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Needed for failure propagation.");

			this.editorBlockable_property_tab_generalTab = editor;
		}
		return this.editorBlockable_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAction_property_tab_effectTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAction_property_tab_effectTab_Editor() {
		if (this.editorAction_property_tab_effectTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Action();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The side effect of this transition. A side effect might be a variable assignment as well as a method invocation.");

			this.editorAction_property_tab_effectTab = editor;
		}
		return this.editorAction_property_tab_effectTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUrgent_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUrgent_property_tab_generalTab_Editor() {
		if (this.editorUrgent_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Urgent();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Indicates whether this transition fires immediately when it is enabled.");

			this.editorUrgent_property_tab_generalTab = editor;
		}
		return this.editorUrgent_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPriority_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPriority_property_tab_generalTab_Editor() {
		if (this.editorPriority_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizedElement_Priority();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The integer value that represents the priority.");

			this.editorPriority_property_tab_generalTab = editor;
		}
		return this.editorPriority_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TransitionEditor(String tab) {
		this(tab, org.muml.pim.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getTransition());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new TransitionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.condition", "property.tab.condition",
					"property.tab.condition", "property.tab.effect", "property.tab.condition", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.effect", "property.tab.deadline",
					"property.tab.deadline", "property.tab.general", "property.tab.effect", "property.tab.general",
					"property.tab.documentation", "property.tab.extensions", "property.tab.general"}).contains(tab);
		}
	}

}

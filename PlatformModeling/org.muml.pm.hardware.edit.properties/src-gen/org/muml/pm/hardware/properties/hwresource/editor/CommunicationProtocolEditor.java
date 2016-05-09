
package org.muml.pm.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public abstract class CommunicationProtocolEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CommunicationProtocolEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFurtherInformation_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsTimeTriggered_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsEventTriggered_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsNetworkingProtocol_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorIsSerial_property_tab_generalTab_Editor(),
					false);

			addPropertyEditor(createEditorDataFrameSize_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBandwidth_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFurtherInformation_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsTimeTriggered_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsEventTriggered_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorIsNetworkingProtocol_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorIsSerial_property_tab_generalTab_Editor(),
					false);

			addPropertyEditor(createEditorDataFrameSize_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBandwidth_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIsTimeTriggered_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIsTimeTriggered_property_tab_generalTab_Editor() {
		if (this.editorIsTimeTriggered_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_IsTimeTriggered();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Determines if the protocol is time triggered. ");

			this.editorIsTimeTriggered_property_tab_generalTab = editor;
		}
		return this.editorIsTimeTriggered_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIsEventTriggered_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIsEventTriggered_property_tab_generalTab_Editor() {
		if (this.editorIsEventTriggered_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_IsEventTriggered();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Determines if this protocol is event triggered.");

			this.editorIsEventTriggered_property_tab_generalTab = editor;
		}
		return this.editorIsEventTriggered_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFurtherInformation_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFurtherInformation_property_tab_generalTab_Editor() {
		if (this.editorFurtherInformation_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_FurtherInformation();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("Further information for this protocol (i.e. Version, or another Protocol).");

			this.editorFurtherInformation_property_tab_generalTab = editor;
		}
		return this.editorFurtherInformation_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIsNetworkingProtocol_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIsNetworkingProtocol_property_tab_generalTab_Editor() {
		if (this.editorIsNetworkingProtocol_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_IsNetworkingProtocol();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Used t inidicate wether this Protocol is used for Networking ECUs or for triggering Sensors or Actuators.");

			this.editorIsNetworkingProtocol_property_tab_generalTab = editor;
		}
		return this.editorIsNetworkingProtocol_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIsSerial_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIsSerial_property_tab_generalTab_Editor() {
		if (this.editorIsSerial_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_IsSerial();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Determines if this CommunicationMedia uses a serial communication.");

			this.editorIsSerial_property_tab_generalTab = editor;
		}
		return this.editorIsSerial_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDataFrameSize_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDataFrameSize_property_tab_generalTab_Editor() {
		if (this.editorDataFrameSize_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_DataFrameSize();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The size of a data frame.");

			this.editorDataFrameSize_property_tab_generalTab = editor;
		}
		return this.editorDataFrameSize_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBandwidth_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBandwidth_property_tab_generalTab_Editor() {
		if (this.editorBandwidth_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pm.hardware.hwresource.HwresourcePackage.eINSTANCE
					.getCommunicationProtocol_Bandwidth();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The bandwidth of this CommunicationMedia.");

			this.editorBandwidth_property_tab_generalTab = editor;
		}
		return this.editorBandwidth_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
				org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);

				try {
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)");
					editor.setInitializeExpression(oclExpression);
				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_property_tab_generalTab = editor;
		}
		return this.editorName_property_tab_generalTab;
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

}

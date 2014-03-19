package org.eclipse.emf.codegen.ecore.merge;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimePlatform;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class GenModelGeneratorAdapter extends GenBaseGeneratorAdapter {
	protected static final String TEMPLATES_PATH = "/templates";

	protected static final int MODEL_PLUGIN_XML_ID = 0;
	protected static final int EDIT_PLUGIN_XML_ID = 1;

	private static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS = {
			new JETEmitterDescriptor("model/plugin.xmljet",
					"org.eclipse.emf.codegen.ecore.templates.model.PluginXML"),
			new JETEmitterDescriptor("edit/plugin.xmljet",
					"org.eclipse.emf.codegen.ecore.templates.edit.PluginXML"), //
	};

	private static final int INDENT = 3;

	/**
	 * Returns the set of <code>JETEmitterDescriptor</code>s used by the
	 * adapter. The contents of the returned array should never be changed.
	 * Rather, subclasses may override this method to return a different array
	 * altogether.
	 */
	protected JETEmitterDescriptor[] getJETEmitterDescriptors() {
		return JET_EMITTER_DESCRIPTORS;
	}

	public GenModelGeneratorAdapter(
			GeneratorAdapterFactory generatorAdapterFactory) {
		super(generatorAdapterFactory);
	}

	/**
	 * Returns the {@link GenModel}'s packages.
	 */
	@Override
	public Collection<?> getGenerateChildren(Object object, Object projectType) {
		return new ArrayList<GenPackage>(((GenModel) object).getGenPackages());
	}

	/**
	 * Prepares the {@link GenModel} for generation.
	 */
	@Override
	protected Diagnostic doPreGenerate(Object object, Object projectType) {
		((GenModel) object).getStaticGenPackages();
		return Diagnostic.OK_INSTANCE;
	}

	@Override
	protected Diagnostic generateModel(Object object, Monitor monitor) {
		monitor.beginTask("", 7);

		GenModel genModel = (GenModel) object;
		message = CodeGenEcorePlugin.INSTANCE
				.getString("_UI_GeneratingPackages_message");
		monitor.subTask(message);

		ensureProjectExists(genModel.getModelDirectory(), genModel,
				MODEL_PROJECT_TYPE, genModel.isUpdateClasspath(),
				createMonitor(monitor, 1));

		generateModelManifest(genModel, monitor);

		return Diagnostic.OK_INSTANCE;
	}

	protected void generateModelManifest(GenModel genModel, Monitor monitor) {
		if (genModel.hasPluginSupport() && !genModel.sameModelEditProject()
				&& !genModel.sameModelEditorProject()) {
			if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT) {

				monitor.worked(1);

				generateAndMerge(
						genModel.getModelProjectDirectory(),
						"plugin.xml",
						getJETEmitter(getJETEmitterDescriptors(),
								MODEL_PLUGIN_XML_ID), monitor);
			} else {
				monitor.worked(1);
			}
		} else {
			monitor.worked(2);
		}
	}

	@Override
	protected Diagnostic generateEdit(Object object, Monitor monitor) {
		monitor.beginTask("", 9);

		GenModel genModel = (GenModel) object;
		message = CodeGenEcorePlugin.INSTANCE
				.getString("_UI_GeneratingEditPackages_message");
		monitor.subTask(message);

		ensureProjectExists(genModel.getEditDirectory(), genModel,
				EDIT_PROJECT_TYPE, genModel.isUpdateClasspath(),
				createMonitor(monitor, 1));

		monitor.worked(2);

		generateEditManifest(genModel, monitor);

		return Diagnostic.OK_INSTANCE;
	}

	protected void generateEditManifest(GenModel genModel, Monitor monitor) {
		if (!genModel.sameEditEditorProject()) {

			monitor.worked(1);

			if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT) {
				message = CodeGenEcorePlugin.INSTANCE
						.getString("_UI_GeneratingEditPluginXML_message");
				monitor.subTask(message);

				generateAndMerge(
						genModel.getEditProjectDirectory(),
						"plugin.xml",
						getJETEmitter(getJETEmitterDescriptors(),
								EDIT_PLUGIN_XML_ID), monitor);
			} else {
				monitor.worked(1);
			}
		} else {
			monitor.worked(2);
		}
	}

	private void generateAndMerge(String projectDir, String targetFilename,
			JETEmitter jetEmitter, Monitor monitor) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		IProject project = root.getProject(projectDir);
		IFile ifile = project.getFile(targetFilename);
		File file = ifile.getLocation().toFile();

		// READ
		Document before = null;
		DocumentBuilder builder = null;
		try {

			DocumentBuilderFactory builderFactory = DocumentBuilderFactory
					.newInstance();

			builder = builderFactory.newDocumentBuilder();

			before = builder.parse(new FileInputStream(file.getAbsolutePath()));

		} catch (Exception e) {
			// original file is not readable.
			// we ignore and just use the new file without merging.

		}

		// GENERATE
		message = CodeGenEcorePlugin.INSTANCE
				.getString("_UI_GeneratingModelPluginXML_message");
		monitor.subTask(message);

		URI targetFile = toURI(ifile.toString());
		setLineDelimiter(getLineDelimiter(targetFile, MANIFEST_ENCODING));

		String emitterResult = null;
		Document after = null;
		try {
			emitterResult = jetEmitter.generate(createMonitor(monitor, 1),
					new Object[] { generatingObject }, getLineDelimiter());
			after = builder.parse(new InputSource(new StringReader(
					emitterResult)));
		} catch (Exception exception) {
			MergerPlugin.INSTANCE.log(exception);
		}
		
		
		// MERGE
		PluginXmlMerger merger = new PluginXmlMerger(INDENT);
		merger.addAnnotation(after);
		Document merged = after;
		if (before != null && after != null) {
			merged = merger.merge(before, after);
		}
		if (merged == null) {
			merged = before;
		}

		// WRITE BACK
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		transformerFactory.setAttribute("indent-number", INDENT);
        
		Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer(); 
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(merged);
			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);
			ifile.refreshLocal(0, null);
		} catch (Exception e) {
			MergerPlugin.INSTANCE.log(e);
		} finally {
			monitor.done();
		}
	}

	@Override
	public void notifyChanged(Notification notification) {
		switch (notification.getFeatureID(GenModel.class)) {
		case GenModelPackage.GEN_MODEL__REDIRECTION:
		case GenModelPackage.GEN_MODEL__FORCE_OVERWRITE:
		case GenModelPackage.GEN_MODEL__DYNAMIC_TEMPLATES:
		case GenModelPackage.GEN_MODEL__TEMPLATE_DIRECTORY:
		case GenModelPackage.GEN_MODEL__FACADE_HELPER_CLASS:
		case GenModelPackage.GEN_MODEL__CODE_FORMATTING:
			getGenerator().requestInitialize();
			break;
		}
		super.notifyChanged(notification);
	}

}

package de.uni_paderborn.fujaba.common.emf.edit.ui.typedelement;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.common.emf.edit.ui.validator.IValidator;

/**
 * Default implementation of AbstractTypedElementParser; it requires an instance
 * class to create concrete objects.
 * 
 * @author bingo
 * 
 */
public class DefaultTypedElementParser extends AbstractTypedElementParser {

	/**
	 * The instance class to create concrete objects.
	 */
	protected EClass instanceClass;

	/**
	 * Constructs this DefaultTypedElementParser.
	 * 
	 * @param typeChoices
	 *            The valid types for the typed element.
	 * @param nameValidator
	 *            The validator for the identifier name.
	 * @param instanceClass
	 *            The instance class to create concrete objects.
	 */
	public DefaultTypedElementParser(List<EClassifier> typeChoices,
			IValidator nameValidator, EClass instanceClass) {
		super(typeChoices, nameValidator);
		this.instanceClass = instanceClass;
	}

	@Override
	protected ETypedElement doCreateObject() {
		return (ETypedElement) EcoreUtil.create(instanceClass);
	}

}

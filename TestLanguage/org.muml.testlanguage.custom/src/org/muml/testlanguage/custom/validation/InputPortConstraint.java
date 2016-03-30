package org.muml.testlanguage.custom.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.muml.testlanguage.Input;

public class InputPortConstraint extends AbstractModelConstraint {

	public InputPortConstraint() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		
		// Get the input port that should be validated.
		final Input input = (Input) ctx.getTarget();

		// Check whether this input port is connected.
		if (input.getSource() == null) {

			// If the port is mandatory, it should have a connection.
			if (!input.isOptional()) {
				return ctx.createFailureStatus(new Object[] { input.getName(),
						"Mandatory input must be connected." });
			}

		} else {

			// Check whether we actually get data.
			if (input.getSource().getData() == null) {

				// If the port is mandatory, it should get data.
				if (!input.isOptional()) {
					return ctx.createFailureStatus(new Object[] {
							input.getName(),
							"Output \"" + input.getSource().getName()
									+ "\" does not deliver any data." });
				}

			} else {

				// At this point we have a connection and get data. What remains
				// is to check whether this data conforms with the type that was
				// put into the PortSpecification, if any.				
				if (input.getDataType() != null
						&& !input.getDataType().isInstance(
								input.getSource().getData())) {
					return ctx.createFailureStatus(new Object[] {
							input.getName(),
							"Expected type \""
									+ input.getDataType().toString()
									+ "\", got type \""
									+ input.getSource().getData().getClass()
											.toString() + "\"" });
				}

			}
		}

		return ctx.createSuccessStatus();
	}
}

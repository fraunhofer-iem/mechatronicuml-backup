package org.muml.modelica.adapter.rtsc.util.query;

import java.util.List;

import org.eclipse.acceleo.engine.AcceleoEnginePlugin;

public class ErrorReporter {
	
	public boolean displayErrors(List<String> errorStringList) {
		return displayInErrorLog(errorStringList, true);
	}
	
	public boolean displayWarnings(List<String> warningStringList) {
		return displayInErrorLog(warningStringList, false);
	}
	
	public boolean displayInErrorLog(List<String> stringList, boolean isError) {
		for (String msg : stringList) {
			AcceleoEnginePlugin.log(msg, isError);
		}
		return !stringList.isEmpty();
	}
}

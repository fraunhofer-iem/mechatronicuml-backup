package org.muml.simulink.adapter.m2t.xtend;

import java.io.IOException;
import java.io.Reader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.IExecutionContextAware;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.expression.ResourceParser;

public class CopyUtil implements IExecutionContextAware {
		
	private ResourceManager resMan = null;
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	
	public String mdlFileToString(String source)
	{
		this.logger.info("Reading file " + source + ".mdl");
		return resMan.loadResource(source, "mdl").toString();
	}

	@Override
	public void setExecutionContext(ExecutionContext ctx) {
		this.resMan = ctx.getResourceManager();
		resMan.registerParser("mdl", new NoopParser());
	}
		
	private class NoopParser implements ResourceParser
	{
		@Override
		public Resource parse(Reader in, final String fileName) {
			final StringBuffer sBuffer = new StringBuffer();
			char[] cBuffer =  new char[0xFFFF];
			int len;
			try {
				while( (len = in.read(cBuffer)) != -1)
					sBuffer.append( cBuffer, 0, len );
			} catch (IOException e) {
				e.printStackTrace();
			}
			return new StringResource(fileName, sBuffer.toString());		
		}
	}
	
	private class StringResource implements Resource
	{
		private String fqn = null;
		private String content = null;
		
		public StringResource(String fqn, String content)
		{
			this.fqn = fqn;
			this.content = content;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return this.fqn;
		}

		@Override
		public void setFullyQualifiedName(String fqn) {
			this.fqn = fqn;
		}

		@Override
		public String[] getImportedNamespaces() {
			return new String[]{};
		}

		@Override
		public String[] getImportedExtensions() {
			return new String[]{};
		}
		
		@Override 
		public String toString()
		{
			return this.content;
		}		
	}
}

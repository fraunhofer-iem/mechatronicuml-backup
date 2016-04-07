package org.muml.uppaal.adapter.blackbox;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.uppaal.adapter.mtctl.common.MtctlModelElementProvider;
import org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr;

public class MtctlLibrary {
	private MtctlModelElementProvider elementProvider = null; //cached provider (check if its root is correct before using)
	public MtctlLibrary() {}
	
	/**
	 * Returns some fitting instance for the MumlElemExpr if there is one.
	 */
	public EObject inferInstanceFor(MumlElemExpr expr) {
		if (elementProvider == null || elementProvider.getRoot() != MtctlModelElementProvider.getVerifiableElement(expr))
			elementProvider = new MtctlModelElementProvider(MtctlModelElementProvider.getVerifiableElement(expr));
		
		for (EObject instance : elementProvider.getAllInstancesFor(expr.getElem()))
			return instance;
		
		return null;
	}
	
	public Set<EObject> getAllInstancesFor(EObject obj, VerifiableElement verifiableElement) {
		if (elementProvider == null || elementProvider.getRoot() != verifiableElement)
			elementProvider = new MtctlModelElementProvider(verifiableElement);
		return new HashSet<EObject>(elementProvider.getAllInstancesFor(obj));
	}
	
	public Set<EObject> getAllInstancesOf(EObject obj, VerifiableElement verifiableElement) {
		if (elementProvider == null || elementProvider.getRoot() != verifiableElement)
			elementProvider = new MtctlModelElementProvider(verifiableElement);
		return new HashSet<EObject>(elementProvider.getAllInstancesOf(obj));
	}
	
	public Set<EObject> getAllSubinstancesOf(EObject obj, VerifiableElement verifiableElement) {
		if (elementProvider == null || elementProvider.getRoot() != verifiableElement)
			elementProvider = new MtctlModelElementProvider(verifiableElement);
		return new HashSet<EObject>(elementProvider.getAllSubinstancesOf(obj));
	}
	
	public Set<RealtimeStatechart> getAllRTSCs(VerifiableElement verifiableElement) {
		if (elementProvider == null || elementProvider.getRoot() != verifiableElement)
			elementProvider = new MtctlModelElementProvider(verifiableElement);
		return new HashSet<RealtimeStatechart>(elementProvider.getStatecharts());
	}
	
	public Set<MessageBuffer> getAllBuffers(VerifiableElement verifiableElement) {
		if (elementProvider == null || elementProvider.getRoot() != verifiableElement)
			elementProvider = new MtctlModelElementProvider(verifiableElement);
		return new HashSet<MessageBuffer>(elementProvider.getBuffers());
	}
	
	public Set<MessageType> getAllMessageTypes(VerifiableElement verifiableElement) {
		if (elementProvider == null || elementProvider.getRoot() != verifiableElement)
			elementProvider = new MtctlModelElementProvider(verifiableElement);
		return new HashSet<MessageType>(elementProvider.getMessageTypes());
	}
}

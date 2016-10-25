package org.muml.container.transformation.blackbox;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.pim.common.naming.MumlQualifiedNameProvider;
import org.muml.pim.common.naming.QualifiedNameProvider;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

public class ContainerTransformationBlackBox {

	

	public static final QualifiedNameProvider nameProvider = new MumlQualifiedNameProvider();

	public static String getName(EObject obj) {
		String name = nameProvider.getQualifiedName(obj).toString();
		String alphaAndDigits = name.replaceAll("\\W", "");
		return alphaAndDigits;
	}

	/**
	 * This function computes a hash for a SET of EObjects based on their ID
	 * 
	 * @param eobjects
	 * @return
	 */
	public static Short getHash(Collection<Object> objects) {
		ArrayList<Integer> idList = new ArrayList<Integer>();
		for (Object eobject : objects) {
			EObject ob = (EObject) eobject;
			idList.add(EcoreUtil.getURI(ob).hashCode());
		}
		Collections.sort(idList);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		for (Integer id : idList) {
			outputStream.write(id.byteValue());
		}
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] thedigest = md.digest(outputStream.toByteArray());

		ByteBuffer wrapped = ByteBuffer.wrap(thedigest); // big-endian by
															// default
		short shortHashCode = wrapped.getShort(); // 1
		return shortHashCode;

	}
	
	
	/** QVTo blackbox method to get system time for performance measurement
	 * @author upohl
	 * @return long current system time in ms
	 * @param void
	 * */
	public static long getCurrentTime()
	{
		return System.currentTimeMillis();
	}

	public static StructuredResourceInstance getNextHopECU(StructuredResourceInstance startECU,
			StructuredResourceInstance targetECU, HWPlatformInstanceConfiguration rootHWPlatformInstanceConfiguration) {
		return Routing.getNextHopECU(startECU, targetECU, rootHWPlatformInstanceConfiguration);
	}

	public static HWPortInstance getNetworkInterface(StructuredResourceInstance startECU,
			StructuredResourceInstance targetECU, HWPlatformInstanceConfiguration rootHWPlatformInstanceConfiguration) {
		return Routing.getNetworkInterface(startECU, targetECU, rootHWPlatformInstanceConfiguration);
	}
}

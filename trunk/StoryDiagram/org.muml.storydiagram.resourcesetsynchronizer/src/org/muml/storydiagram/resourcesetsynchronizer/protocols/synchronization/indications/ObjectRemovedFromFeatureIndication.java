package org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.indications;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;
import org.muml.storydiagram.resourcesetsynchronizer.ISynchronizerCommand;
import org.muml.storydiagram.resourcesetsynchronizer.SynchronizerAdapter;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.SynchronizerIndicationWithResponse;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.ObjectDeserializer;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.serialization.SerializedObject;
import org.muml.storydiagram.resourcesetsynchronizer.protocols.synchronization.SynchronizationProtocolMessagesEnum;

/**
 * Handle notification that an object was removed from a multi-valued feature.
 * If the object is an EObject and now is not contained anywhere, its UUID
 * mapping is deleted in the EObjectUUIDManager.
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class ObjectRemovedFromFeatureIndication extends SynchronizerIndicationWithResponse
{

	public ObjectRemovedFromFeatureIndication(SignalProtocol<?> protocol, SynchronizerAdapter synchronizerAdapter)
	{
		super(protocol, SynchronizationProtocolMessagesEnum.OBJECT_REMOVED_FROM_FEATURE, synchronizerAdapter);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void doIndicating(ExtendedDataInputStream in) throws Exception
	{
		/*
		 * Receive EObject UUID
		 */
		String eObjectUUID = (String) in.readObject(this.getClass().getClassLoader());

		final EObject eObject = this.getSynchronizerAdapter().getEObjectUUIDManager().getEObject(eObjectUUID);

		assert eObject != null;

		/*
		 * Receive feature name
		 */
		String featureName = (String) in.readObject(this.getClass().getClassLoader());

		final EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);

		assert feature.isMany();
		assert feature.isChangeable();

		/*
		 * Deserialize feature value
		 */
		final SerializedObject serializedObject = (SerializedObject) in.readObject(this.getClass().getClassLoader());

		final ObjectDeserializer deserializer = new ObjectDeserializer(this.getSynchronizerAdapter(), this.getRemoteAdapterUUID());

		/*
		 * Remove element
		 */

		this.getSynchronizerAdapter().getCommandExecutor().executeCommand(new ISynchronizerCommand()
		{
			@Override
			public void execute()
			{
				ObjectRemovedFromFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(false);

				Object value = deserializer.deserializeObject(serializedObject);

				((EList<Object>) eObject.eGet(feature)).remove(value);

				/*
				 * Unregister the EObject and all its contained elements
				 */
				if (feature instanceof EReference)
				{
					if (((EObject) value).eContainer() == null)
					{
						EObject valueEObject = (EObject) value;

						ObjectRemovedFromFeatureIndication.this.getSynchronizerAdapter().getEObjectUUIDManager()
								.unregisterEObjectWithContents(valueEObject);
					}
				}

				ObjectRemovedFromFeatureIndication.this.getSynchronizerAdapter().setForwardNotifications(true);
			}
		});

	}

	@Override
	protected void doResponding(ExtendedDataOutputStream out) throws Exception
	{
		out.writeObject(true);
	}

}

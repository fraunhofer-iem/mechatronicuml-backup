package org.muml.reconfiguration.design.edit.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.common.core.service.ProviderChangeEvent;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

public abstract class AbstractEditPolicyProvider implements IEditPolicyProvider {

    /** All listeners. */
    private List<IProviderChangeListener> listeners = new ArrayList<IProviderChangeListener>(1);

    public void addProviderChangeListener(IProviderChangeListener listener) {
        this.listeners.add(listener);
    }

    public void removeProviderChangeListener(IProviderChangeListener listener) {
        this.listeners.remove(listener);
    }

    protected void fireProviderChanged() {
        ProviderChangeEvent event = new ProviderChangeEvent(this);
        Iterator<IProviderChangeListener> iterListener = this.listeners.iterator();
        while (iterListener.hasNext()) {
            IProviderChangeListener listener = (IProviderChangeListener) iterListener.next();
            listener.providerChanged(event);
        }
    }
}

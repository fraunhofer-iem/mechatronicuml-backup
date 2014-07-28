package de.uni_paderborn.fujaba.export.wizard;

import org.eclipse.ui.IExportWizard;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;

public interface IFujabaExportWizard extends IExportWizard {

    public String wizardGetId();
    public IFujabaExportOperation wizardCreateExportOperation();

}

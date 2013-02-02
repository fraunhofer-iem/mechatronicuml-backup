
public class CustomMyeditorDiagramCreationWizard
    extends FujabaDiagramNewWizard {

  public void init(IWorkbench workbench
      , IStructuredSelection selection) {
    super.init(workbench, selection);
    setWindowTitle(getWindowTitle());
  }

  @Override
  protected String getDiagramFileExtension() {
    return "myeditor_diagram"; //$NON-NLS-1$
  }
  
  @Override
  protected String getModelId() {
    return myeditor.diagram.edit.parts
      .MyEditorDiagramEditPart.MODEL_ID;
  }

  @Override
  protected PreferencesHint getDiagramPreferencesHint() {
    return myeditor.diagram.part
      .MyEditorDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
  }

  @Override
  protected String getEditorId() {
    return myeditor.diagram.part.MyEditorDiagramEditor.ID;
  }

  /**
   * Create a new instance of domain element associated with canvas.
   */
  @Override
  protected EObject createInitialModel() {
    MyEditorDiagram diagram = MyeditorFactory.eINSTANCE
      .createMyEditorDiagram();
    return diagram;
  }

  @Override
  public boolean isValidDiagramElement(EObject object) {
    return ViewService.getInstance().provides(
      new CreateDiagramViewOperation(
        new EObjectAdapter(object),
        myeditor.diagram.edit.parts.MyEditorDiagramEditPart
          .MODEL_ID,
        myeditor.diagram.part.MyEditorDiagramEditorPlugin
          .DIAGRAM_PREFERENCES_HINT
	  )
    );
  }
}
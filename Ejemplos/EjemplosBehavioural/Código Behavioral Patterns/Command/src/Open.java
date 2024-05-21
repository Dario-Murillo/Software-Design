public class Open implements Command {
    private final IEditor editor;

    public Open(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
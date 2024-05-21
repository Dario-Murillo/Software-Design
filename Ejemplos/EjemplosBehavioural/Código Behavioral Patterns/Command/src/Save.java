public class Save implements Command {
    private final IEditor editor;

    public Save(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
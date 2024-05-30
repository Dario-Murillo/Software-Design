public class Close implements Command {
    private final IEditor editor;

    public Close(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
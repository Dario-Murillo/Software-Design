public class CommandMain {
    public static void main(String[] args) throws Exception {
        var editor = new Editor();
        var open = new Open(editor);
        open.perform();

        var save = new Save(editor);
        save.perform();

        var close = new Close(editor);
        close.perform();


        var macro = new Macro();
        macro.record(open);
        macro.record(save);
        macro.record(close);
        macro.perform();

    }
}

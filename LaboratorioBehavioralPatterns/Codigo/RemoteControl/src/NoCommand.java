public class NoCommand implements Command {
    public NoCommand() {
        // Constructor (empty in this case)
    }

    @Override
    public String execute() {
        return "";
    }
}

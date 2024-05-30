import java.util.ArrayList;
import java.util.List;

public class Macro implements Command {
    private final List<Command> actions;

    public Macro() {
        actions = new ArrayList<Command>();
    }

    public void record(Command action) {
        actions.add(action);
    }

    @Override
    public void perform() {
        System.out.println("Executing macro");
        actions.forEach(Command::perform);
    }
}
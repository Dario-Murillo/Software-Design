/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class NoCommand implements Command {
    public NoCommand() {
        // Constructor (empty in this case)
    }

    @Override
    public String execute() {
        return "";
    }
}

/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */
public class GarageDoorDownCommand implements Command {
  private GarageDoor garageDoor;
  
  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public String execute() {
    return garageDoor.up();
  }
  
}

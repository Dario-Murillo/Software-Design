/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class GarageDoorUpCommand implements Command {

  private GarageDoor garageDoor;
  
  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public String execute() {
    return garageDoor.up();
  }
  
}

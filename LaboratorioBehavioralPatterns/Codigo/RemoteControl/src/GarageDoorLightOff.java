/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */
public class GarageDoorLightOff implements Command {

  private GarageDoor garageDoor;

  public GarageDoorLightOff(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  @Override
  public String execute() {
    return this.garageDoor.lightOff();
  }
  
}

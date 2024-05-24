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

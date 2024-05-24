public class GaraDoorLightOn implements Command {

  private GarageDoor garageDoor;

  public GaraDoorLightOn(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  @Override
  public String execute() {
    return this.garageDoor.lightOn();
  }
  
}

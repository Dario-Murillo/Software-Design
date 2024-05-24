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

/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class StereoOnCommand implements Command {
  Stereo stereo;
  public StereoOnCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public String execute() {
    return this.stereo.on() + "\n" + this.stereo.setCD() + "\n" + this.stereo.setVolume(15);
  }
}

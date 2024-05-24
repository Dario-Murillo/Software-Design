public class StereoOffCommand implements Command {
  Stereo stereo;
  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public String execute() {
    return this.stereo.off();
  }
}

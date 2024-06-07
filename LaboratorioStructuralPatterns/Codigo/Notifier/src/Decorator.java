public class Decorator extends Notifier {
  protected Notifier notifier;

  public Decorator(Notifier notifier) {
    this.notifier = notifier;
  }

  @Override
  public void send(String message) {
    notifier.send(message);
  }
}

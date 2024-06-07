public class MsmNotifier extends Decorator {

  public MsmNotifier(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    System.out.println("Sending from MSM: \n" +  message);
    notifier.send(message);
  }
}

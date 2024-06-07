public class SlackNotifier extends Decorator {

  public SlackNotifier(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    System.out.println("Sending from Slack: \n" +  message);
    notifier.send(message);
  }
}

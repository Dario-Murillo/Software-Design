public class FacebookNotifier extends Notifier {

  @Override
  public void send(String message) {
    System.out.println("Sending from Facebook: \n" +  message);
  }
  
}

public class SmsRouter implements RouterStrategy {
    @Override
    public void route(Message msg) {
        // implementation details
        System.out.println("Sms routing for '" + msg.getMessage() + "'.");
    }
}
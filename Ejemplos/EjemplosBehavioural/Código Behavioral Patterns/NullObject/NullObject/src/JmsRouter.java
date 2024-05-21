public class JmsRouter implements RouterStrategy {
    @Override
    public void route(Message msg) {
        // implementation details
        System.out.println("Jms routing for '" + msg.getMessage() + "'.");
    }
}
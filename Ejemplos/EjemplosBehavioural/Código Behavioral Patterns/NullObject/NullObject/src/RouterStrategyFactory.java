public class RouterStrategyFactory {
    public static RouterStrategy getRouterForMessage(Message message){
        return switch (message.getPriority()){
            case HIGH -> new SmsRouter();
            case MEDIUM -> new JmsRouter();
            default -> new NullRouter(); // null; // throw new IllegalArgumentException("Unexpected value: " + message.getPriority());
        };
    }
}

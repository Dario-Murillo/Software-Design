public class NullObjectMain {
    public static void main(String[] args) throws Exception {
        Message highPriorityMessage = new Message("high message", PriorityEnum.HIGH);
        Message mediumPriorityMessage = new Message("medium message", PriorityEnum.MEDIUM);
        //Message lowPriorityMessage = new Message("medium message", PriorityEnum.LOW);
        //Message noPriorityMessage = new Message("message without priority");

        var router = RouterStrategyFactory.getRouterForMessage(highPriorityMessage);
        router.route(highPriorityMessage);
        router = RouterStrategyFactory.getRouterForMessage(mediumPriorityMessage);
        router.route(mediumPriorityMessage);
        // router = RouterStrategyFactory.getRouterForMessage(lowPriorityMessage);
        // router.route(lowPriorityMessage);
        // router = RouterStrategyFactory.getRouterForMessage(noPriorityMessage);
        // router.route(noPriorityMessage);
    }
}

public class OnlineOrderCreator extends OrderHandlerCreator {
    public OrderHandler createHandler() {
        return new OnlineOrderHandler();
    }
}
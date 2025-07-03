public class InStoreOrderCreator extends OrderHandlerCreator {
    public OrderHandler createHandler() {
        return new InStoreOrderHandler();
    }
}
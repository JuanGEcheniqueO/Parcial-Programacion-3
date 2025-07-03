public abstract class OrderProcessorBase {
    public final void processOrder(Order order) {
        validate(order);
        getPaymentDetails(order);
        pay(order);
        notifyCustomer(order);
    }

    protected void validate(Order order) {
        System.out.println("Validando pedido...");
    }

    protected abstract void getPaymentDetails(Order o);
    protected abstract void pay(Order o);

    protected void notifyCustomer(Order o) {
        System.out.println("Notificando al cliente...");
    }
}
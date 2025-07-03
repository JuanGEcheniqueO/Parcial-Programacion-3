public class PrepareOrderCommand implements Command {
    private Order order;
    private KitchenService kitchen;

    public PrepareOrderCommand(Order order, KitchenService kitchen) {
        this.order = order;
        this.kitchen = kitchen;
    }

    public void execute() {
        kitchen.sendToPrepare(order);
    }
}
public class OrderServiceProxy implements OrderService {
    private OrderService real;

    public OrderServiceProxy(OrderService real) {
        this.real = real;
    }

    public void processOrder(Order o, User u) {
        if (!u.getRole().equals("Admin") && u.getId() != o.getCustomerId()) {
            System.out.println("No autorizado");
            return;
        }
        real.processOrder(o, u);
    }
}
public class OnlineOrderProcessor extends OrderProcessorBase {
    protected void getPaymentDetails(Order order) {
        System.out.println("Obteniendo datos de pago online...");
    }

    protected void pay(Order order) {
        System.out.println("Procesando pago online...");
    }
}
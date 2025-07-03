public class EmailNotifier implements Observer {
    public void update(String msg) {
        System.out.println("Correo: " + msg);
    }
}
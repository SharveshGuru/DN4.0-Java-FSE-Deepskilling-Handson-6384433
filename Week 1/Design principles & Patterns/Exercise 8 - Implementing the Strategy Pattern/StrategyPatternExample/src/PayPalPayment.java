public class PayPalPayment implements PaymentStrategy {
    private String id;

    public PayPalPayment(String id) {
        this.id = id;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + id);
    }  
}

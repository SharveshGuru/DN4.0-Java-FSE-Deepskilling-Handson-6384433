public class App {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        
        paymentContext.setPaymentStrategy(new PayPalPayment("31231saff"));
        paymentContext.pay(100.0);

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.pay(200.0);
    }
}

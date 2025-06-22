public class App {
    public static void main(String[] args) throws Exception {
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(150.00);

        RazorpayGateway razorpay = new RazorpayGateway();
        PaymentProcessor razorpayProcessor = new RazorpayAdapter(razorpay); 
        razorpayProcessor.processPayment(200.00);
    }
}

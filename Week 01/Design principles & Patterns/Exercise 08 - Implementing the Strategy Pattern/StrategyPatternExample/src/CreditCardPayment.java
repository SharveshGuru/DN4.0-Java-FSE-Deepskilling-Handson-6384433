public class CreditCardPayment implements PaymentStrategy {
    private String cardNo;

    public CreditCardPayment(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNo);
    }  
}

package parking;

public class PaymentFactory {
    public Payment createPayment(String paymentType) {
        switch (paymentType) {
            case "Cash":
                return new CashPayment();
            case "Card":
                return new CardPayment();
            default:
                return null;
        }
    }
}

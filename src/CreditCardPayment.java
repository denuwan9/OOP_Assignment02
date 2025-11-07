public class CreditCardPayment extends CardPayment implements Discount {
    private double discountedAmount;

    public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolder, String expiryDate) {
        super(amount, currency, cardNumber, cardHolder, expiryDate);
        this.discountedAmount = amount;
    }

    @Override
    public void processPayment() {
        if (validate()) {
            status = "Paid via Credit Card";
            System.out.println("Processing Credit Card Payment of " + discountedAmount + " " + currency);
        } else {
            status = "Validation Failed";
        }
    }

    @Override
    public double applyDiscount(double percent) {
        discountedAmount = amount * (1 - percent / 100);
        System.out.println("Discount applied: " + percent + "%");
        return discountedAmount;
    }

    @Override
    public double finalAmount() {
        return discountedAmount;
    }
}

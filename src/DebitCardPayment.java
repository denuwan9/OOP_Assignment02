public class DebitCardPayment extends CardPayment implements Discount {
    private double discountedAmount;

    public DebitCardPayment(double amount, String currency, String cardNumber, String cardHolder, String expiryDate) {
        super(amount, currency, cardNumber, cardHolder, expiryDate);
        this.discountedAmount = amount;
    }

    @Override
    public void processPayment() {
        if (validate()) {
            status = "Paid via Debit Card";
            System.out.println("Processing Debit Card Payment of " + discountedAmount + " " + currency);
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

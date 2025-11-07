public abstract class CardPayment extends Payment {
    protected String cardNumber;
    protected String cardHolder;
    protected String expiryDate;

    public CardPayment(double amount, String currency, String cardNumber, String cardHolder, String expiryDate) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean validate() {
        System.out.println("Validating Card Details...");
        return cardNumber != null && !cardNumber.isEmpty() &&
                cardHolder != null && !cardHolder.isEmpty() &&
                expiryDate != null && !expiryDate.isEmpty();
    }
}

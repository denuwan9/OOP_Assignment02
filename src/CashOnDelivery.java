public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public boolean validate() {
        System.out.println("Validating Cash on Delivery details...");
        return amount > 0;
    }

    @Override
    public void processPayment() {
        if (validate()) {
            status = "Cash Payment to be collected on delivery";
            System.out.println("Processing Cash on Delivery for " + amount + " " + currency);
        } else {
            status = "Validation Failed";
        }
    }
}

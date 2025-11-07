import java.util.UUID;

public abstract class Payment implements Payable {
    protected double amount;
    protected String currency;
    protected String status;
    protected String referenceId;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "Pending";
        this.referenceId = "TXN-" + UUID.randomUUID().toString().substring(0, 6);
    }


    public abstract void processPayment();

    // Concrete method
    public void generateReceipt() {
        System.out.println("----- Payment Receipt -----");
        System.out.println("Reference ID: " + referenceId);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }

    @Override
    public String getReference() {
        return referenceId;
    }


}

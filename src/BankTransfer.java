public class BankTransfer extends Payment {
    private String bankAccountNumber;

    public BankTransfer(double amount, String currency, String bankAccountNumber) {
        super(amount, currency);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean validate() {
        System.out.println("Validating Bank Transfer...");
        return bankAccountNumber != null && !bankAccountNumber.isEmpty();
    }

    @Override
    public void processPayment() {
        if (validate()) {
            status = "Transferred";
            System.out.println("Bank Transfer successful from account: " + bankAccountNumber);
        } else {
            status = "Validation Failed";
        }
    }
}

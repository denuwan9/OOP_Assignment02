//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Cash on Delivery
        Payment cod = new CashOnDelivery(5000, "LKR");
        cod.processPayment();
        cod.generateReceipt();
        System.out.println();

        // Bank Transfer
        Payment bank = new BankTransfer(10000, "LKR", "123456789");
        bank.processPayment();
        bank.generateReceipt();
        System.out.println();

        // Credit Card Payment with Discount
        CreditCardPayment credit = new CreditCardPayment(20000, "LKR", "4111111111111111", "John Doe", "12/26");
        credit.applyDiscount(10);
        credit.processPayment();
        credit.generateReceipt();
        System.out.println("Final Credit Amount: " + credit.finalAmount());
        System.out.println();

        // Debit Card Payment with Discount
        DebitCardPayment debit = new DebitCardPayment(15000, "LKR", "5111111111111111", "Jane Doe", "11/25");
        debit.applyDiscount(5);
        debit.processPayment();
        debit.generateReceipt();
        System.out.println("Final Debit Amount: " + debit.finalAmount());
        System.out.println();

        // Demonstrate Payable Interface Polymorphism
        Payable payable = new BankTransfer(2500, "LKR", "99887766");
        System.out.println("Reference: " + payable.getReference());
        System.out.println("Is Valid: " + payable.validate());
    }
}
public class BankTransfer extends Payment {


    String bankName;
    String accountNumber;
    String referenceCode;


    public BankTransfer(double amount, String currency, String bankName, String accountNumber, String referenceCode) {

        super(amount, currency);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;


    }


    public void processPayment() {
        System.out.println("Initiating bank transfer to" + bankName +"using account" + accountNumber + "with refernce" + referenceCode);
        markAsCompleted();
    }



}

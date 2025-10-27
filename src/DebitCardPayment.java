public class DebitCardPayment extends CardPayment {

    double availableBalance;

    public DebitCardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate, double availableBalance) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.availableBalance = availableBalance;

    }


    public void checkSufficientBalance() {
        System.out.println("Checking if balance covers amount");

    }

}

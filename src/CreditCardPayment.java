public class CreditCardPayment extends CardPayment {

    double creditLimit;

    public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate, double creditLimit) {
        super(amount, currency, cardNumber, cardHolderName, expiryDate);
        this.creditLimit = creditLimit;

    }


    public void applyInterest() {
        System.out.println("Applying interest if payment is not settled by due date");

    }

}

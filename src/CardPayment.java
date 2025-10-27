public class CardPayment extends Payment {

    String cardNumber;
    String cardHolderName;
    String expiryDate;

    public CardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate) {
        super(amount, currency);
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;

    }

    public void processPayment() {

        System.out.println("Authorizing card payment for" +  cardHolderName);

    }

    public void validateCard(){
        System.out.println("Validating card number format...");
    }


}



import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Payment> payments = new ArrayList<>();

        CashOnDelivery cod1 = new CashOnDelivery(450, "LKR", "34/1, Weliamda");
        BankTransfer bankTr1 = new BankTransfer(2300, "LKR", "BOC", "2343333", "234");
        CreditCardPayment cr1 = new CreditCardPayment(5349.34, "LKR", "2345733332", "upul K", "2025/12/02", 50000.34);

        cod1.processPayment();
        bankTr1.processPayment();
        cr1.processPayment();

//looping
        payments.add(cod1);
        payments.add(bankTr1);
        payments.add(cr1);

      for(Payment payment :payments){
          payment.processPayment();
      }



    }
}

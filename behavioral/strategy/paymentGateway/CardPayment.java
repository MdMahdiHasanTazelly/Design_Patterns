public class CardPayment implements PaymentStrategy {
    private String cardNumber;

    public CardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void pay(int amount){
        System.out.println("Paid "+amount+" through Card "+cardNumber);
    }
}

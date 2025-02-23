public class PaypalPayment implements PaymentStrategy{
    private String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    public void pay(int amount){
        System.out.println("Paid "+amount+" through Paypal "+email);
    }
}
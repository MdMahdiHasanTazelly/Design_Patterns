public class Main {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext();

        payment.setPaymentStrategy( new CardPayment("123-xs-2-a") );
        payment.checkOut(1200);

        payment.setPaymentStrategy(new PaypalPayment("x@gmail.com") );
        payment.checkOut(2400);
    }
}

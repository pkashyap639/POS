package Payment;

public class CashPayment extends Payment{

    @Override
    public void processPayment(double totalAmount) {
        System.out.println("");
    }

    @Override
    public void processPayment(double totalAmount, double givenAmount) {
        System.out.println("Received : "+givenAmount);
        System.out.println("Returned: "+(givenAmount-totalAmount));
    }
}

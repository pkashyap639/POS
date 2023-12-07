package Payment;

public abstract class Payment {
    public abstract void processPayment(double amount);
    public abstract void processPayment(double amount, double givenAmount);
}

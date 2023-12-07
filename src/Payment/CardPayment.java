package Payment;

public class CardPayment extends Payment{
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Accepted : "+amount+" by Card Number: "+cardNumber);
    }

    @Override
    public void processPayment(double amount, double givenAmount) {
        processPayment(amount);
    }
}

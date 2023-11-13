package domain.models;

class MasterCardPayment implements PaymentOptionInterface {
    private String cardNumber;
    private String cardHolder;
    private String expirationDate;
    private String cvv;

    public MasterCardPayment(String cardNumber, String cardHolder, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(float amount) {
        System.out.printf("Processing MasterCard payment of $%.2f for %s%n", amount, cardHolder);
        return true;
    }
}
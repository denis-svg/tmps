package domain.models;

// Visa payment strategy
class VisaPayment implements PaymentOptionInterface {
    private String cardNumber;
    private String cardHolder;
    private String expirationDate;
    private String cvv;

    public VisaPayment(String cardNumber, String cardHolder, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(float amount) {
        System.out.printf("Processing Visa payment of $%.2f for %s%n", amount, cardHolder);
        return true;
    }
}



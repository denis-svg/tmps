package domain.models;

public class VisaPaymentBuilder implements PaymentOptionBuilder {
    private String cardNumber = "";
    private String cardHolder = "";
    private String expirationDate = "";
    private String cvv = "";

    public VisaPaymentBuilder setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public VisaPaymentBuilder setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
        return this;
    }

    public VisaPaymentBuilder setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public VisaPaymentBuilder setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    @Override
    public VisaPayment build() {
        return new VisaPayment(cardNumber, cardHolder, expirationDate, cvv);
    }
}

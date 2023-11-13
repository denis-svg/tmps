package domain.models;

class MasterCardPaymentBuilder implements PaymentOptionBuilder {
    private String cardNumber = "";
    private String cardHolder = "";
    private String expirationDate = "";
    private String cvv = "";

    public MasterCardPaymentBuilder setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public MasterCardPaymentBuilder setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
        return this;
    }

    public MasterCardPaymentBuilder setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public MasterCardPaymentBuilder setCvv(String cvv) {
        this.cvv = cvv;
        return this;
    }

    @Override
    public MasterCardPayment build() {
        return new MasterCardPayment(cardNumber, cardHolder, expirationDate, cvv);
    }
}

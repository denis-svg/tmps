package domain.models;

// PaymentStrategy interface
public interface PaymentOptionInterface {
    public boolean processPayment(float amount);
}

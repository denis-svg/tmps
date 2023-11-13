package domain.models.products;

// Concrete Implementor
public class FixedAmountDiscount implements Promotion {
    private float amount;

    public FixedAmountDiscount(float amount) {
        this.amount = amount;
    }

    @Override
    public float applyDiscount(float originalPrice) {
        return originalPrice - amount;
    }
}
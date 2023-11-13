package domain.models.products;

// Concrete Implementors
public class PercentageDiscount implements Promotion {
    private float percentage;

    public PercentageDiscount(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public float applyDiscount(float originalPrice) {
        return originalPrice - (originalPrice * percentage / 100);
    }
}

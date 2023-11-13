package domain.models.products;

public interface ProductInterface {
    public float getPrice();
    public void modifyPrice(float new_price);
    public String getTitle();
    public ProductInterface copy();
    public Promotion getPromotion();
}

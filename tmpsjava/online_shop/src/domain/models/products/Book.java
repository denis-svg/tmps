package domain.models.products;

public class Book implements ProductInterface{
    final private String title;
    private float price;

    private Promotion promotion;

    public Book(String title, float price, Promotion promotion){
        this.title = title;
        this.price = price;
        this.promotion = promotion;
    }

    @Override
    public float getPrice() {
        return this.promotion.applyDiscount(this.price);
    }

    @Override
    public void modifyPrice(float new_price) {
        this.price = new_price;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public ProductInterface copy() {
        return (ProductInterface) new Book(this.title, this.price, this.promotion);
    }

    @Override
    public Promotion getPromotion() {
        return promotion;
    }
}

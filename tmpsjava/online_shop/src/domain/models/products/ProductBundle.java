package domain.models.products;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements ProductInterface {
    private List<ProductInterface> products;

    public ProductBundle() {
        this.products = new ArrayList<>();
    }

    public void addProduct(ProductInterface product) {
        this.products.add(product);
    }

    @Override
    public float getPrice() {
        float totalPrice = 0;
        for (ProductInterface product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void modifyPrice(float new_price) {
        // Adjust prices of individual products in the bundle
        for (ProductInterface product : products) {
            product.modifyPrice(new_price);
        }
    }

    @Override
    public String getTitle() {
        // Generate a title for the bundle
        StringBuilder bundleTitle = new StringBuilder("Bundle: ");
        for (ProductInterface product : products) {
            bundleTitle.append(product.getTitle()).append(", ");
        }
        return bundleTitle.toString();
    }

    @Override
    public ProductInterface copy() {
        // Create a copy of the bundle
        ProductBundle copyBundle = new ProductBundle();
        for (ProductInterface product : products) {
            copyBundle.addProduct(product.copy());
        }
        return copyBundle;
    }

    @Override
    public Promotion getPromotion() {
        return null;
    }

    public List<ProductInterface> getItems() {
        return this.products;
    }

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers(String message) {

    }
}